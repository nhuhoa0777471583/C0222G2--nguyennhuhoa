import {Component, OnInit} from '@angular/core';
import {Product} from '../../model/product';
import {ProductService} from '../../service/product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: Product[] = [];
  id: number;

  constructor(private productService: ProductService) {
  }

  ngOnInit() {
    this.productService.getAll().subscribe(data => {
      this.products = data;
      console.log(data);
    }, error => {
    }, () => {
    });
  }

  deleteProduct(id: number) {
    this.productService.deleteProduct(id).subscribe(data => {
    }, error => {
    }, () => {
      this.ngOnInit();
      alert('xóa thành công');
    });
  }
}
