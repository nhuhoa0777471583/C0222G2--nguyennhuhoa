import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {CustomerType} from "../model/customer/customerType";

@Injectable({
  providedIn: 'root'
})
export class CustomerTypeService {
  private URL_CUSTOMER_TYPE = 'http://localhost:3000/customerType/'

  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<CustomerType[]> {
    return this.httpClient.get<CustomerType[]>(this.URL_CUSTOMER_TYPE);
  }

  findById(id: number): Observable<CustomerType> {
    return this.httpClient.get<CustomerType>(this.URL_CUSTOMER_TYPE + id);

  }
}
