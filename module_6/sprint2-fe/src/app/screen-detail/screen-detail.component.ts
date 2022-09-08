import {Component, OnInit} from '@angular/core';
import {ProductService} from "../service/ProductService";
import {Product} from "../model/Product";
import {Title} from "@angular/platform-browser";
import {ActivatedRoute, ParamMap} from "@angular/router";

@Component({
  selector: 'app-screen-detail',
  templateUrl: './screen-detail.component.html',
  styleUrls: ['./screen-detail.component.css']
})
export class ScreenDetailComponent implements OnInit {
  product: Product = {};

  constructor(private productService: ProductService, private tile: Title, private activate: ActivatedRoute) {
    this.tile.setTitle("Chi tiết sản phẩm")
  }

  ngOnInit(): void {
    this.getProductById();

  }

  private getProductById() {
    this.activate.paramMap.subscribe((param: ParamMap) =>{
      const id = param.get('id');
      this.productService.getProductById(parseInt(id)).subscribe(d => {
        this.product = d;
        console.log(d)
      })
    })

  }


}
