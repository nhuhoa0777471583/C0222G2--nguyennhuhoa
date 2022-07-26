import {RouterModule, Routes} from '@angular/router';
import {NgModule} from '@angular/core';
import {ProductDeleteComponent} from './product-delete/product-delete.component';
import {ProductEditComponent} from './product-edit/product-edit.component';
import {ProductAddComponent} from './product-add/product-add.component';
import {ProductListComponent} from './product-list/product-list.component';


const routes: Routes = [
  {
    path: 'list',
    component: ProductListComponent
  }, {
    path: 'create',
    component: ProductAddComponent
  }, {
    path: 'edit/:id',
    component: ProductEditComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductRoutingModule {
}
