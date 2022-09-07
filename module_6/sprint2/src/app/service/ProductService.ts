import {Injectable} from "@angular/core";
import {environment} from "../../environments/environment";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Product} from "../model/Product";

const API_URL = `${environment.apiUrl}`


// @ts-ignore
@Injectable({
  providedIn: 'root'
})


export class ProductService {

  private ALL = API_URL + 'product';
  private LAPTOP = API_URL + 'laptop';
  private PHONE = API_URL + 'phone';
  private NEAR_DAY = API_URL + 'near-day';
  private DETAIL = API_URL + 'detail/';

  constructor(private httpClient: HttpClient) {
  }

  getAll():Observable<Product[]>{
    return this.httpClient.get<Product[]>(this.ALL);
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
