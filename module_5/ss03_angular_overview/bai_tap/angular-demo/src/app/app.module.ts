import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FontSizeEditorComponent } from './font-size-editor-thuc-hanh-ss3/font-size-editor.component';
import { AngularShowPetComponent } from './angular-show-pet-thuc-hanh-ss3/angular-show-pet.component';
import { TestComponent } from './test/test.component';
import {FormsModule} from "@angular/forms";
import { ProductComponent } from './product-thuc-hanh-ss3/product.component';
import { CalculatorComponent } from './calculator-bai-tap-ss3/calculator.component';
import { ColorComponent } from './color-bai-tap-ss3/color.component';
import { ArticleComponent } from './article-th-4/article.component';
import { LikeComponent } from './like_th_4/like.component';
import { NavbaComponent } from './navba/navba.component';
import { NavbarComponent } from './navbar-bai-tap-4/navbar.component';
import { FooterComponent } from './footer-bai-tap-4/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    FontSizeEditorComponent,
    AngularShowPetComponent,
    TestComponent,
    ProductComponent,
    CalculatorComponent,
    ColorComponent,
    ArticleComponent,
    LikeComponent,
    NavbaComponent,
    NavbarComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
