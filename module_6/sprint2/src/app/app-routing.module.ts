import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {LaptopComponent} from "./laptop/laptop.component";
import {SmartPhoneComponent} from "./smart-phone/smart-phone.component";
import {ScreenDetailComponent} from "./screen-detail/screen-detail.component";
import {LoginComponent} from "./login/login.component";
import {CartProductComponent} from "./cart-product/cart-product.component";
import {HomePageComponent} from "./home-page/home-page.component";


const routes: Routes = [
  {path: "", component: HomePageComponent},
  {path: "laptop", component: LaptopComponent},
  {path: "smartphone", component: SmartPhoneComponent},
  {path: "detail", component: ScreenDetailComponent},
  {path: "login", component: LoginComponent},
  {path: "cart", component: CartProductComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
