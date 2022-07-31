import {Component, OnInit} from '@angular/core';
import {LoHangService} from "../service/loHangService";
import {SanPham} from "../model/sanPham";

@Component({
  selector: 'app-san-pham-list',
  templateUrl: './san-pham-list.component.html',
  styleUrls: ['./san-pham-list.component.css']
})
export class SanPhamListComponent implements OnInit {
  sanPhamList: SanPham[] = [];
  p: number = 1 ;

  constructor(private loHangService: LoHangService) {
  }

  ngOnInit(): void {
    this.getAll()
  }

  private getAll() {
    this.loHangService.getAllSanPham().subscribe(data => {
      this.sanPhamList = data;
    }, error => {
    }, () => {
    })
  }
}
