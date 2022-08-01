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

  numberPage: number;
  totalPage: number;
  countTotalPage: number[];

  constructor(private consignmentService: ConsignmentService, private toast: ToastrService) {
  }

  ngOnInit(): void {
    this.getAllPage(this.numberPage);
  }


  private getAllPage(numberPage: number) {
    this.consignmentService.getAllByPage(numberPage).subscribe((data: Consignment[]) => {
      // @ts-ignore
      this.consignmentList = data.content;
      // @ts-ignore
      this.totalPage = data.totalPages;
      // @ts-ignore
      this.countTotalPage = new Array(data.totalPages);
      // @ts-ignore
      this.numberPage = data.number;

    }, error => {
    }, () => {
    });
  }

  previousPage() {
    let number: number = this.numberPage;
    if (number > 0) {
      number--;
      this.getAllPage(number);
    }
  }

  nextPage() {
    let number: number = this.numberPage;
    if (number < this.totalPage) {
      number++;
      this.getAllPage(number);
    }
  }

  item(i: number) {
    this.getAllPage(i);
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
