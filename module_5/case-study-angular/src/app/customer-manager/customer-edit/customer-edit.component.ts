import {Component, OnInit} from '@angular/core';
import {Customer} from "../../model/customer/customer";
import {Form, FormControl, FormGroup, Validators} from "@angular/forms";
import {CustomerTypeService} from "../../service/customerTypeService";
import {CustomerService} from "../../service/customerService";
import {ToastrService} from "ngx-toastr";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {CustomerType} from "../../model/customer/customerType";

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {
  customer: Customer = {};
  editForm: FormGroup;
  customerTypeEdit: CustomerType = {};
  id: number;
  data: any;
  customerTypeList: CustomerType[] = [];

  constructor(private customerTypeService: CustomerTypeService,
              private customerService: CustomerService,
              private toas: ToastrService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.getEditForm();
    })
  }

  private getEditForm() {
    return this.customerService.findById(this.id).subscribe(data => {
      this.data = data;
      console.log(this.data.name)
    }, error => {
    }, () => {
      this.getForm();

    })
  }

  ngOnInit(): void {
    this.getAllCustomerType();
  }


  private getAllCustomerType() {
    this.customerTypeService.getAll().subscribe(data => {
      this.customerTypeList = data;
    }, error => {
    }, () => {

    })
  }

  update(id: number) {
    const customer = this.editForm.value;
    this.customerTypeService.findById(customer.customerType.id).subscribe(data => {
      this.customerTypeEdit = data;
      console.log(this.customerTypeList)
    }, error => {
    }, () => {
      customer.customerType = this.customerTypeEdit;
      this.customerService.editCustomer(id, customer).subscribe(data => {
      }, error => {
      }, () => {
        this.router.navigateByUrl("/customer")
        this.toas.success("Sửa thành công", "thành công");
      })
    })
  }
  defaultSelectCustomerType(c1: CustomerType, c2: CustomerType) {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }

  private getForm() {
    this.editForm = new FormGroup({
      id: new FormControl(),
      name: new FormControl(this.data.name, [Validators.required, Validators.pattern(/^([A-Z][^A-Z0-9\s]+)(\s[A-Z][^A-Z0-9\s]+)*$/)]),
      email: new FormControl(this.data.email, [Validators.required, Validators.email]),
      address: new FormControl(this.data.address, [Validators.required]),
      birthday: new FormControl(this.data.birthday, [Validators.required]),
      gender: new FormControl(this.data.gender, [Validators.required]),
      phone: new FormControl(this.data.phone, [Validators.required, Validators.pattern(/^((090)|(091)|(\(84\)\+90)|(\(84\)\+91)){1}[0-9]{7}$/)]),
      idCard: new FormControl(this.data.idCard, [Validators.required, Validators.pattern(/^[0-9]{9,10}$/)]),
      customerType: new FormControl(this.data.customerType, [Validators.required])
    });
  }
}
