import {Injectable} from '@angular/core';
import {ProductService} from './ProductService';
import {Cart} from '../model/Cart';
import {Product} from '../model/Product';
@Injectable({
  providedIn: 'root',
})
export class CartService {
  cart: Cart ;
  product: Product;

  constructor(private productService: ProductService) {
  }


  getFromLocalStorage() :Cart[]{
   let cartStorage : Cart[] = [];
     cartStorage = JSON.parse(localStorage.getItem('product'));
    if(cartStorage != null){
      return cartStorage;
    }
    return []

  }
}
