import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {ConsignmentListComponent} from './product/consignment-list/consignment-list.component';
import {ConsignmentAddComponent} from './product/consignment-add/consignment-add.component';
import {ConsignmentEditComponent} from './product/consignment-edit/consignment-edit.component';
import {ProductListComponent} from './product/product-list/product-list.component';
import {NavbarComponent} from './navbar/navbar.component';
import {NgxPaginationModule} from 'ngx-pagination';
import {HttpClientModule} from '@angular/common/http';
import {ToastrModule} from 'ngx-toastr';
import {ReactiveFormsModule} from '@angular/forms';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {environment} from '../environments/environment';

import {AngularFireModule} from '@angular/fire';



@NgModule({
  declarations: [
    AppComponent,
    ConsignmentListComponent,
    ConsignmentAddComponent,
    ConsignmentEditComponent,
    ProductListComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgxPaginationModule,
    HttpClientModule,
    ToastrModule.forRoot(),
    ReactiveFormsModule,
    BrowserAnimationsModule,
    AngularFireModule.initializeApp(environment.firebaseConfig)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
