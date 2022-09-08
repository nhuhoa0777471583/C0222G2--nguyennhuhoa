import {Injectable} from "@angular/core";
import {environment} from "../../environments/environment";
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from "rxjs";
import {Product} from "../model/Product";
import {CookieService} from '../login/service/cookie.service';

const API_URL = `${environment.apiUrl}`


// @ts-ignore
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private ALL = 'http://localhost:8080/product';
  private LAPTOP = API_URL + 'laptop';
  private PHONE = API_URL + 'phone';
  private NEAR_DAY = API_URL + 'near-day';
  private DETAIL = API_URL + 'detail/';
  private header = "Bearer " + this.cookieService.getCookie('jwToken');
  constructor(private httpClient: HttpClient, private cookieService: CookieService) {
  }

  getAll():Observable<Product[]>{
    return this.httpClient.get<Product[]>(this.ALL, {headers: new HttpHeaders({'authorization': this.header})}).pipe();
  }

  getLaptop():Observable<Product[]>{
    return this.httpClient.get<Product[]>(this.LAPTOP);
  }

  getPhone():Observable<Product[]>{
    return this.httpClient.get<Product[]>(this.PHONE);
  }

  getProductNearDay():Observable<Product[]>{
    return this.httpClient.get<Product[]>(this.NEAR_DAY);
  }

  getProductById(id: number):Observable<Product>{
    return this.httpClient.get<Product>(this.DETAIL + `${id}`);
  }

}
