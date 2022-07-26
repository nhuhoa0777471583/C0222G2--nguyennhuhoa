import {Component, OnInit} from '@angular/core';
import {Todo} from '../model/todo';
import {FormControl} from '@angular/forms';
import {TodoSs9Service} from '../service/todo-ss9.service';
import {error} from '@angular/compiler/src/util';


let _id = 1;

@Component({
  selector: 'app-todo-ss9',
  templateUrl: './todo-ss9.component.html',
  styleUrls: ['./todo-ss9.component.css']
})
export class TodoSs9Component implements OnInit {

  constructor(private todoSs9Service: TodoSs9Service) {
  }

  ngOnInit() {
    this.getAllTodo();
  }

  private getAllTodo() {
    this.todoSs9Service.getAll().subscribe(data => {
      this.todos = data;
    }, error => {

    }, () => {

    });
  }

  todos: Todo[] = [];
  content = new FormControl();


  toggleTodo(i: number) {
    this.todos[i].complete = !this.todos[i].complete;
  }

  add() {
    const value = this.content.value;
    if (value) {
      const todo: Todo = {
        id: _id++,
        content: value,
        complete: false
      };
      this.todoSs9Service.addTodo(value).subscribe(data => {
      }, error1 => {
      }, () => {
        this.ngOnInit();
        alert('thêm mới thành công');
      });
    }
  }

  deleteTodo(id: number) {
    this.todoSs9Service.delete(id).subscribe(data => {
    }, error1 => {
    }, () => {
      this.ngOnInit();
      alert('xóa thành công');
    });
  }


}
