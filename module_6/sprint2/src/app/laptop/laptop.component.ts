import {Component, OnInit} from '@angular/core';
import {ProductService} from "../service/ProductService";
import {Product} from "../model/Product";

@Component({
  selector: 'app-laptop',
  templateUrl: './laptop.component.html',
  styleUrls: ['./laptop.component.css']
})
export class LaptopComponent implements OnInit {
  laptopList: Product[] = [];
  p: number = 0;

  constructor(private productService: ProductService) {
  }

  ngOnInit(): void {
    this.getLaptop();
  }

  private getLaptop() {
    this.productService.getLaptop().subscribe(d => {
      this.laptopList = d;
    })
  }
}
