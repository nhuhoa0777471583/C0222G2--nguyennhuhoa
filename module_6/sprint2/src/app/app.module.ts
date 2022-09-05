import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { HomePageComponent } from './home-page/home-page.component';
import { SmartPhoneComponent } from './smart-phone/smart-phone.component';
import { LaptopComponent } from './laptop/laptop.component';
import { ScreenDetailComponent } from './screen-detail/screen-detail.component';
import { CartProductComponent } from './cart-product/cart-product.component';
import { LoginComponent } from './login/login.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomePageComponent,
    SmartPhoneComponent,
    LaptopComponent,
    ScreenDetailComponent,
    CartProductComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
