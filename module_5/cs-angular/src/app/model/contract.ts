import {Customer} from "./customer";
import {Service} from "./service";

export interface Contract {
  id?: number;
  codeContract?: string;
  customer?: Customer;
  service?:Service;
  starday?:string;
  endday?:string;
  deposit?:number
}
