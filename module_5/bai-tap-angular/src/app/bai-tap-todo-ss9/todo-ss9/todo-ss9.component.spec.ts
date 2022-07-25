import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TodoSs9Component } from './todo-ss9.component';

describe('TodoSs9Component', () => {
  let component: TodoSs9Component;
  let fixture: ComponentFixture<TodoSs9Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TodoSs9Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TodoSs9Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
