import {Component, OnInit} from '@angular/core';
import {MessagingService} from './service/messagingService';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit  {
  title = 'product-angular';

  constructor() {
  }
  ngOnInit(){

  }
}
