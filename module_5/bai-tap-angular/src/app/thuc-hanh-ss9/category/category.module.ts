import {CategoryListComponent} from './category-list/category-list.component';
import {NgModule} from '@angular/core';
import {CategoryEditComponent} from './category-edit/category-edit.component';
import {CategoryDeleteComponent} from './category-delete/category-delete.component';
import {CommonModule} from '@angular/common';
import {CategoryRoutingModule} from './category-routing.module';
import {ReactiveFormsModule} from '@angular/forms';
import {CategoryAddComponent} from './category-add/category-add.component';




@NgModule({

  declarations: [CategoryListComponent, CategoryAddComponent, CategoryEditComponent, CategoryDeleteComponent],
  imports: [
    CommonModule,
    CategoryRoutingModule,
    ReactiveFormsModule
  ]
})
export class CategoryModule {

}
