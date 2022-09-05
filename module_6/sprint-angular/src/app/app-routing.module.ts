import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ProductComponent} from "./product/product.component";
import {ProductSaveComponent} from "./product-save/product-save.component";
import {OrderProductComponent} from "./order-product/order-product.component";
import {EmployeeListComponent} from "./employee-list/employee-list.component";
import {BookComponent} from "./book/book.component";
import {DinkComponent} from "./dink/dink.component";
import {FoodComponent} from "./food/food.component";
import {ProductTypeComponent} from "./product-type/product-type.component";


const routes: Routes = [
  {path: "product-list", component: ProductComponent},
  {path: "product-save", component: ProductSaveComponent},
  {path: "order-product", component: OrderProductComponent},
  {path: "employee-list", component: EmployeeListComponent},
  {path: "book", component: BookComponent},
  {path: "dink", component: DinkComponent},
  {path: "food", component: FoodComponent},
  {path: "product-type", component: ProductTypeComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
