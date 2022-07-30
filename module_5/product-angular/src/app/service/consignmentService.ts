import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Consignment} from '../model/consignment';
import {Product} from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ConsignmentService {
  private URL_CONSIGNMENT = 'http://localhost:8080/home/consignment-list';
  private URL_PRODUCT = 'http://localhost:8080/home/product-list';

  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<Consignment[]> {
    return this.httpClient.get<Consignment[]>(this.URL_CONSIGNMENT);
  }

  getAllProduct(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.URL_PRODUCT);
  }
}
