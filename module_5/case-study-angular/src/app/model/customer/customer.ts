import {CustomerType} from "./customerType";

export interface Customer {
  id?: number;
  name?: string;
  birthday?: string;
  gender?: number;
  idCard?:string;
  phone?:string;
  email?:string;
  address?:string;
  customerType?: CustomerType;
}
