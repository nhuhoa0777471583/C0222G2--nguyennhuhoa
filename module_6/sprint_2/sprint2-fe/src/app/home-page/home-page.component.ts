import {Component, OnInit} from '@angular/core';
import {ProductService} from '../service/ProductService';
import {Product} from '../model/Product';
import {Title} from '@angular/platform-browser';
import {CookieService} from '../login/service/cookie.service';
import {Category} from '../model/Category';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {
  productList: Product[] = [];
  productNearDayList: Product[] = [];
  role: string = '';
  username: string = '';
  token: string = '';
  page: number;
  totalPage: number;
  countTotalPage: number[];
  numberPage: number = 0;

  categoryList: Category [] = [];


  constructor(private productService: ProductService,
              private tile: Title,
              private cookieService: CookieService) {
    this.tile.setTitle('Trang chủ');

    this.role = this.readCookieService('role');
    this.username = this.readCookieService('username');
    this.token = this.readCookieService('jwToken');
  }

  ngOnInit(): void {
    this.getAll(this.numberPage);
    this.getAllCategory();
    this.getProductNearDay();
  }

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  private getAll(numberPage: number) {
    this.productService.getAll(numberPage).subscribe(d => {
      // @ts-ignore
      this.productList = d.content;
      // @ts-ignore
      this.totalPage = d.totalPages;
      // @ts-ignore
      this.countTotalPage = new Array(d.totalPages);
      // @ts-ignore
      this.numberPage = d.number;
    });
  }

  previousPage(event) {
    window.scroll({
      top: 1300,
      left: 0,
      behavior: 'smooth'
    });
    let number: number = this.numberPage;
    if (number > 0) {
      number--;
      this.getAll(number);
    }
  }

  nextPage(event) {
    window.scroll({
      top: 1300,
      left: 0,
      behavior: 'smooth'
    });
    let number: number = this.numberPage;
    if (number < this.totalPage) {
      number++;
      this.getAll(number);
    }
  }

  goItem(page: number) {
    this.numberPage = page;
    this.getAll(page);
  }


  private getProductNearDay() {
    this.productService.getProductNearDay().subscribe(d => {
      this.productNearDayList = d;
    });
  }


  private getAllCategory() {
    this.productService.getAllCategory().subscribe(data => {
      this.categoryList = data;

    })
  }


}
