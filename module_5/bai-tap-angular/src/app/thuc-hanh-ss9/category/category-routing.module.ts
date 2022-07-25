import {CategoryListComponent} from './category-list/category-list.component';
import {RouterModule, Routes} from '@angular/router';
import {CategoryDeleteComponent} from './category-delete/category-delete.component';
import {CategoryEditComponent} from './category-edit/category-edit.component';
import {NgModule} from '@angular/core';
import {CategoryAddComponent} from './category-add/category-add.component';


const routes: Routes = [
  {path: 'list',component: CategoryListComponent},

  {path: 'create', component: CategoryAddComponent},
  {path: 'edit/:id',component: CategoryEditComponent},
  {path: 'delete/:id',component: CategoryDeleteComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})

export class CategoryRoutingModule {

}
