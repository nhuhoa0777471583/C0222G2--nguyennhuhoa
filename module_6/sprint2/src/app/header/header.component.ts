import {Component, OnInit} from '@angular/core';
import {AuthenticateService} from "../service/AuthenticateService";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private authenticateService: AuthenticateService) {
  }

  ngOnInit(): void {
  }

}
