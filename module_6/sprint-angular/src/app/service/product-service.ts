import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Product} from "../model/product";
import {ProductType} from "../model/product-type";
import {RentType} from "../model/rentType";

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private URL_PRODUCT_LIST = 'http://localhost:8080/api/product/list'
  private URL_PRODUCT_SAVE = 'http://localhost:8080/api/product/save'
  private URL_PRODUCT_DELETE = 'http://localhost:8080/api/product/delete/'
  private URL_PRODUCT_TYPE = 'http://localhost:8080/api/product/product-type'
  private URL_RENT_TYPE = 'http://localhost:8080/api/product/rent-type'

  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.URL_PRODUCT_LIST)
  }
  getAllProductType(): Observable<ProductType[]> {
    return this.httpClient.get<ProductType[]>(this.URL_PRODUCT_TYPE)

  }
  getAllRentType(): Observable<RentType[]> {
    return this.httpClient.get<RentType[]>(this.URL_RENT_TYPE)
  }

  delete(id: number): Observable<Product> {
    return this.httpClient.delete<Product>(this.URL_PRODUCT_DELETE + `${id}`)
  }

  add(product): Observable<Product> {
    return this.httpClient.post<Product>(this.URL_PRODUCT_SAVE, product)
  }
}
