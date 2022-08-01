import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {Product} from '../../model/product';
import {ConsignmentService} from '../../service/consignmentService';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {ToastrService} from 'ngx-toastr';
import {Consignment} from '../../model/consignment';

@Component({
  selector: 'app-consignment-edit',
  templateUrl: './consignment-edit.component.html',
  styleUrls: ['./consignment-edit.component.css']
})
export class ConsignmentEditComponent implements OnInit {
  editForm: FormGroup;
  productList: Product[] = [];
  idEdit: number;
  consignmentObj: Consignment = {};
  productObj: Product = {};

  constructor(private consignmentService: ConsignmentService,
              private activatedRoute: ActivatedRoute,
              private route: Router,
              private toast: ToastrService) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.idEdit = +paramMap.get('id');
    });
    this.getId();
  }

  private getId() {
    this.consignmentService.getId(this.idEdit).subscribe(data => {
      this.consignmentObj = data;
    }, error => {
    }, () => {
      this.getForm();
    });
  }

  private getForm() {
    this.editForm = new FormGroup({
      id: new FormControl(this.consignmentObj.id),
      codeConsignment: new FormControl(this.consignmentObj.codeConsignment),
      product: new FormControl(this.consignmentObj.product),
      amount: new FormControl(this.consignmentObj.amount),
      dateAdd: new FormControl(this.consignmentObj.dateAdd),
      dateOfManuFacture: new FormControl(this.consignmentObj.dateOfManuFacture),
      dateEnd: new FormControl(this.consignmentObj.dateEnd),
    });
  }

  ngOnInit(): void {
    this.getAllProduct();
  }

  update() {
      const cons = this.editForm.value;
      console.log(cons);
      this.consignmentService.edit(cons).subscribe(data => {
      }, error => {
      }, () => {
        this.route.navigateByUrl('/consignment-list');
        this.toast.success('Update success!!');
      });
  }

  private getAllProduct() {
    this.consignmentService.getAllProduct().subscribe(data => {
      this.productList = data;
    }, error => {
    }, () => {
    });
  }

  displayValueDeault(p1: Product, p2: Product) {
    return p1 && p2 ? p1.id === p2.id : p1 === p2;
  }

}
