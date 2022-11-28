import {Injectable} from '@angular/core';
import {BehaviorSubject} from 'rxjs';
import {AngularFireMessaging} from '@angular/fire/messaging';

@Injectable()
export class MessagingService {
  currentMessage = new BehaviorSubject<any>(null);

  constructor(private angularFireMessaging: AngularFireMessaging) {
  }

  // this function used to request notification permission from page web
  requestPermission() {
    this.angularFireMessaging.requestToken.subscribe(token => {
      console.log("Token: "+token);
    }, error => {
      console.log('Error !!');
    });
  }
  // this function will receive notification from firebase
  receiveMessaging() {
    this.angularFireMessaging.messages.subscribe(msg => {
      console.log('new message recieved', msg);
      this.currentMessage.next(msg);
    });
  }
}
