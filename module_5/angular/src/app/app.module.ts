import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TodoComponent } from './ss6/todo/todo.component';
import {ReactiveFormsModule} from "@angular/forms";
import { RegisterFormComponent } from './ss6/register-form/register-form.component';
import { LoginFormComponent } from './ss6/login-form/login-form.component';
import { CountdownTimeComponent } from './ss5/countdown-time/countdown-time.component';
import { RatingBarComponent } from './ss5/rating-bar/rating-bar.component';

@NgModule({
  declarations: [
    AppComponent,
    TodoComponent,
    RegisterFormComponent,
    LoginFormComponent,
    CountdownTimeComponent,
    RatingBarComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
