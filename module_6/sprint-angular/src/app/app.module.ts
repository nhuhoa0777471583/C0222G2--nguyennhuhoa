import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ToastrModule } from 'ngx-toastr';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import { NavBarComponent } from './navbar/nav-bar/nav-bar.component';
import { ProductComponent } from './product/product.component';
import { ProductTypeComponent } from './product-type/product-type.component';
import { ProductSaveComponent } from './product-save/product-save.component';
import { OrderProductComponent } from './order-product/order-product.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { BookComponent } from './book/book.component';
import { DinkComponent } from './dink/dink.component';
import { FoodComponent } from './food/food.component';
import {HttpClientModule} from "@angular/common/http";
import {NgxPaginationModule} from "ngx-pagination";
import {ReactiveFormsModule} from "@angular/forms";
@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    ProductComponent,
    ProductTypeComponent,
    ProductSaveComponent,
    OrderProductComponent,
    EmployeeListComponent,
    BookComponent,
    DinkComponent,
    FoodComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    ToastrModule.forRoot(),
    HttpClientModule,
    ReactiveFormsModule,
    NgxPaginationModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
