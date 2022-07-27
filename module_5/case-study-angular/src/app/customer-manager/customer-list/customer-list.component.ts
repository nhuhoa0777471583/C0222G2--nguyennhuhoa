import {Component, OnInit} from '@angular/core';
import {Customer} from "../../model/customer/customer";
import {CustomerService} from "../../service/customerService";
import {CustomerTypeService} from "../../service/customerTypeService";
import { ToastrService } from 'ngx-toastr';


@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customer: Customer[] = [];
  idDelete: number;
  nameDelete: string;
  p: number = 1;

  constructor(private customerService: CustomerService,
              private customerTypeService: CustomerTypeService,
              private toas: ToastrService) {
  }

  ngOnInit() {
    this.getAll();
  }

  private getAll() {
    this.customerService.getAll().subscribe(data => {
      this.customer = data
    })
  }

  deleteCustomer() {
    this.customerService.deleteCustomer(this.idDelete).subscribe(data => {
    }, error => {
    }, () => {
      this.ngOnInit();
      this.toas.success("Xóa thành công", "Thành công!!");
    })
  }

  showDelete(c: Customer) {
    this.idDelete = c.id;
    this.nameDelete = c.name
  }
}
