import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FontSizeEditorComponent } from './font-size-editor/font-size-editor.component';
import { AngularShowPetComponent } from './angular-show-pet/angular-show-pet.component';
import { TestComponent } from './test/test.component';
import {FormsModule} from "@angular/forms";
import { ProductComponent } from './product/product.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { ColorComponent } from './color/color.component';

@NgModule({
  declarations: [
    AppComponent,
    FontSizeEditorComponent,
    AngularShowPetComponent,
    TestComponent,
    ProductComponent,
    CalculatorComponent,
    ColorComponent
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
