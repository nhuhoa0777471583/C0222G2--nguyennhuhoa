import {Component, OnInit} from '@angular/core';
import {ProductService} from '../service/ProductService';
import {Product} from '../model/Product';
import {ActivatedRoute} from '@angular/router';
import {Title} from '@angular/platform-browser';
import {CookieService} from '../login/service/cookie.service';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-smart-phone',
  templateUrl: './smart-phone.component.html',
  styleUrls: ['./smart-phone.component.css']
})
export class SmartPhoneComponent implements OnInit {
  phoneList: Product[] = [];
  p: number = 0;
  role: string = '';
  username: string = '';
  token: string = '';
  totalPage: number;
  countTotalPage: number[];
  numberPage: number = 0;
  size: number;
  page: number = 0;
  namePhone = '';
  beforePrice: string = '0';
  afterPrice: string = '9999999999';
  sort: string = '';
  nameSearch: string = '';
  formSearch: FormGroup;

  constructor(private productService: ProductService,
              private tile: Title,
              private cookieService: CookieService) {
    this.tile.setTitle('Điện thoại');
    this.role = this.readCookieService('role');
    this.username = this.readCookieService('username');
    this.token = this.readCookieService('jwToken');
  }

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  ngOnInit(): void {
    this.getPhone(this.numberPage, this.nameSearch, this.namePhone, this.beforePrice, this.afterPrice, this.sort);
    this.formNameSearch();
  }

  private getPhone(page: number, nameSearch: string, namePhone: string, beforePrice: string, afterPrice: string, sort: string) {
    this.productService.getPhone(page, nameSearch, namePhone, beforePrice, afterPrice, sort).subscribe(d => {
      // @ts-ignore
      this.phoneList = d.content;
      // @ts-ignore
      this.totalPage = d.totalPages;
      // @ts-ignore
      this.countTotalPage = new Array(d.totalPages);
      // @ts-ignore
      this.numberPage = d.number;
      // @ts-ignore
      this.size = d.size;


    });
  }

  previousPage(event) {
    window.scroll({
      top: 100,
      left: 0,
      behavior: 'smooth'
    });
    let number: number = this.numberPage;
    if (number > 0) {
      number--;
      this.getPhone(number, this.nameSearch, this.namePhone, this.beforePrice, this.afterPrice, this.sort);
    }
  }

  nextPage(event) {
    window.scroll({
      top: 100,
      left: 0,
      behavior: 'smooth'
    });
    let number: number = this.numberPage;
    console.log(number);
    if (number < this.totalPage) {
      number++;
      this.getPhone(number, this.nameSearch, this.namePhone, this.beforePrice, this.afterPrice, this.sort);
    }
  }

  goItem(page: number) {
    this.numberPage = page;
    this.getPhone(page, this.nameSearch, this.namePhone, this.beforePrice, this.afterPrice, this.sort);
  }


  searchPrice(before: string, after: string) {
    this.beforePrice = before;
    this.afterPrice = after;
    this.getPhone(this.numberPage, this.nameSearch, this.namePhone, this.beforePrice, this.afterPrice, this.sort);
  }

  searchName(name: string) {
    this.namePhone = name;
    this.getPhone(this.numberPage, this.nameSearch, this.namePhone, this.beforePrice, this.afterPrice, this.sort);
  }


  sortPriceDesc() {
    this.sort = 'price_sale,desc';
    this.getPhone(this.numberPage, this.nameSearch, this.namePhone, this.beforePrice, this.afterPrice, this.sort);
  }

  sortPriceAsc() {
    this.sort = 'price_sale,asc';
    this.getPhone(this.numberPage, this.nameSearch, this.namePhone, this.beforePrice, this.afterPrice, this.sort);
  }

  formNameSearch() {
    this.formSearch = new FormGroup({
      key: new FormControl('')
    });
  }

  searchNameProduct() {
    this.nameSearch = this.formSearch.value.key.trim()
    this.productService.getPhone(this.numberPage, this.nameSearch,
      this.namePhone, this.beforePrice, this.afterPrice, this.sort).subscribe(d => {
      // @ts-ignore
      this.phoneList = d.content;
    });

  }


}
