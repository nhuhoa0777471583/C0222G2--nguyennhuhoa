import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';

import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {HttpClientModule} from '@angular/common/http';
import {NgxPaginationModule} from 'ngx-pagination';
import {ToastrModule} from 'ngx-toastr';
import {ShareModule} from './share/share.module';
import {HeaderComponent} from './header/header.component';
import {FooterComponent} from './footer/footer.component';
import {HomePageComponent} from './home-page/home-page.component';
import {SmartPhoneComponent} from './smart-phone/smart-phone.component';
import {LaptopComponent} from './laptop/laptop.component';
import {ScreenDetailComponent} from './screen-detail/screen-detail.component';
import {CartProductComponent} from './cart-product/cart-product.component';
import {HomeLoginComponent} from './login/home-login/home-login.component';
import {ProductAddComponent} from './product-add/product-add.component';
import {ReactiveFormsModule} from '@angular/forms';
import { HistoryListComponent } from './history-list/history-list.component';
import { InforCustomerComponent } from './infor-customer/infor-customer.component';
import { ProductEditComponent } from './product-edit/product-edit.component';
import {AngularFireModule} from '@angular/fire';
import {environment} from '../environments/environment';
import {AngularFireStorageModule} from '@angular/fire/storage';
import { StatisticalComponent } from './statistical/statistical.component';

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
    HomeLoginComponent,
    ProductAddComponent,
    HistoryListComponent,
    InforCustomerComponent,
    ProductEditComponent,
    StatisticalComponent

  ],
  imports: [

    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    HttpClientModule,
    NgxPaginationModule,
    ReactiveFormsModule,
    ToastrModule.forRoot(
      {
        timeOut: 2000,
        closeButton: true,
        progressBar: true,
        positionClass: 'toast-top-left',
        preventDuplicates: true,
      }
    ),
    ShareModule,
    AngularFireStorageModule,
    AngularFireModule.initializeApp(environment.firebaseConfig)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
