import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {AppComponent} from './app.component';
import {AngularFireDatabaseModule} from '@angular/fire/database';
import {AngularFireAuthModule} from '@angular/fire/auth';
import {AngularFireMessagingModule} from '@angular/fire/messaging';
import {AngularFireModule} from '@angular/fire';


import {environment} from '../environments/environment';
import {AsyncPipe} from '@angular/common';
import {MessagingService} from './service/messagingService';
import {ChartjsComponent} from './test/chartjs/chartjs.component';
import {HomeComponent} from './chat/components/home/home.component';
import {LandingComponent} from './chat/components/landing/landing.component';
import {LoginComponent} from './chat/components/login/login.component';
import {ProfileComponent} from './chat/components/profile/profile.component';
import {SignUpComponent} from './chat/components/sign-up/sign-up.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    ChartjsComponent,
    HomeComponent,
    LandingComponent,
    LoginComponent,
    ProfileComponent,
    SignUpComponent
  ],
  imports: [
    BrowserModule,
    AngularFireDatabaseModule,
    AngularFireAuthModule,
    AngularFireMessagingModule,
    AngularFireModule.initializeApp(environment.firebase),
    HttpClientModule,
    FormsModule,
  ],
  providers: [MessagingService, AsyncPipe],
  bootstrap: [AppComponent]
})
export class AppModule {
}
