import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {StudentComponent} from "./test/student/student.component";
import {ClassComponent} from "./test/class/class.component";
import {StudentAddComponent} from "./test/student-add/student-add.component";
import {StudentEditComponent} from "./test/student-edit/student-edit.component";
import {LoHangListComponent} from "./thi/lo-hang-list/lo-hang-list.component";
import {SanPhamListComponent} from "./thi/san-pham-list/san-pham-list.component";
import {LoHangEditComponent} from "./thi/lo-hang-edit/lo-hang-edit.component";
import {LoHangAddComponent} from "./thi/lo-hang-add/lo-hang-add.component";


const routes: Routes = [
  // {path: 'student-list', component: StudentComponent},
  // {path: 'student-add', component: StudentAddComponent},
  // {path:'student-edit/:id', component: StudentEditComponent},
  // {path: 'class', component: ClassComponent},


  {path: "lo-hang-list", component: LoHangListComponent},
  {path: "san-pham-list", component: SanPhamListComponent},
  {path: "lo-hang-edit/:id", component: LoHangEditComponent},
  {path: "lo-hang-add", component: LoHangAddComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
