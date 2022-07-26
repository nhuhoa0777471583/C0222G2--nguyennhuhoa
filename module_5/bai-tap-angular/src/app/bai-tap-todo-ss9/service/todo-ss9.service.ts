import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Todo} from '../model/todo';

@Injectable({
  providedIn: 'root'
})
export class TodoSs9Service {
  private URL_TODO = ' http://localhost:3000/todo/';

  constructor(private httpClient: HttpClient) {
  }


  getAll(): Observable<Todo[]> {
    return this.httpClient.get<Todo[]>(this.URL_TODO);
  }

  addTodo(todo): Observable<Todo> {
    return this.httpClient.post(this.URL_TODO, todo);
  }

  findById(id: number): Observable<Todo> {
    return this.httpClient.get<Todo>(this.URL_TODO + id);
  }

  delete(id: number): Observable<Todo> {
    return this.httpClient.delete<Todo>(this.URL_TODO + id);
  }

  update(todo): Observable<Todo> {
    return this.httpClient.put<Todo>(this.URL_TODO + '/edit' + todo.id, todo);
  }


}
