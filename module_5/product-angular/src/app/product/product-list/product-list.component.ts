import {Component, OnInit} from '@angular/core';
import {Consignment} from '../../model/consignment';
import {ConsignmentService} from '../../service/consignmentService';
import {Product} from '../../model/product';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  private productList: Product[] = [];
  p: number = 1;


  constructor(private productService: ConsignmentService) {
  }

  ngOnInit(): void {
    this.getAll();
  }


  private getAll() {
    this.productService.getAllProduct().subscribe(data => {
      this.productList = data;
    });
  }
}
