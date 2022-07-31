import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentComponent } from './test/student/student.component';
import { ClassComponent } from './test/class/class.component';
import {HttpClientModule} from "@angular/common/http";
import { NavbarComponent } from './test/navbar/navbar.component';
import {NgxPaginationModule} from 'ngx-pagination';
import { StudentAddComponent } from './test/student-add/student-add.component';
import {ReactiveFormsModule} from "@angular/forms";

import { ToastrModule } from 'ngx-toastr';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import { StudentEditComponent } from './test/student-edit/student-edit.component';
import { NavBarComponent } from './thi/nav-bar/nav-bar.component';
import { LoHangListComponent } from './thi/lo-hang-list/lo-hang-list.component';
import { SanPhamListComponent } from './thi/san-pham-list/san-pham-list.component';
import { LoHangEditComponent } from './thi/lo-hang-edit/lo-hang-edit.component';
import { LoHangAddComponent } from './thi/lo-hang-add/lo-hang-add.component';

@NgModule({
  declarations: [
    AppComponent,
    StudentComponent,
    ClassComponent,
    NavbarComponent,
    StudentAddComponent,
    StudentEditComponent,
    NavBarComponent,
    LoHangListComponent,
    SanPhamListComponent,
    LoHangEditComponent,
    LoHangAddComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgxPaginationModule,
    ReactiveFormsModule,
    ToastrModule.forRoot(),
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
