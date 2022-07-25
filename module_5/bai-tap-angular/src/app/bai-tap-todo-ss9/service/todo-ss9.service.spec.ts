import { TestBed } from '@angular/core/testing';

import { TodoSs9Service } from './todo-ss9.service';

describe('TodoSs9Service', () => {
  let service: TodoSs9Service;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TodoSs9Service);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
