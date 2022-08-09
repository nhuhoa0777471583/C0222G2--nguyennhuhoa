import {Component, OnInit} from '@angular/core';
import {MessagingService} from './service/messagingService';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit  {
  title = 'product-angular';
  message: any;
  constructor(private messagingService: MessagingService) {
  }
  ngOnInit(){
    this.messagingService.requestPermission();
    this.messagingService.receiveMessaging();
    this.message = this.messagingService.currentMessage;
  }
}
