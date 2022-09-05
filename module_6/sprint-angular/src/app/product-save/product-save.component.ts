import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {ProductService} from "../service/product-service";
import {ProductType} from "../model/product-type";
import {RentType} from "../model/rentType";
import {Router} from "@angular/router";
import {ToastrService} from "ngx-toastr";

@Component({
  selector: 'app-product-save',
  templateUrl: './product-save.component.html',
  styleUrls: ['./product-save.component.css']
})
export class ProductSaveComponent implements OnInit {
  nameForm: FormGroup;
  productType: ProductType[] = [];
  rentType: RentType[] = [];

  constructor(private productService: ProductService, private router: Router, private toast: ToastrService) {
  }

  ngOnInit(): void {
    this.getForm();
    this.getAllProductType();
    this.getAllRentType;
  }

  getAllProductType() {
    this.productService.getAllProductType().subscribe(d => {
      this.productType = d
    })
  }

  getAllRentType() {
    this.productService.getAllRentType().subscribe(data => {
      this.rentType = data;
    })
  }

  private getForm() {
    this.nameForm = new FormGroup({
      id: new FormControl(),
      codeProduct: new FormControl(''),
      name: new FormControl(''),
      price: new FormControl(''),
      statusProduct: new FormControl(''),
      creationDate: new FormControl(''),
    })
  }

  submit() {
    const pro = this.nameForm.value;
    console.log(pro)
    this.productService.add(pro).subscribe(data => {
      console.log(data)
    }, error => {
    }, () => {
      this.router.navigateByUrl("/product-list")
      this.toast.success("Successfully", "Add product")
    })
  }
}
