import {Component, OnInit} from '@angular/core';
import {ProductService} from '../service/ProductService';
import {Product} from '../model/Product';
import {Title} from '@angular/platform-browser';
import {CookieService} from '../login/service/cookie.service';
import {ToastrService} from 'ngx-toastr';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-laptop',
  templateUrl: './laptop.component.html',
  styleUrls: ['./laptop.component.css']
})
export class LaptopComponent implements OnInit {
  laptopList: Product[] = [];
  role: string = '';
  username: string = '';
  token: string = '';

  page: number = 0;
  totalPage: number;
  countTotalPage: number[];
  numberPage: number = 0;
  beforePrice: string = '0';
  afterPrice: string = '9999999999';
  sort: string = '';
  nameLaptop = '';
  formSearch: FormGroup;
  nameSearch: string = '';

  constructor(private productService: ProductService,
              private tile: Title,
              private cookieService: CookieService, private toas: ToastrService) {
    this.tile.setTitle('Laptop');
    this.role = this.readCookieService('role');
    this.username = this.readCookieService('username');
    this.token = this.readCookieService('jwToken');
  }

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  ngOnInit(): void {
    this.getLaptopAll(this.numberPage, this.nameSearch, this.nameLaptop, this.beforePrice, this.afterPrice, this.sort);
    this.searchForm();
  }

  getLaptopAll(numberPage: number, nameSearch: string, nameLaptop: string, beforePrice: string, afterPrice: string, sort: string) {
    this.productService.getLaptop(numberPage, nameSearch, nameLaptop, beforePrice, afterPrice, sort).subscribe(data => {
      // @ts-ignore
      this.laptopList = data.content;
      // @ts-ignore
      this.totalPage = data.totalPages;
      // @ts-ignore
      this.countTotalPage = new Array(data.totalPages);
      // @ts-ignore
      this.numberPage = data.number;
      // @ts-ignore
      this.size = data.size;
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
      this.getLaptopAll(number, this.nameSearch, this.nameLaptop, this.beforePrice, this.afterPrice, this.sort);
    }
  }

  nextPage(event) {
    window.scroll({
      top: 100,
      left: 0,
      behavior: 'smooth'
    });
    let number: number = this.numberPage;
    if (number < this.totalPage) {
      number++;
      this.getLaptopAll(number, this.nameSearch, this.nameLaptop, this.beforePrice, this.afterPrice, this.sort);

    }

  }

  goItem(page: number) {
    this.numberPage = page;
    this.getLaptopAll(0, this.nameSearch, this.nameLaptop, this.beforePrice, this.afterPrice, this.sort);
  }

  searchPrice(before: string, after: string, event) {
    window.scroll({
      top: 100,
      left: 0,
      behavior: 'smooth'
    });
    this.beforePrice = before;
    this.afterPrice = after;
    this.getLaptopAll(0, this.nameSearch, this.nameLaptop, this.beforePrice, this.afterPrice, this.sort);
  }

  searchName(name: string, event) {
    window.scroll({
      top: 100,
      left: 0,
      behavior: 'smooth'
    });
    this.nameLaptop = name;
    this.getLaptopAll(this.numberPage, this.nameSearch, this.nameLaptop, this.beforePrice, this.afterPrice, this.sort);
  }


  sortPriceDesc() {
    this.sort = 'price_sale,desc';
    this.getLaptopAll(this.numberPage, this.nameSearch, this.nameLaptop, this.beforePrice, this.afterPrice, this.sort);
  }

  sortPriceAsc() {
    this.sort = 'price_sale,asc';
    this.getLaptopAll(this.numberPage, this.nameSearch, this.nameLaptop, this.beforePrice, this.afterPrice, this.sort);
  }

  searchForm() {
    this.formSearch = new FormGroup({
      nameSearch: new FormControl('')
    });
  }

  searchNameProduct() {
    this.nameSearch = this.formSearch.value.nameSearch.trim();
    this.productService.getLaptop(this.numberPage, this.nameSearch, this.nameLaptop, this.beforePrice, this.afterPrice, this.sort).subscribe(d => {
        console.log(this.formSearch.value.nameSearch);
        // @ts-ignore
        this.laptopList = d.content;
        console.log(d);
      }
    );
  }
}
