import {Component, OnInit} from '@angular/core';
import {ProductService} from '../service/ProductService';
import {Product} from '../model/Product';
import {ActivatedRoute} from '@angular/router';
import {Title} from '@angular/platform-browser';
import {CookieService} from '../login/service/cookie.service';

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
  page:number = 0;
  namePhone = '';
  beforePrice: string  = '0';
  firstPrice: string = '9999999999';
  sort: string = 'id';

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
    this.getPhone(this.numberPage, this.namePhone, this.beforePrice, this.firstPrice, this.sort);
  }

  private getPhone(page: number, namePhone: string, beforePrice: string, firstPrice: string, sort: string) {
    this.productService.getPhone(page, namePhone, beforePrice, firstPrice, sort).subscribe(d => {
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
      this.getPhone(number, this.namePhone, this.beforePrice, this.firstPrice, this.sort);
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
      this.getPhone(number, this.namePhone, this.beforePrice, this.firstPrice, this.sort);
    }
  }

  goItem(page: number) {
    this.numberPage = page;
    this.getPhone(page, this.namePhone, this.beforePrice, this.firstPrice, this.sort);
  }


  searchPrice(before: string, first: string) {
    this.beforePrice = before;
    this.firstPrice = first;
    this.getPhone(0, this.namePhone, this.beforePrice, this.firstPrice, this.sort);
  }

  searchName(name: string) {
    this.namePhone = name;
    this.getPhone(this.numberPage, this.namePhone, this.beforePrice, this.firstPrice, this.sort);
  }


  sortPriceDesc(priceDesc: string) {
    this.getPhone(this.numberPage, this.namePhone, this.beforePrice, this.firstPrice, priceDesc);
  }

  sortPriceAsc(priceAsc: string) {
    this.getPhone(this.numberPage, this.namePhone, this.beforePrice, this.firstPrice, priceAsc);
  }
}
