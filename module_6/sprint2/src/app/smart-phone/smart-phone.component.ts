import {Component, OnInit} from '@angular/core';
import {ProductService} from "../service/ProductService";
import {Product} from "../model/Product";

@Component({
  selector: 'app-smart-phone',
  templateUrl: './smart-phone.component.html',
  styleUrls: ['./smart-phone.component.css']
})
export class SmartPhoneComponent implements OnInit {
  phoneList: Product[] = [];
  p: number = 0;

  constructor(private productService: ProductService) {
  }

  ngOnInit(): void {
    this.getPhone();
  }

  private getPhone() {
    this.productService.getPhone().subscribe(d =>{
      this.phoneList = d;
    })
  }
}
