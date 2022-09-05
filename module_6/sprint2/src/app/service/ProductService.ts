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

  // private ALL = 'http://localhost:8080/product';
  private ALL = API_URL + 'product';
  private LAPTOP = API_URL + 'laptop';
  private PHONE = API_URL + 'phone';

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
}
