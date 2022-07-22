import { Component, OnInit } from '@angular/core';
import {Customer} from "../../model/customer/customer";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customer: Customer[] = [];

  constructor() {

    this.customer.push({
      id: 1,
      name: 'hòa',
      birthday: '2002-03-23',
      gender: 1,
      idCard: '123456789',
      phone: '0777123456',
      email: 'hoa23@gmail.com',
      address: 'da nang',
      customerType:
        {
          id: 1,
          name: 'vip'
        }
    })
    this.customer.push({
      id: 2,
      name: 'tuyến',
      birthday: '1994-03-23',
      gender: 0,
      idCard: '123456789',
      phone: '0777123456',
      email: 'tuyen@gmail.com',
      address: 'ha noi',
      customerType: {
        id: 2,
        name: 'gold'
      }
    })
    this.customer.push({
      id: 3,
      name: 'bảo',
      birthday: '1997-03-23',
      gender: 1,
      idCard: '123456789',
      phone: '0777123456',
      email: 'bao@gmail.com',
      address: 'sai gon',
      customerType: {
        id: 3,
        name: 'diamond'
      }
    })
    this.customer.push({
      id: 4,
      name: 'đảm',
      birthday: '1996-03-23',
      gender: 0,
      idCard: '123456789',
      phone: '0777123456',
      email: 'dam@gmail.com',
      address: 'quang nam',
      customerType: {
        id: 2,
        name: 'pro'
      }
    })
    this.customer.push({
      id: 5,
      name: 'phúc',
      birthday: '1995-03-23',
      gender: 1,
      idCard: '123456789',
      phone: '0777123456',
      email: 'phuc@gmail.com',
      address: 'quang binh',
      customerType: {
        id: 1,
        name: 'vip'
      }
    })
  }

  ngOnInit(): void {
  }

}
