import { Component, OnInit } from '@angular/core';
import {NgForm} from "@angular/forms";

@Component({
  selector: 'app-demo-template-drive-form',
  templateUrl: './demo-template-drive-form.component.html',
  styleUrls: ['./demo-template-drive-form.component.css']
})
export class DemoTemplateDriveFormComponent implements OnInit {
student ={
  studentCode: 'SV-111',
  name:'tuyến',
  age:'23',
  address:'sai gon',
  class: 'c0322g1'
}
  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(createStudentForm: NgForm) {
    console.log(createStudentForm.value)
  }
}
