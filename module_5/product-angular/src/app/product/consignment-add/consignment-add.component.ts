import {Component, OnInit} from '@angular/core';
import {ConsignmentService} from '../../service/consignmentService';
import {FormControl, FormGroup} from '@angular/forms';
import {Product} from '../../model/product';
import {Router} from '@angular/router';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-consignment-add',
  templateUrl: './consignment-add.component.html',
  styleUrls: ['./consignment-add.component.css']
})
export class ConsignmentAddComponent implements OnInit {
  addForm: FormGroup;
  productList: Product[] = [];

  constructor(private consignmentService: ConsignmentService,
              private route: Router,
              private toast: ToastrService) {
  }

  ngOnInit(): void {
    this.getForm();
    this.getAllProduct();
  }

  private getForm() {
    this.addForm = new FormGroup({
      codeConsignment: new FormControl(),
      product: new FormControl(''),
      amount: new FormControl(),
      dateAdd: new FormControl(),
      dateOfManuFacture: new FormControl(),
      dateEnd: new FormControl(),
    });
  }

  private getAllProduct() {
    this.consignmentService.getAllProduct().subscribe(data => {
      this.productList = data;
    });
  }

  submit() {
    const consignment = this.addForm.value;
    this.consignmentService.addConsignment(consignment).subscribe(data => {

    }, error => {
    }, () => {
      this.route.navigateByUrl('/consignment-list');
      this.toast.success('Add success <3 <3');
    });
  }


}
