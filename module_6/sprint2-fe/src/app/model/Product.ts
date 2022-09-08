import {Category} from "./Category";

export interface Product {
  id?: number,
  name?: number,
  createDate?: string,
  cost?: number,
  price?: number,
  priceSale?: number,
  madeIn?: string,
  description?: string,
  specifications?: string,
  category?: Category,
  image?: string,
  isDelete?: number,
  statusProduct?: number,
}
