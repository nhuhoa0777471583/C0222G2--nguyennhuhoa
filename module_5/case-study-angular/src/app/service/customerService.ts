import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Customer} from "../model/customer/customer";


@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private URL_CUSTOMER = 'http://localhost:3000/customer/'

  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>(this.URL_CUSTOMER);
  }

  findById(id: number): Observable<Customer> {
    return this.httpClient.get<Customer>(this.URL_CUSTOMER  + id)
  }

  addCustomer(customer): Observable<Customer> {
    return this.httpClient.post<Customer>(this.URL_CUSTOMER, customer)
  }

  editCustomer(id: number, customer: Customer): Observable<Customer> {
    return this.httpClient.put<Customer>(this.URL_CUSTOMER + id, customer);
  }

  deleteCustomer(id: number): Observable<Customer> {
    return this.httpClient.delete<Customer>(this.URL_CUSTOMER + id);
  }

  searchCustomer(name: string): Observable<Customer[]>{
    return this.httpClient.get<Customer[]>("http://localhost:3000/customer?name_like=" + name )
  }

}
