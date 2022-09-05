import {Component} from '@angular/core';
import {ToastrService} from "ngx-toastr";
import { render } from 'creditcardpayments/creditCardPayments';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'sprint-angular';

  constructor(private toast: ToastrService) {
    render({
        id: "#payments", currency: "VND", value: "1.000.000.000", onApprove: (details) => {}})
  }


}
