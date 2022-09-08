import {Component, OnInit} from '@angular/core';
import {ProductService} from "../service/ProductService";
import {Product} from "../model/Product";
import {Title} from "@angular/platform-browser";

@Component({
  selector: 'app-laptop',
  templateUrl: './laptop.component.html',
  styleUrls: ['./laptop.component.css']
})
export class LaptopComponent implements OnInit {
  laptopList: Product[] = [];
  p: number = 0;

  constructor(private productService: ProductService,private tile: Title) {
    this.tile.setTitle("Laptop")
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
