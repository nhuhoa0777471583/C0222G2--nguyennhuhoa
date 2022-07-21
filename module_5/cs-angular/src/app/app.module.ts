import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ContractListComponent } from './contract-manager/contract-list/contract-list.component';
import { CustomerListComponent } from './customer-manager/customer-list/customer-list.component';
import { ServiceListComponent } from './service-manager/service-list/service-list.component';
import { HomePageComponent } from './home/home-page/home-page.component';

import { NavbarComponent } from './home/navbar/navbar.component';
import { FooterComponent } from './home/footer/footer.component';
import { ServiceAddComponent } from './service-manager/service-add/service-add.component';
import { ServiceEditComponent } from './service-manager/service-edit/service-edit.component';
import { CustomerAddComponent } from './customer-manager/customer-add/customer-add.component';
import { CustomerEditComponent } from './customer-manager/customer-edit/customer-edit.component';
import { ContractAddComponent } from './contract-manager/contract-add/contract-add.component';

@NgModule({
  declarations: [
    AppComponent,
    ContractListComponent,
    CustomerListComponent,
    ServiceListComponent,
    HomePageComponent,
    NavbarComponent,
    FooterComponent,
    ServiceAddComponent,
    ServiceEditComponent,
    CustomerAddComponent,
    CustomerEditComponent,
    ContractAddComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
