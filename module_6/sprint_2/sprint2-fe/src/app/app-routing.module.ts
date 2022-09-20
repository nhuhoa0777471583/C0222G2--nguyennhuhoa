import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {HomePageComponent} from './home-page/home-page.component';
import {LaptopComponent} from './laptop/laptop.component';
import {SmartPhoneComponent} from './smart-phone/smart-phone.component';
import {ScreenDetailComponent} from './screen-detail/screen-detail.component';
import {CartProductComponent} from './cart-product/cart-product.component';
import {HomeLoginComponent} from './login/home-login/home-login.component';
import {AdminGuard} from './login/authguard/admin.guard';
import {ProductAddComponent} from './product-add/product-add.component';
import {UserGuard} from './login/authguard/user.guard';
import {HistoryListComponent} from './history-list/history-list.component';
import {InforCustomerComponent} from './infor-customer/infor-customer.component';

const routes: Routes = [

  {path: '', component: HomePageComponent},
  // {path: "/:nameSearch", component: HomePageComponent},
  {path: 'laptop', component: LaptopComponent},
  {path: 'laptop/:name', component: LaptopComponent},
  {path: 'smartphone', component: SmartPhoneComponent},
  // {path: "smartphone/:nameSearch", component: SmartPhoneComponent},
  {path: 'detail/:id', component: ScreenDetailComponent},
  {path: 'login', component: HomeLoginComponent},
  {path: 'cart', component: CartProductComponent},
  {path: 'history-bill', component: HistoryListComponent},
  {path: 'info-customer', component: InforCustomerComponent},
  {path: 'product-add', component: ProductAddComponent, canActivate: [AdminGuard]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]

})
export class AppRoutingModule {
}
