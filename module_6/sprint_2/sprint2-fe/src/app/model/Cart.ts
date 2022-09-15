import {Product} from './Product';

export interface Cart {
  id?: number,
  name?: string,
  quantity?: number,
  priceSale?: number,
  total?: number,
  image?: string,
  product?: Product
}
