import {ReactiveFormsModule} from '@angular/forms';

import {CommonModule} from '@angular/common';
import {ProductDeleteComponent} from './product-delete/product-delete.component';
import {ProductRoutingModule} from './product-routing.module';
import {ProductEditComponent} from './product-edit/product-edit.component';
import {ProductAddComponent} from './product-add/product-add.component';
import {ProductListComponent} from './product-list/product-list.component';
import {NgModule} from '@angular/core';

@NgModule({
  declarations: [
    ProductListComponent,
    ProductAddComponent,
    ProductEditComponent,
    ProductDeleteComponent
  ],
  imports: [
    CommonModule,
    ProductRoutingModule,
    ReactiveFormsModule
  ]
})
export class ProductModule {
}
