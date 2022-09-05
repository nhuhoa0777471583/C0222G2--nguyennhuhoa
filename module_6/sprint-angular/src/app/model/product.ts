import {ProductType} from "./product-type";
import {OrderProduct} from "./order-product";

export interface Product {
  id?: number,
  codeProduct?: string,
  price?: number,
  statusProduct?: string,
  creationDate?: string,
  isDeleted?: boolean,
  orderProductList?:OrderProduct,
  productType?: ProductType
}
