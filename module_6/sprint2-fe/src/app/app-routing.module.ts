import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomePageComponent} from './home-page/home-page.component';
import {LaptopComponent} from './laptop/laptop.component';
import {SmartPhoneComponent} from './smart-phone/smart-phone.component';
import {ScreenDetailComponent} from './screen-detail/screen-detail.component';
import {CartProductComponent} from './cart-product/cart-product.component';
import {HomeLoginComponent} from './login/home-login/home-login.component';
import {AdminGuard} from './login/authguard/admin.guard';
import {ProductAddComponent} from './product-add/product-add.component';

const routes: Routes = [

  {path: "", component: HomePageComponent},
  {path: "laptop", component: LaptopComponent},
  {path: "smartphone", component: SmartPhoneComponent, canActivate: [AdminGuard]},
  {path: "detail/:id", component: ScreenDetailComponent},
  {path: "login", component: HomeLoginComponent},
  {path: "cart", component: CartProductComponent},
  {path: "product-add", component: ProductAddComponent, canActivate: [AdminGuard]},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
