import {Injectable} from '@angular/core';
import {environment} from '../../environments/environment';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Product} from '../model/Product';
import {CookieService} from '../login/service/cookie.service';
import {Category} from '../model/Category';
import {Cart} from '../model/Cart';


const API_URL = `${environment.apiUrl}`;


// @ts-ignore
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private PRODUCT = API_URL + 'product/page';
  private CATEGORY = API_URL + 'category';
  private LAPTOP = API_URL + 'laptop/page';
  private PHONE = API_URL + 'phone/page';
  private NEAR_DAY = API_URL + 'near-day';
  private DETAIL = API_URL + 'detail/';
  private CART = API_URL + 'cart';
  private TOTAL_PAYMENT = API_URL + 'cart/total';
  private FIND_BY_ID = API_URL + 'cart/find-by-id/';
  private SEARCH_BY_NAME = API_URL + 'get-product-by-name/';
  private DELETE = API_URL + 'delete/';
  private ADD_CART = API_URL + 'add/cart';
  private header = 'Bearer ' + this.cookieService.getCookie('jwToken');

  constructor(private httpClient: HttpClient, private cookieService: CookieService) {
  }

  addOrder(productOrder: Cart): Observable<Cart> {
    return this.httpClient.post(this.ADD_CART, productOrder, {headers: new HttpHeaders({'authorization': this.header})}).pipe();
  }

  getProductByName(name: string): Observable<Product> {
    return this.httpClient.get<Product>(this.SEARCH_BY_NAME + name, {headers: new HttpHeaders({'authorization': this.header})}).pipe();
  }

  getAll(page: number): Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.PRODUCT + `?page=${page}`, {headers: new HttpHeaders({'authorization': this.header})}).pipe();
  }

  getProduct(page: number, nameSearch: string, beforePrice: string, afterPrice: string): Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.PRODUCT + '?page=' + page + '&nameSearch=' + nameSearch + '&beforePrice=' + beforePrice + '&afterPrice=' + afterPrice, {headers: new HttpHeaders({'authorization': this.header})}).pipe();
  }

  getAllCategory(): Observable<Category[]> {
    return this.httpClient.get<Category[]>(this.CATEGORY, {headers: new HttpHeaders({'authorization': this.header})}).pipe();
  }

  getLaptop(page: number, nameSearch: string, nameLaptop: string, beforePrice: string, afterPrice: string, sort: string): Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.LAPTOP + '?page=' + page + '&nameSearch=' + nameSearch + '&nameLaptop=' + nameLaptop + '&beforePrice=' + beforePrice + '&afterPrice=' + afterPrice + '&sort=' + sort, {headers: new HttpHeaders({'authorization': this.header})}).pipe();
  }

  getPhone(page: number, nameSearch: string, namePhone: string, beforePrice: string, afterPrice: string, sort: string): Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.PHONE + `?page=${page}` + `&nameSearch=${nameSearch}&namePhone=${namePhone}&beforePrice=${beforePrice}&afterPrice=${afterPrice}&sort=${sort}`, {headers: new HttpHeaders({'authorization': this.header})}).pipe();
  }

  getProductNearDay(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.NEAR_DAY, {headers: new HttpHeaders({'authorization': this.header})}).pipe();
  }

  getProductById(id: number): Observable<Product> {
    return this.httpClient.get<Product>(this.DETAIL + `${id}`, {headers: new HttpHeaders({'authorization': this.header})}).pipe();
  }


  getProductInCart(): Observable<Cart[]> {
    return this.httpClient.get<Cart[]>(this.CART, {headers: new HttpHeaders({'authorization': this.header})}).pipe();
  }

  getTotalPayment(): Observable<Cart> {
    return this.httpClient.get<Cart>(this.TOTAL_PAYMENT, {headers: new HttpHeaders({'authorization': this.header})}).pipe();
  }

  getProductListById(id: number): Observable<Product> {
    return this.httpClient.get(this.FIND_BY_ID + `${id}`, {headers: new HttpHeaders({'authorization': this.header})}).pipe();
  }

  deleteProduct(id: number) {
    return this.httpClient.delete(this.DELETE + id, {headers: new HttpHeaders({'authorization': this.header})}).pipe();
  }
}
