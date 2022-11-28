import {Component} from '@angular/core';
import {MessagingService} from './service/messagingService';
import {render} from 'creditcardpayments/creditCardPayments';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'push-nofication-angular';
  message;

  constructor(private messagingService: MessagingService) {
  }

  ngOnInit() {
    this.messagingService.requestPermission();
    this.messagingService.receiveMessage();
    this.message = this.messagingService.currentMessage;

    // render(
    //   {
    //     id: '#payments',
    //     currency: 'USD',
    //     value: '100.00',
    //     onApprove: (details) => {
    //       alert('thanh toán thành công');
    //     }
    //   }
    // );
  }

}
