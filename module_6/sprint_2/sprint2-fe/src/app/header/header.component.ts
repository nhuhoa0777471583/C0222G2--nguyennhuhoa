import {Component, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';

import {ToastrService} from 'ngx-toastr';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {CookieService} from '../login/service/cookie.service';
import {LogoutService} from '../login/service/logout.service';
import {CommonService} from '../login/service/common.service';
import {ProductService} from '../service/ProductService';
import {FormControl, FormGroup} from '@angular/forms';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  role: string = '';
  username: string = '';
  token: string = '';
  messageReceived: any;
  private subscriptionName: Subscription;
  formSearch: FormGroup;
  nameSearch: string = '';
  beforePrice: string = '';
  afterPrice: string = '';


  constructor(private cookieService: CookieService,
              private toastrService: ToastrService,
              private logoutService: LogoutService,
              private router: Router,
              private commonService: CommonService,
              private productService: ProductService,
              private activate: ActivatedRoute) {
    this.role = this.readCookieService('role');
    this.username = this.readCookieService('username');
    this.token = this.readCookieService('jwToken');
    // subscribe to sender component messages
    this.subscriptionName = this.commonService.getUpdate().subscribe(message => {
      this.messageReceived = message;
      this.role = this.readCookieService('role');
      this.username = this.readCookieService('username');
      this.token = this.readCookieService('jwToken');
    });
  }

  ngOnInit(): void {
    this.searchForm();
  }


  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  onLogout() {
    setTimeout(() => {
      if (this.cookieService.getCookie('jwToken') != null) {
        this.logoutService.onLogout(this.cookieService.getCookie('jwToken')).subscribe(() => {
          this.cookieService.deleteAllCookies();
          this.cookieService.removeAllCookies();
        }, error => {
          switch (error.error) {
            case 'isLogout':
              this.toastrService.warning('Bạn chưa đăng nhập!');
              break;
            case 'LoginExpired':
              this.cookieService.deleteAllCookies();
              this.router.navigateByUrl('/login').then(() => {
                this.toastrService.warning('Hết phiên đăng nhập vui lòng đăng nhập lại!');
                this.sendMessage();
              });
              break;
            default:
              this.cookieService.deleteAllCookies();
              this.cookieService.removeAllCookies();
              this.router.navigateByUrl('/login').then(() => {
                this.toastrService.warning('Hết phiên đăng nhập vui lòng đăng nhập lại!');
                this.sendMessage();
              });
              break;
          }
        }, () => {
          this.router.navigateByUrl('/login').then(() => {
            this.toastrService.success('Đăng xuất thành công!');
            this.sendMessage();
          });
        });
      } else {
        this.toastrService.warning('Bạn chưa đăng nhập!');
      }
    }, 1000);
    this.router.navigateByUrl('/loading').then(() => {
    });
  }

  ngOnDestroy(): void {
    this.subscriptionName.unsubscribe();
  }

  sendMessage(): void {
    // send message to subscribers via observable subject
    this.commonService.sendUpdate('Đăng Xuất thành công!');
  }


  searchForm() {
    this.formSearch = new FormGroup({
      nameSearch: new FormControl('')
    });
  }

  searchNameProduct() {
    this.nameSearch = this.formSearch.value.nameSearch.trim();
    console.log(this.nameSearch);
    // this.router.navigate(['/' , this.nameSearch]).then();
    // this.router.navigate(['/laptop/' , this.nameSearch]).then();
    // this.router.navigate(['/phone/' , this.nameSearch]).then();
  }


}
