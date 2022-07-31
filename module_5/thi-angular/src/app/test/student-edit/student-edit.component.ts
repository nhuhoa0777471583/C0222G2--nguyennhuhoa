import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {ClassRoom} from "../model/classRoom";
import {ClassService} from "../service/classService";
import {StudentService} from "../service/student.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {ToastrService} from "ngx-toastr";

@Component({
  selector: 'app-student-edit',
  templateUrl: './student-edit.component.html',
  styleUrls: ['./student-edit.component.css']
})
export class StudentEditComponent implements OnInit {
  editForm: FormGroup;
  classList: ClassRoom[] = [];
  idEdit: number;
  studentObj: any;
  classObj: ClassRoom = {};

  constructor(private classService: ClassService,
              private studentService: StudentService,
              private router: Router,
              private activatedRoute: ActivatedRoute, private toastr: ToastrService) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.idEdit = +paramMap.get('id');
      console.log(this.idEdit)
    })
    this.getEdit();
  }

  private getEdit() {
    return this.studentService.findById(this.idEdit).subscribe(data => {
      this.studentObj = data;
      console.log(data)
    }, error => {
    }, () => {
      this.getForm();
    })
  }

  private getForm() {
    this.editForm = new FormGroup({
      id: new FormControl(),
      name: new FormControl(this.studentObj.name),
      dayOfBirth: new FormControl(this.studentObj.dayOfBirth),
      age: new FormControl(this.studentObj.age),
      address: new FormControl(this.studentObj.address),
      classRoom: new FormControl(this.studentObj.classRoom),
    })
  }

  ngOnInit(): void {
    this.getClass();
  }

  private getClass() {
    this.classService.getAllCLass().subscribe(data => {
      this.classList = data;
    }, error => {
    }, () => {
    })
  }


  update(id: number) {
    const std = this.editForm.value;
    console.log(std)
    this.classService.findById(std.classRoom.id).subscribe(data => {
      this.classObj = data;
      console.log(this.classObj)
    }, error => {
    }, () => {
      std.classRoom = this.classObj;
      this.studentService.editStudent(id, std).subscribe(data => {
      }, error => {
      }, () => {
        this.router.navigateByUrl("/student-list")
        this.toastr.success("Edit success")
      })
    })
  }

  valueDeault(c1: ClassRoom, c2: ClassRoom) {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }
}
