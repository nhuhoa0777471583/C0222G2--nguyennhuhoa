import {Component, OnInit} from '@angular/core';
import {AuthenticateService} from "../service/AuthenticateService";
import {Router} from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username: '';
  password: '';
  invalidLogin = true;

  constructor(private authenticate: AuthenticateService, private router: Router) {
  }

  ngOnInit(): void {
  }

  checkLogin() {
    this.authenticate.authenticate(this.username, this.password).subscribe(d => {
      console.log(d)
      this.router.navigateByUrl("/");
      this.invalidLogin = false;
    }, error => {
      this.invalidLogin = true
    });
  }
}
