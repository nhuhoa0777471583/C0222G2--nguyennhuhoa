import {Component, OnInit} from '@angular/core';
import {StudentService} from "../service/student.service";
import {ClassService} from "../service/classService";
import {ClassRoom} from "../model/classRoom";
import {FormControl, FormGroup} from "@angular/forms";
import {ToastrModule, ToastrService} from "ngx-toastr";
import {Router} from "@angular/router";

@Component({
  selector: 'app-student-add',
  templateUrl: './student-add.component.html',
  styleUrls: ['./student-add.component.css']
})
export class StudentAddComponent implements OnInit {
  classList: ClassRoom[] = []
  nameForm: FormGroup;

  constructor(private studentService: StudentService,
              private classService: ClassService,
              private toast: ToastrService, private router: Router) {
  }

  ngOnInit(): void {
    this.getAllClass();
    this.getFormGroup();
  }

  getAllClass() {
    this.classService.getAllCLass().subscribe(data => {
      this.classList = data;
    })
  }

  submit() {
    const student = this.nameForm.value;
    console.log(student)
    this.studentService.addStudent(student).subscribe(data => {
    }, error => {
    }, () => {
      this.router.navigateByUrl("/student-list")
      this.toast.success("them moi thanh cong", "success")
    })
  }

  getFormGroup() {
    this.nameForm = new FormGroup({
      name: new FormControl(),
      dayOfBirth: new FormControl(),
      age: new FormControl(),
      address: new FormControl(),
      classRoom: new FormControl(''),
    })
  }
}
