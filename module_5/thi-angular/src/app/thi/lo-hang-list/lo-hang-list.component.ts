import {Component, OnInit} from '@angular/core';
import {LoHangService} from "../service/loHangService";
import {LoHang} from "../model/loHang";
import {ToastrService} from "ngx-toastr";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-lo-hang-list',
  templateUrl: './lo-hang-list.component.html',
  styleUrls: ['./lo-hang-list.component.css']
})
export class LoHangListComponent implements OnInit {
  lohangList: LoHang [] = [];
  p: number = 1;
  idDelete: number;
  nameDelete: string;
  dateDelete: string;
  formSearch: FormGroup;

  constructor(private loHangService: LoHangService, private toast: ToastrService) {
  }

  ngOnInit(): void {
    this.getAll();
    this.searchForm();
  }

  private getAll() {
    this.loHangService.getAll().subscribe(data => {
      this.lohangList = data
    }, error => {
    }, () => {
    })
  }

  showDelete(loHang: LoHang) {
    this.idDelete = loHang.id;
    this.nameDelete = loHang.sanPham.tenSanPham;
    this.dateDelete = loHang.ngayNhapHang
  }

  delete() {
    this.loHangService.delete(this.idDelete).subscribe(data => {
    }, error => {
    }, () => {
      this.ngOnInit();
      this.toast.success("xóa thành công!!")
    })
  }


  private searchForm() {
    this.formSearch = new FormGroup({
      nameSearch: new FormControl()
    })
  }

  search() {
    this.loHangService.search(this.formSearch.value.nameSearch).subscribe(data => {
      this.lohangList = data;
    }, error => {
    }, () => {
    })
  }
}
