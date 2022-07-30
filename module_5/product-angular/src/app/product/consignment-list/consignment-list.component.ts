import { Component, OnInit } from '@angular/core';
import {Consignment} from '../../model/consignment';
import {ConsignmentService} from '../../service/consignmentService';

@Component({
  selector: 'app-consignment-list',
  templateUrl: './consignment-list.component.html',
  styleUrls: ['./consignment-list.component.css']
})
export class ConsignmentListComponent implements OnInit {
  private consignmentList: Consignment[] = [];
  p: number = 1;
  constructor(private consignmentService: ConsignmentService) { }

  ngOnInit(): void {
    this.getAll()
  }

  private getAll() {
    this.consignmentService.getAll().subscribe(data =>{
      this.consignmentList = data;
    })
  }
}
