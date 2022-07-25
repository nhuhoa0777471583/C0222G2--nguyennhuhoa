import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, NgForm} from '@angular/forms';
import {Product} from '../../../model/product';
import {ProductService} from '../../service-2/product.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {
  productForm: FormGroup;
  id: number;
  product: Product = {};

  constructor(private productService: ProductService, private activatedRoute: ActivatedRoute, private router: Router) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const number = paramMap.get('id');
      this.product = this.productService.findById(parseInt(number))[0];

      this.productForm = new FormGroup({
        id: new FormControl(this.product.id),
        name: new FormControl(this.product.name),
        price: new FormControl(this.product.price),
        description: new FormControl(this.product.description),
      });
    });
  }

  ngOnInit(): void {
  }

  delete(id: number) {
    console.log(id);
    this.productService.deleteProduct(id);
    this.router.navigateByUrl('/product/list');
  }
}
