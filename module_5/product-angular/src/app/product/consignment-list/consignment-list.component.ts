import {Component, OnInit} from '@angular/core';
import {Consignment} from '../../model/consignment';
import {ConsignmentService} from '../../service/consignmentService';
import {Product} from '../../model/product';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-consignment-list',
  templateUrl: './consignment-list.component.html',
  styleUrls: ['./consignment-list.component.css']
})
export class ConsignmentListComponent implements OnInit {
  consignmentList: Consignment[] = [];
  p: number = 1;
  nameDelete: string;
  dateDelete: string;
  idDelete: number;
  numberPage: number = 0;
  firtPage: boolean;
  lastPage: boolean;

  constructor(private consignmentService: ConsignmentService, private toast: ToastrService) {
  }

  ngOnInit(): void {
    // this.getAll();
    this.getAllPage(this.numberPage);
  }

  // private getAll() {
  //   this.consignmentService.getAll().subscribe(data => {
  //     this.consignmentList = data;
  //     console.log(this.consignmentList);
  //   });
  // }

  private getAllPage(numberPage: number) {
    this.consignmentService.getAllByPage(numberPage).subscribe(data => {
      // @ts-ignore
      this.consignmentList = data.content;
      console.log(this.consignmentList);
      // @ts-ignore
      this.firtPage = data.first;
      console.log(this.firtPage);
      // @ts-ignore
      this.lastPage = data.last;
      console.log(this.lastPage);
    }, error => {
    }, () => {
    });
  }

  previousPage() {
    this.numberPage -= 1;
    this.getAllPage(this.numberPage);
  }

  nextPage() {
    this.numberPage += 1;
    this.getAllPage(this.numberPage);
  }


  showDelete(c: Consignment) {
    this.idDelete = c.id;
    this.nameDelete = c.product.name;
    this.dateDelete = c.dateAdd;
  }

  delete() {
    this.consignmentService.delete(this.idDelete).subscribe(data => {
    }, error => {
    }, () => {
      this.ngOnInit();
      this.toast.success('Delete ok', 'Success');
    });
  }


}
