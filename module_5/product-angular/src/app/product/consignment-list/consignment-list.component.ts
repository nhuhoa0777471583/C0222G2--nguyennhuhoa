import {Component, OnInit} from '@angular/core';
import {Consignment} from '../../model/consignment';
import {ConsignmentService} from '../../service/consignmentService';

import {ToastrService} from 'ngx-toastr';
import {FormControl, FormGroup} from '@angular/forms';
import {MessagingService} from '../../service/messagingService';

import {NotificationService} from '../../service/notificationService';


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
  formSearch: FormGroup;
  // message: any;
  // showPanel: boolean;
  // notification: NotificationPayload;
  // notificationTimeout: any;
  // private notificationSub: Subscription;
  message: any;

  constructor(private consignmentService: ConsignmentService,
              private toast: ToastrService,

              private notificationService: NotificationService) {
  }

  ngOnInit(): void {
    this.getAllPage(this.numberPage);
    this.getFormSearch();
    // this.notificationMess();
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


  search() {
    this.consignmentService.searchName(this.formSearch.value.nameSearch).subscribe(data => {
      this.consignmentList = data;
    });
  }

  private getFormSearch() {
    this.formSearch = new FormGroup({
      nameSearch: new FormControl(),
    });
  }



  //
  // private notificationMess() {
  //   this.notificationService.getNotification().subscribe(n => {
  //     this.notification = n;
  //     this.showPanel = n !== null;
  //     this.notificationTimeout = setTimeout(() => {
  //       this.showPanel = false;
  //     }, 3000);
  //   });
  // }
  // ngOnDestroy(){
  //   this.notificationSub.unsubscribe();
  //   clearTimeout(this.notificationTimeout)
  // }
}
