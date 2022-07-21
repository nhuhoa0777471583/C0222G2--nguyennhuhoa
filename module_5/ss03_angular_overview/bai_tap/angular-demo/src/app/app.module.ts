import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {FontSizeEditorComponent} from './ss3/font-size-editor/font-size-editor.component';
import {AngularShowPetComponent} from './ss3/angular-show-pet/angular-show-pet.component';
import {TestComponent} from './test/test.component';
import {FormsModule} from "@angular/forms";
import {ProductComponent} from './ss3/product/product.component';
import {CalculatorComponent} from './ss3/calculator/calculator.component';
import {ColorComponent} from './ss4/color/color.component';
import {ArticleComponent} from './ss4/article/article.component';
import {LikeComponent} from './ss4/like/like.component';
import {NavbarComponent} from './ss4/navbar/navbar.component';
import {FooterComponent} from './ss4/footer/footer.component';
import { ChildComponent } from './test-angular-child-parent/child/child.component';
import { DemoChileComponent } from './test-angular-child-parent/demo-chile/demo-chile.component';
import { NameCardComponent } from './ss5/name-card/name-card.component';
import { ProgressBarComponent } from './ss5/progress-bar/progress-bar.component';
import { RatingBarComponent } from './ss5/rating-bar/rating-bar.component';
import { CountdownTimerComponent } from './ss5/countdown-timer/countdown-timer.component';

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
    NavbarComponent,
    FooterComponent,
    ChildComponent,
    DemoChileComponent,
    NameCardComponent,
    ProgressBarComponent,
    RatingBarComponent,
    CountdownTimerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
