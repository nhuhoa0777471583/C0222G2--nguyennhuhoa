// @ts-ignore
import {Component, OnInit} from '@angular/core';
import {Customer} from "../../model/customer/customer";
import {CustomerService} from "../../service/customerService";
import {CustomerTypeService} from "../../service/customerTypeService";
import {ToastrService} from "ngx-toastr";

// @ts-ignore
import {FormControl, FormGroup} from "@angular/forms";


// @ts-ignore
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
  searchFormName: FormGroup;

  constructor(private customerService: CustomerService,
              private customerTypeService: CustomerTypeService,
              private toas: ToastrService) {


  }

  ngOnInit() {
    this.getAll();
    this.searchName();
  }

  private getAll() {
    this.customerService.getAll().subscribe(data => {
      this.customer = data
    })
  }


  showDelete(c: Customer) {
    this.idDelete = c.id;
    this.nameDelete = c.name
  }

  deleteCustomer() {
    this.customerService.deleteCustomer(this.idDelete).subscribe(data => {
    }, error => {
    }, () => {
      this.ngOnInit();
      this.toas.success("Xóa thành công", "Thành công!!");
    })
  }

  searchName() {
    this.searchFormName = new FormGroup({
      nameSearch: new FormControl("")
    })
  }

  goSearch() {
    console.log(this.searchFormName.value.nameSearch)
    this.customerService.searchCustomer(this.searchFormName.value.nameSearch).subscribe(data => {
      this.customer = data;
      console.log(this.customer)
    }, error => {
    }, () => {

    })
  }


}
