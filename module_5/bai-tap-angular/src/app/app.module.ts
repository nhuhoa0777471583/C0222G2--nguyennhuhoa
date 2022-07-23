import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginFormComponent } from './ss6/login-form/login-form.component';
import { RegisterFormComponent } from './ss6/register-form/register-form.component';
import {ReactiveFormsModule} from '@angular/forms';
import { TodoComponent } from './ss6/todo/todo.component';
import { TimelinesComponent } from './ss7/timelines/timelines.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginFormComponent,
    RegisterFormComponent,
    TodoComponent,
    TimelinesComponent
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
