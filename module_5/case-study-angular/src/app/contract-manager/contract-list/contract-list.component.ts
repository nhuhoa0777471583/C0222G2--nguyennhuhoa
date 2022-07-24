import {Component, OnInit} from '@angular/core';
import {Contract} from "../../model/contract";

@Component({
  selector: 'app-contract-list',
  templateUrl: './contract-list.component.html',
  styleUrls: ['./contract-list.component.css']
})
export class ContractListComponent implements OnInit {

  contract: Contract [] = [];

  constructor() {
    this.contract = [
      {
        id: 1,
        codeContract: 'HD-0001',
        customer:
          {name: 'hòa'},
        service:
          {name: 'villa sát biển'},
        starDay: '2022-07-21',
        endDay: '2022-07-22',
        deposit: 1000
      },
      {
        id: 2,
        codeContract: 'HD-0001',
        customer: {name: 'bảo'},
        service: {name: 'room vip'},
        starDay: '2022-07-21',
        endDay: '2022-07-22',
        deposit: 1000
      },
      {
        id: 3,
        codeContract: 'HD-0003',
        customer: {name: 'đảm'},
        service: {name: 'hours'},
        starDay: '2022-07-21',
        endDay: '2022-07-22',
        deposit: 1000
      },
      {
        id: 4,
        codeContract: 'HD-0004',
        customer: {name: 'tuyến'},
        service: {name: 'villa'},
        starDay: '2022-07-21',
        endDay: '2022-07-22',
        deposit: 1000
      },
      {
        id: 5,
        codeContract: 'HD-0005',
        customer: {name: 'phúc'},
        service: {name: 'villa'},
        starDay: '2022-07-21',
        endDay: '2022-07-22',
        deposit: 1000
      },
    ]
  }

  ngOnInit(): void {
  }

}
