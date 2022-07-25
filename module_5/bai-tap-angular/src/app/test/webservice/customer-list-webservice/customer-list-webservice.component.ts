import { Component, OnInit } from '@angular/core';
import {Subscription} from 'rxjs';
import {Customer} from '../model/Customer';
import {CustomerService} from '../service/CustomerService';

@Component({
  selector: 'app-customer-list-webservice',
  templateUrl: './customer-list-webservice.component.html',
  styleUrls: ['./customer-list-webservice.component.css']
})
export class CustomerListWebserviceComponent implements OnInit {

  private subscription: Subscription;
  public customer: Customer[] = [];
  constructor(private customerService: CustomerService) {
  }

  getAll() {
    this.subscription = this.customerService.getAllCustomer().subscribe(data => {
      console.log(this.customer = data);
    }, error => {
      console.log(error);
    });
  }

  ngOnInit() {
    this.getAll();
  }

}
