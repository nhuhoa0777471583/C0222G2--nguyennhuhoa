import {Component, OnInit} from '@angular/core';
import {LoHangService} from "../service/loHangService";
import {AbstractControl, FormControl, FormGroup, Validators} from "@angular/forms";
import {SanPham} from "../model/sanPham";
import {Router} from "@angular/router";
import {ToastrService} from "ngx-toastr";

@Component({
  selector: 'app-lo-hang-add',
  templateUrl: './lo-hang-add.component.html',
  styleUrls: ['./lo-hang-add.component.css']
})
export class LoHangAddComponent implements OnInit {
  nameForm: FormGroup;
  sanPhamList: SanPham[] = [];

  constructor(private loHangService: LoHangService,
              private router: Router,
              private toast: ToastrService) {
  }

  ngOnInit(): void {
    this.getForm()
    this.getAllSanPham()
  }

  private getForm() {
    this.nameForm = new FormGroup({
      maLoHang: new FormControl('', [Validators.required, Validators.pattern(/^(LH-)[0-9]{4}$/)]),
      sanPham: new FormControl('', [Validators.required]),
      soLuong: new FormControl('', [Validators.required, Validators.min(1)]),
      ngayNhapHang: new FormControl('', [Validators.required]),
      ngaySanXuat: new FormControl('', [Validators.required]),
      ngayHetHan: new FormControl('', [Validators.required]),
    })
  }


  submit() {
    if (this.nameForm.valid) {
      const loHang = this.nameForm.value;
      this.loHangService.add(loHang).subscribe(data => {
      }, error => {
      }, () => {
        this.router.navigateByUrl("/lo-hang-list")
        this.toast.success("Thêm mới thành công")
      })
    } else {
      this.toast.error("Nhập chưa đúng định dạng!!!")
    }

  }

  private getAllSanPham() {
    this.loHangService.getAllSanPham().subscribe(data => {
      this.sanPhamList = data
    }, error => {
    }, () => {
    })
  }
}
