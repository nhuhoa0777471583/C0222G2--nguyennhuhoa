import {Component, OnInit} from '@angular/core';
import {Service} from "../../model/service/service";

@Component({
  selector: 'app-service-list',
  templateUrl: './service-list.component.html',
  styleUrls: ['./service-list.component.css']
})
export class ServiceListComponent implements OnInit {
  service: Service[] = [];

  constructor() {
  this.service = [
    {id:1,name:'Villa sát biển',area:100,cost: 10000,maxPeople:5,rentType:'Villa'},
    {id:2,name:'Room sịn',area:100,cost: 10000,maxPeople:4,rentType:'Room'},
    {id:3,name:'House white',area:100,cost: 10000,maxPeople:3,rentType:'House'},
    {id:4,name:'House Blue',area:100,cost: 10000,maxPeople:2,rentType:'House'},
  ]
  }

  ngOnInit(): void {
  }

}
