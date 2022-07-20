import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomePageComponent} from "./home/home-page/home-page.component";
import {CustomerListComponent} from "./customer-manager/customer-list/customer-list.component";
import {ServiceListComponent} from "./service-manager/service-list/service-list.component";
import {ContractListComponent} from "./contract-manager/contract-list/contract-list.component";
import {CustomerAddComponent} from "./customer-manager/customer-add/customer-add.component";
import {CustomerEditComponent} from "./customer-manager/customer-edit/customer-edit.component";
import {ServiceAddComponent} from "./service-manager/service-add/service-add.component";
import {ServiceEditComponent} from "./service-manager/service-edit/service-edit.component";
import {ContractAddComponent} from "./contract-manager/contract-add/contract-add.component";

const routes: Routes = [
  {path: '', component: HomePageComponent},
  {path: 'customer', component: CustomerListComponent},
  {path: 'service', component: ServiceListComponent},
  {path: 'contract', component: ContractListComponent},
  {path:'customer-add',component:CustomerAddComponent},
  {path:'customer-edit',component:CustomerEditComponent},
  {path:'service-add', component:ServiceAddComponent},
  {path:'service-edit', component:ServiceEditComponent},
  {path:'contract-add', component:ContractAddComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
