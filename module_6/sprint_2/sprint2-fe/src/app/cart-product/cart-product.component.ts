import {Component, OnInit} from '@angular/core';
import {ProductService} from '../service/ProductService';
import {Cart} from '../model/Cart';
import {Product} from '../model/Product';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {Title} from '@angular/platform-browser';
import {render} from 'creditcardpayments/creditCardPayments';
import {CartService} from '../service/CartService';
import {ToastrService} from 'ngx-toastr';
import {Customer} from '../model/Customer';
import {CustomerService} from '../service/CustomerService';
import {CookieService} from '../login/service/cookie.service';

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
  quantity: Cart[];
  id: number;
  nameProduct: string;
  moneyDola: number;
  customer: Customer;
  role: string = '';
  username: string = '';
  token: string = '';
  codeSale: number;
  public inforStatus: boolean = false;

  constructor(private productService: ProductService,
              private activatedRoute: ActivatedRoute,
              private tile: Title,
              private cartService: CartService,
              private toast: ToastrService,
              private router: Router,
              private customerService: CustomerService, private cookieService: CookieService,) {
    this.tile.setTitle('Giỏ hàng');
    this.role = this.readCookieService('role');
    this.username = this.readCookieService('username');
    this.token = this.readCookieService('jwToken');
    this.getCustomerByUserName(this.username);
  }

  ngOnInit(): void {
    this.getProductInCart(this.customer);

  }

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  showModale(pr: Cart) {
    this.id = pr.id;
    console.log(this.id);
    this.nameProduct = pr.name;
    console.log(this.nameProduct);
  }

  delete(id: number) {
    this.productService.deleteByIdProduct(id).subscribe(d => {
    }, error => {
    }, () => {
      this.productInCartList = [];
      this.toast.success('Sản phẩm đã xóa', 'Thành công');
    });
  }

  payment() {
    this.router.navigateByUrl('/loading').then(() => {
      this.cartService.goPayment(this.customer).subscribe(() => {
        setTimeout(() => {
          this.router.navigateByUrl('/list-product').then(() => {
            this.toast.success('Thanh toán thành công!');
          });
        }, 500);
      });
    });
  }

  getCustomerByUserName(username: string) {
    this.customerService.getCustomerByUserName(username).subscribe(d => {
      this.customer = d;
      if (d == null) {
        this.inforStatus = true;
      } else {
        this.inforStatus = d.appUser.isDeleted;
        this.getProductInCart(d);
      }
    });
  }

  getProductInCart(c: Customer) {
    this.cartService.getProductInCart(c).subscribe((d: Cart[]) => {
      this.productInCartList = d;
      console.log(d);
      this.calculation(d);
    });
  }

  calculation(productCart: Cart[]) {
    this.totalProduct = 0;
    for (let i = 0; i < productCart.length; i++) {
      this.totalProduct += (productCart[i].quantity * productCart[i].product.priceSale);
      this.totalPayment = this.ship + this.totalProduct;
    }
    this.totalPayment = (this.ship + this.totalProduct)  ;
    this.moneyDola = this.totalPayment / 23000;
    render(
      {
        id: '#payments',
        currency: 'VND',
        value: '1000000.00',
        onApprove: (details) => {

        }
      }
    );
  }


  // getTotalMoneyPayment() {
  //   this.totalProduct = 0;
  //   this.moneyDola = 0;
  //   this.totalPayment = 0;
  //     if (this.totalProduct > 0) {
  //       this.totalPayment = this.totalProduct + this.ship;
  //       this.moneyDola = this.totalPayment / 23000;
  //     }
  // }



  minusQuantity(productOrder: Cart) {
    this.cartService.minusQuantity(productOrder).subscribe(value => {
      this.productInCartList = value;
      console.log(value);
      this.quantity = value;
      console.log(value);
    });
  }
}
