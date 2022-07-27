import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {ServiceListComponent} from './service-manager/service-list/service-list.component';
import {ServiceAddComponent} from './service-manager/service-add/service-add.component';
import {ServiceEditComponent} from './service-manager/service-edit/service-edit.component';
import {CustomerAddComponent} from './customer-manager/customer-add/customer-add.component';
import {CustomerListComponent} from './customer-manager/customer-list/customer-list.component';
import {CustomerEditComponent} from './customer-manager/customer-edit/customer-edit.component';
import {ContractAddComponent} from './contract-manager/contract-add/contract-add.component';
import {ContractListComponent} from './contract-manager/contract-list/contract-list.component';
import {FooterComponent} from './home/footer/footer.component';
import {NavbarComponent} from './home/navbar/navbar.component';
import {HomePageComponent} from './home/home-page/home-page.component';
import {ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {ToastrModule} from "ngx-toastr";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {NgxPaginationModule} from 'ngx-pagination';



@NgModule({
  declarations: [
    AppComponent,
    ServiceListComponent,
    ServiceAddComponent,
    ServiceEditComponent,
    CustomerAddComponent,
    CustomerListComponent,
    CustomerEditComponent,
    ContractAddComponent,
    ContractListComponent,
    FooterComponent,
    NavbarComponent,
    HomePageComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot(),
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    NgxPaginationModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
