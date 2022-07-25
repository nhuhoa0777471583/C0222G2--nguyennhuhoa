import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Customer} from '../model/Customer';

@Injectable({
  providedIn: 'root'
})

export class CustomerService {
  private readonly API_URL = 'http://localhost:8080/customer/list';



  constructor(private httpClient: HttpClient) {
  }

  getAllCustomer(): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>(this.API_URL);
  }
}
