import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ConsignmentListComponent} from './product/consignment-list/consignment-list.component';
import {ConsignmentEditComponent} from './product/consignment-edit/consignment-edit.component';
import {ConsignmentAddComponent} from './product/consignment-add/consignment-add.component';
import {ProductListComponent} from './product/product-list/product-list.component';


const routes: Routes = [
  {path: 'consignment-list', component: ConsignmentListComponent},
  {path: 'consignment-add', component: ConsignmentEditComponent},
  {path: 'consignment-edit', component: ConsignmentAddComponent},
  {path: 'product-list', component: ProductListComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
