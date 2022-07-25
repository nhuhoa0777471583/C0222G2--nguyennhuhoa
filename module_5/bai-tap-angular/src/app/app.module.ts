import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginFormComponent } from './ss6/login-form/login-form.component';
import { RegisterFormComponent } from './ss6/register-form/register-form.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { TodoComponent } from './ss6/todo/todo.component';
import { TimelinesComponent } from './ss7/thuc-hanh-1/timelines/timelines.component';
import { YoutubePlaylistComponent } from './ss7/thuc-hanh-2/youtube-playlist/youtube-playlist.component';
import { YoutubePlayerComponent } from './ss7/thuc-hanh-2/youtube-player/youtube-player.component';
import { ProductListComponent } from './ss7/product/product-list/product-list.component';
import { ProductCreateComponent } from './ss7/product/product-create/product-create.component';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import { CustomerListWebserviceComponent } from './test/webservice/customer-list-webservice/customer-list-webservice.component';
import { DictionaryPageComponent } from './bai_tap_ss7/dictionary-page/dictionary-page.component';
import { DictionaryDetailPageComponent } from './bai_tap_ss7/dictionary-detail-page/dictionary-detail-page.component';
import { ProductEditComponent } from './ss7/product/product-edit/product-edit.component';
import { ProductDeleteComponent } from './ss7/product/product-delete/product-delete.component';
import {SharedModule} from './thuc-hanh-ss9/shared/shared.module';
import { TodoSs9Component } from './bai-tap-todo-ss9/todo-ss9/todo-ss9.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginFormComponent,
    RegisterFormComponent,
    TodoComponent,
    TimelinesComponent,
    YoutubePlaylistComponent,
    YoutubePlayerComponent,
    ProductListComponent,
    ProductCreateComponent,
    CustomerListWebserviceComponent,
    DictionaryPageComponent,
    DictionaryDetailPageComponent,
    ProductEditComponent,
    ProductDeleteComponent,
    TodoSs9Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule,
    SharedModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
