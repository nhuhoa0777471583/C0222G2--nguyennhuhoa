import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Bill} from '../../model/Bill';

@Injectable({
  providedIn: 'root'
})
export class BillService {
  private URL_PRODUCT_MOST : 'http://localhost:8080/list-product-order'
  constructor(private httpClient: HttpClient) {
  }

}
