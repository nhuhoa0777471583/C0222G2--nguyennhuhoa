  import {Injectable} from "@angular/core";
  import {HttpClient} from "@angular/common/http";
  import {environment} from "../../environments/environment";
  import { map } from 'rxjs/operators';
  import {Observable} from "rxjs";
  const API_URL = `${environment.apiUrl}`

  @Injectable({
    providedIn: "root"
  })
  export class AuthenticateService {
    private AUTH = API_URL + 'authenticate';
    // private header = 'Bearer ' + this.cookieService.getCookie('jwToken');

    constructor(private httpClient: HttpClient) {
    }

    authenticate(username: string, password: string): Observable<any> {
      return this.httpClient.post<any>(this.AUTH, {username, password}).pipe(
        map(
          userData => {
            sessionStorage.setItem('username', username);
            let tokenStr = 'Bearer ' + userData.token;
            sessionStorage.setItem('token', tokenStr);
            return userData;
          }
        )
      );
    }

    isUserLoggedIn() {
      let user = sessionStorage.getItem('username')
      console.log(!(user === null))
      return !(user === null)
    }

    logOut() {
      sessionStorage.removeItem('username')
    }
  }
