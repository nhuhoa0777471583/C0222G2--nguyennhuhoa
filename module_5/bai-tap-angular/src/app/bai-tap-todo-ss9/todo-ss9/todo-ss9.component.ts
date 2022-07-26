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

  change() {
    const value = this.content.value;
    if (value) {
      const todo: Todo = {
        id: _id++,
        content: value,
        complete: false
      };
      this.todos.push(todo);
      this.content.reset();
    }
  }
}
