import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {LoHang} from "../model/loHang";
import {SanPham} from "../model/sanPham";

@Injectable({
  providedIn: 'root'
})
export class LoHangService {
  private URL_HANG = 'http://localhost:3000/lo-hang/'
  private URL_SP = 'http://localhost:3000/san-pham/'

  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<LoHang[]> {
    return this.httpClient.get<LoHang[]>(this.URL_HANG)
  }

  getAllSanPham(): Observable<SanPham[]> {
    return this.httpClient.get<SanPham[]>(this.URL_SP)
  }

  findById(id: number): Observable<any> {
    return
  }

  add(sanPham): Observable<SanPham> {
    return this.httpClient.post<SanPham>(this.URL_HANG, sanPham)
  }

  delete(id: number): Observable<LoHang> {
    return this.httpClient.delete<LoHang>(this.URL_HANG + id)
  }
}
