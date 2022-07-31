import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../../service/customerService";
import {CustomerTypeService} from "../../service/customerTypeService";
import {Customer} from "../../model/customer/customer";
import {ToastrService} from "ngx-toastr";
import {Router} from "@angular/router";


@Component({
  selector: 'app-customer-add',
  templateUrl: './customer-add.component.html',
  styleUrls: ['./customer-add.component.css']
})
export class CustomerAddComponent implements OnInit {


  customers: Customer [] = [];
  addCustomerForm: FormGroup;

  constructor(private customerService: CustomerService,
              private customerTypeService: CustomerTypeService,
              private toas: ToastrService,
              private router: Router) {

  }

  private getForm() {
    this.addCustomerForm = new FormGroup({
      id: new FormControl(),
      name: new FormControl('', [Validators.required, Validators.pattern(/^([A-Z][^A-Z0-9\s]+)(\s[A-Z][^A-Z0-9\s]+)*$/)]),
      email: new FormControl('', [Validators.required, Validators.email]),
      address: new FormControl('', [Validators.required]),
      birthday: new FormControl('', [Validators.required]),
      gender: new FormControl('', [Validators.required]),
      phone: new FormControl('', [Validators.required, Validators.pattern(/^((090)|(091)|(\(84\)\+90)|(\(84\)\+91)){1}[0-9]{7}$/)]),
      idCard: new FormControl('', [Validators.required, Validators.pattern(/^[0-9]{9,10}$/)]),
      customerType: new FormControl('', [Validators.required])
    });
  }




  ngOnInit(): void {
    this.getAllCustomerType();
    this.getForm();
  }

  submit() {
   if(this.addCustomerForm.valid){
     const customer = this.addCustomerForm.value;
     customer.gender = +customer.gender
     this.customerService.addCustomer(customer).subscribe(data => {
       this.toas.success('Thêm mới thành công', 'Thành công!');
     }, error => {
     }, () => {
       this.router.navigateByUrl("/customer")
     })
   }else {
     this.toas.error("Chưa thêm mới","Lỗi!!")
   }
  }

  private getAllCustomerType() {
    this.customerTypeService.getAll().subscribe(data => {
      this.customers = data
    }, error => {
    }, () => {

    })
  }
}
