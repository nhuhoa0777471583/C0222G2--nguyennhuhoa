import { Component, OnInit } from '@angular/core';
import {MessagingService} from '../service/messagingService';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  message: any;

  constructor(private messagingService: MessagingService) { }

  ngOnInit(): void {
  }

  getMess() {
    this.messagingService.requestPermission();
    this.messagingService.receiveMessaging();
    this.message = this.messagingService.currentMessage;
  }
}
