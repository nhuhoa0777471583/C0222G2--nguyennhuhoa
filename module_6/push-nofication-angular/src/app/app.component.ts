import { Component } from '@angular/core';
import {MessagingService} from './service/messagingService';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'push-nofication-angular';
  message;
  constructor(private messagingService: MessagingService) {}
  ngOnInit() {
    this.messagingService.requestPermission()
    this.messagingService.receiveMessage()
    this.message = this.messagingService.currentMessage
  }
}
