import {Component, OnInit} from '@angular/core';
import {ClassRoom} from "../model/classRoom";
import {ClassService} from "../service/classService";

@Component({
  selector: 'app-class',
  templateUrl: './class.component.html',
  styleUrls: ['./class.component.css']
})
export class ClassComponent implements OnInit {
  classList: ClassRoom[] = [];
  p: number = 1;

  constructor(private classService: ClassService) {
  }

  ngOnInit(): void {
    this.getAll();
  }

  private getAll() {
    this.classService.getAllCLass().subscribe(data => {
      this.classList = data;
    }, error => {
    }, () => {
    })
  }
}
