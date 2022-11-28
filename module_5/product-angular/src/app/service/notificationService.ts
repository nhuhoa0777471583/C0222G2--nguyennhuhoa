import {Injectable} from '@angular/core';
import {BehaviorSubject} from 'rxjs';
import {NotificationPayload} from '../model/notification';

@Injectable({
  providedIn: 'root'
})
export class NotificationService {

  notification$: BehaviorSubject<NotificationPayload> = new BehaviorSubject<NotificationPayload>(null);

  constructor() { }

  setNotification(notification: NotificationPayload) {
    this.notification$.next(notification);
  }

  getNotification() {
    return this.notification$.asObservable();
  }
}
