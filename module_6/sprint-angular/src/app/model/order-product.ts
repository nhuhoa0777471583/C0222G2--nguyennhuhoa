import {Product} from "./product";

export interface OrderProduct {
  id?: number,
  codeService?: string,
  cost?: number,
  dateOrder?: string,
  customer?: any,
  product?: Product
}
