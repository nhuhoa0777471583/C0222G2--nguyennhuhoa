import {Customer} from "./customer/customer";
import {Service} from "./service";

export interface Contract {
  id?: number;
  codeContract?: string;
  customer?: Customer;
  service?:Service;
  starDay?:string;
  endDay?:string;
  deposit?:number
}
