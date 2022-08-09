import {Injectable} from '@angular/core';
import {BehaviorSubject} from 'rxjs';
import {AngularFireMessaging} from '@angular/fire/messaging';

@Injectable()
export class MessagingService {
  currentMessage = new BehaviorSubject<any>(null);

  constructor(private angularFireMessaging: AngularFireMessaging) {
  }

  requestPermission() {
    this.angularFireMessaging.requestToken.subscribe(token => {
      console.log(token);
    }, error => {
      console.log('Error !!');
    });
  }

  receiveMessaging() {
    this.angularFireMessaging.messages.subscribe(payload => {
      console.log('new message recieved', payload);
      this.currentMessage.next(payload);
    });
  }
}
