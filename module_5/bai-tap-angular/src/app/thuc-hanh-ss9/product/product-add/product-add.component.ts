import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductService} from '../../service/product.service';
import {CategoryService} from '../../service/category.service';

import {Category} from '../../model/category';

@Component({
  selector: 'app-product-add',
  templateUrl: './product-add.component.html',
  styleUrls: ['./product-add.component.css']
})
export class ProductAddComponent implements OnInit {
  categorys: Category[] = [];
  categoryAdd: Category = {};

  productForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl(),
    category: new FormControl(),
  });

  constructor(private productService: ProductService, private categoryService: CategoryService) {
  }

  ngOnInit() {
    this.getAllCategory();

  }

  submit() {
    const product = this.productForm.value;

    this.categoryService.findById(product.category).subscribe(data => {
      this.categoryAdd = data;
    },error => {

    }, () => {
      product.category = this.categoryAdd;
      this.productService.saveProduct(product).subscribe(() => {
        this.productForm.reset();
      }, e => console.log(e));
      alert('Tạo thành công');
    });
  }

  private getAllCategory() {
    this.categoryService.getAll().subscribe(data => {
      this.categorys = data;
    });
  }

}
