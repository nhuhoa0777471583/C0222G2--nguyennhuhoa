import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductService} from '../../service/product.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {Category} from '../../model/category';
import {CategoryService} from '../../service/category.service';
import {Product} from '../../../model/product';

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {

  productForm: FormGroup;
  id: number;
  categorys: Category [] = [];
  product: Product = {};
  categoriesEdit: Category = {};

  constructor(private productService: ProductService, private categoryService: CategoryService,
              private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.getProduct(this.id);
    });
  }

  getProduct(id: number) {
    return this.productService.findById(id).subscribe(product => {
      this.productForm = new FormGroup({
        name: new FormControl(product.name),
        price: new FormControl(product.price),
        description: new FormControl(product.description),
        category: new FormControl(product.category.nameCategory)
      });
    });
  }

  updateProduct(id: number) {
    const product = this.productForm.value;
    this.categoryService.findById(product.category).subscribe(data => {
      this.categoriesEdit = data;
    }, error => {
    }, () => {
      product.category = this.categoriesEdit;
      this.productService.updateProduct(id, product).subscribe(() => {
      }, error => {
      }, () => {
        alert('Cập nhật thành công');
      });
    });


  }


  ngOnInit() {
    this.getAllCategory();
  }


  private getAllCategory() {
    this.categoryService.getAll().subscribe(data => {
      this.categorys = data;
    });
  }
}
