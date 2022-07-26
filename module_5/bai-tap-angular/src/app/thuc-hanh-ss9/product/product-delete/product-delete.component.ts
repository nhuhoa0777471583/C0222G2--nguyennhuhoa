import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductService} from '../../service/product.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {Category} from '../../model/category';
import {Product} from '../../../model/product';
import {CategoryService} from '../../service/category.service';

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {

  productForm: FormGroup;
  id: number;
  categorys: Category [] = [];
  product: Product = {};

  constructor(private productService: ProductService, private categoryService: CategoryService,
              private activatedRoute: ActivatedRoute, private router: Router) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.getProduct(this.id);
    });
  }

  getProduct(id: number) {
    return this.productService.findById(id).subscribe(data => {
      this.productForm = new FormGroup({
        name: new FormControl(data.name),
        price: new FormControl(data.price),
        description: new FormControl(data.description),
        category: new FormControl(data.category.id),
      })
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


  deleteProduct(id: number) {
    this.productService.deleteProduct(id).subscribe(data => {
    }, error => {
    }, () => {
      this.router.navigate(['/product/list']);
    });
  }
}
