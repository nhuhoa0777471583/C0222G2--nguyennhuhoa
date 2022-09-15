import {Component, OnInit} from '@angular/core';
import {ProductService} from '../service/ProductService';
import {Cart} from '../model/Cart';
import {Product} from '../model/Product';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {Title} from '@angular/platform-browser';
import {render} from 'creditcardpayments/creditCardPayments';
import {CartService} from '../service/CartService';
import {ToastrService} from 'ngx-toastr';

declare var $: any;

@Component({
  selector: 'app-cart-product',
  templateUrl: './cart-product.component.html',
  styleUrls: ['./cart-product.component.css']
})
export class CartProductComponent implements OnInit {
  productInCartList: Cart[] = [];
  totalPayment: number;
  totalProduct: number;
  ship: number = 35000;
  product: Product;
  carts = [];
  tempCart: Cart[] = [];
  quantity: number = 1;
  id: number;
  nameProduct: string;
  moneyDola: number;

  constructor(private productService: ProductService,
              private activatedRoute: ActivatedRoute,
              private tile: Title,
              private cartService: CartService,
              private toast: ToastrService) {
    this.tile.setTitle('Giỏ hàng');

  }

  ngOnInit(): void {
    this.getProductInCart();
    this.getTotalPayment();
    render(
      {
        id: "#payments",
        currency: "VND",
        value: "1000000.00",
        onApprove: (details) => {

        }
      }
    );
  }

  showModale(pr: Cart) {
    this.id = pr.id;
    console.log(this.id);
    this.nameProduct = pr.name;
    console.log(this.nameProduct);
  }

  delete(id: number) {
    this.productService.deleteProduct(id).subscribe(d => {
    }, error => {
    }, () => {
      this.toast.success('Sản phẩm đã xóa', 'Thành công');
    });
  }

  payment() {

  }


  getProductInCart() {
    this.productService.getProductInCart().subscribe(d => {
      this.productInCartList = d;
    });

  }

  incrementQuantity(name, quantity) {
    this.carts.forEach(items => {
      if (items.nameProduct == name) {
        items.quantity++;
      }
    });
  }

  getTotalPayment() {
    this.productService.getTotalPayment().subscribe(d => {
      this.totalProduct = d.total;
      if (this.totalProduct > 0) {
        this.totalPayment = this.totalProduct + this.ship;
        this.moneyDola = this.totalPayment / 23000;
      }
    }, error => {
    }, () => {

    });
  }


}
