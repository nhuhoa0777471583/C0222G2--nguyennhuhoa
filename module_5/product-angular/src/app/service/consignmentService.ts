import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Consignment} from '../model/consignment';
import {Product} from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ConsignmentService {
  private URL_CONSIGNMENT = 'http://localhost:8080/home/consignment/';
  private URL_PRODUCT = 'http://localhost:8080/home/product/';

  constructor(private httpClient: HttpClient) {
  }

  getAllByPage(pageNumber: number): Observable<Consignment[]> {
    return this.httpClient.get<Consignment[]>(this.URL_CONSIGNMENT + `?page=${pageNumber}`);
  }

  getAllProduct(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.URL_PRODUCT);
  }

  delete(idDelete: number): Observable<Consignment> {
    return this.httpClient.delete<Consignment>(this.URL_CONSIGNMENT + idDelete);
  }

  addConsignment(consignment): Observable<Consignment> {
    return this.httpClient.post(this.URL_CONSIGNMENT, consignment);
  }

  getId(id: number): Observable<Consignment> {
    return this.httpClient.get(this.URL_CONSIGNMENT + 'edit/' + id);
  }

  getIdProduct(id: number): Observable<Product> {
    return this.httpClient.get<Product>(this.URL_PRODUCT + id);
  }

  edit(cons: any): Observable<Consignment> {
    return this.httpClient.put<Consignment>(this.URL_CONSIGNMENT + 'edit', cons);
  }

  searchName(nameSearch: string): Observable<Consignment[]> {
    return this.httpClient.get<Consignment[]>('http://localhost:8080/home/consignment?product.name=' + +nameSearch);
  }
}
