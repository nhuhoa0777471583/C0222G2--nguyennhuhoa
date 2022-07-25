import { Component, OnInit } from '@angular/core';
import {Todo} from '../model/todo';
import {FormControl} from '@angular/forms';


@Component({
  selector: 'app-todo-ss9',
  templateUrl: './todo-ss9.component.html',
  styleUrls: ['./todo-ss9.component.css']
})
export class TodoSs9Component implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  todos: Todo[] = [];
  content = new FormControl();
  private _id: number;
  toggleTodo(i: number) {
    this.todos[i].complete = !this.todos[i].complete;
  }

  change() {
    const value = this.content.value;
    if (value) {
      const todo: Todo = {
        id: this._id++,
        content: value,
        complete: false
      };
      this.todos.push(todo);
      this.content.reset();
    }
  }
}
