import {Component, OnInit} from '@angular/core';
import {ConsignmentService} from '../../service/consignmentService';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Product} from '../../model/product';
import {Router} from '@angular/router';
import {ToastrService} from 'ngx-toastr';
import {formatDate} from '@angular/common';
import {finalize} from 'rxjs/operators';
import {AngularFireStorage} from '@angular/fire/storage';

@Component({
  selector: 'app-consignment-add',
  templateUrl: './consignment-add.component.html',
  styleUrls: ['./consignment-add.component.css']
})
export class ConsignmentAddComponent implements OnInit {
  addForm: FormGroup;
  productList: Product[] = [];
  selectFileImg: any = null;

  constructor(private consignmentService: ConsignmentService,
              private route: Router,
              private toast: ToastrService, private storage: AngularFireStorage) {
  }

  ngOnInit(): void {
    this.getForm();
    this.getAllProduct();
  }

  private getForm() {
    this.addForm = new FormGroup({
      codeConsignment: new FormControl('', [Validators.required, Validators.pattern(/^(LH-)[0-9]{4}$/)]),
      product: new FormControl('', [Validators.required]),
      amount: new FormControl('', [Validators.required, Validators.min(1)]),
      dateAdd: new FormControl('', [Validators.required]),
      dateOfManuFacture: new FormControl('', [Validators.required]),
      dateEnd: new FormControl('', [Validators.required]),
      img: new FormControl(),
    });
  }

  private getAllProduct() {
    this.consignmentService.getAllProduct().subscribe(data => {
      this.productList = data;
    });
  }

  submit() {
    if (this.addForm.valid) {
      const nameImg = this.getCurrentDateTime() + this.selectFileImg.name;
      const fileRel = this.storage.ref(nameImg);
      this.storage.upload(nameImg, this.selectFileImg).snapshotChanges().pipe(
        finalize(() => {
          fileRel.getDownloadURL().subscribe((url) => {
            this.addForm.patchValue({img: url});
            this.consignmentService.addConsignment(this.addForm.value).subscribe(() => {
              this.route.navigateByUrl('/consignment-list').then(r => this.toast.success('Add success <3 <3'));
            });
          });
        })
      ).subscribe();
    } else {
      this.toast.error('chưa điền đầy đủ thông tin');
    }

  }

  getCurrentDateTime(): string {
    return formatDate(new Date(), 'dd-MM-yyyy-hh:mm:ssa', 'en-US');
  }

  showPreview(event: any) {
    this.selectFileImg = event.target.files[0];
  }
}
