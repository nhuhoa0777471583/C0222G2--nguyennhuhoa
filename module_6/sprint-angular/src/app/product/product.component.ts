import {Component, OnInit} from '@angular/core';
import {ProductService} from "../service/product-service";
import {Product} from "../model/product";
import {ToastrService} from "ngx-toastr";

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  productList: Product[] = [];
  codeProduct: string;
  dateDelete: string;
  idDelete: number;
  p: number = 1;

  constructor(private productService: ProductService, private toast: ToastrService) {
  }

  ngOnInit(): void {
    this.getAll();
  }

  private getAll() {
    this.productService.getAll().subscribe(d => {
      this.productList = d
    }, error => {
    }, () => {
    })
  }

  delete() {
    this.productService.delete(this.idDelete).subscribe(d => {
      console.log(this.idDelete)
    }, error => {
    }, () => {
      this.ngOnInit();
      this.toast.success("Successfully", "Delete product")
    })
  }


  show(p: Product) {
    this.idDelete = p.id;
    this.codeProduct = p.codeProduct;
    this.dateDelete = p.creationDate;
  }
}
