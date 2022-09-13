import {Component, OnInit} from '@angular/core';
import {ProductService} from '../service/ProductService';
import {Product} from '../model/Product';
import {Title} from '@angular/platform-browser';
import {CookieService} from '../login/service/cookie.service';
import {log} from 'util';
import {ToastrService} from 'ngx-toastr';

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
  firstPrice: string = '9999999999';
  sort: string = 'id';
  public nameProduct = '';

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
    this.getLaptop(this.numberPage, this.nameProduct, this.beforePrice, this.firstPrice, this.sort);
  }

  getLaptop(numberPage: number, nameProduct: string, beforePrice: string, firstPrice: string, sort: string) {
    this.productService.getLaptop(numberPage, nameProduct, beforePrice, firstPrice, sort).subscribe(data => {
      // @ts-ignore
      this.laptopList = data.content;
      // @ts-ignore
      this.totalPage = data.totalPages;
      console.log(this.totalPage);
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
      this.getLaptop(number, this.nameProduct, this.beforePrice, this.firstPrice, this.sort);
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
      this.getLaptop(number, this.nameProduct, this.beforePrice, this.firstPrice, this.sort);
    }

  }

  goItem(page: number) {
    this.numberPage = page;
    this.getLaptop(0, this.nameProduct, this.beforePrice, this.firstPrice, this.sort);
  }

  searchPrice(before: string, first: string) {
    this.beforePrice = before;
    this.firstPrice = first;
    this.getLaptop(0, this.nameProduct, this.beforePrice, this.firstPrice, this.sort);
  }

  searchName(name: string) {
    this.nameProduct = name;
    this.getLaptop(this.numberPage, this.nameProduct, this.beforePrice, this.firstPrice, this.sort);
  }


  sortPriceDesc(priceDesc: string) {
    this.getLaptop(this.numberPage, this.nameProduct, this.beforePrice, this.firstPrice, priceDesc);
  }

  sortPriceAsc(priceAsc: string) {
    this.getLaptop(this.numberPage, this.nameProduct, this.beforePrice, this.firstPrice, priceAsc);
  }
}
