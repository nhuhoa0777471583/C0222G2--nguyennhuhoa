import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {TimelinesComponent} from './ss7/thuc-hanh-1/timelines/timelines.component';
import {YoutubePlaylistComponent} from './ss7/thuc-hanh-2/youtube-playlist/youtube-playlist.component';
import {YoutubePlayerComponent} from './ss7/thuc-hanh-2/youtube-player/youtube-player.component';
import {ProductListComponent} from './ss7/product/product-list/product-list.component';
import {ProductCreateComponent} from './ss7/product/product-create/product-create.component';
import {DictionaryPageComponent} from './bai_tap_ss7/dictionary-page/dictionary-page.component';
import {DictionaryDetailPageComponent} from './bai_tap_ss7/dictionary-detail-page/dictionary-detail-page.component';
import {ProductEditComponent} from './ss7/product/product-edit/product-edit.component';
import {ProductDeleteComponent} from './ss7/product/product-delete/product-delete.component';


const routes: Routes = [
  // {
  //   path: 'timelines',
  //   component: TimelinesComponent
  //
  // },
  // {
  //   path: 'youtube',
  //   component: YoutubePlaylistComponent, children: [{
  //     path: 'id', component: YoutubePlayerComponent
  //   }]
  // },
  {path: 'product/list', component: ProductListComponent},
  {path: 'product/create', component: ProductCreateComponent},
  {path: 'product/edit/:id', component: ProductEditComponent},
  {path: 'product/delete/:id', component: ProductDeleteComponent},

  {path: 'list', component: DictionaryPageComponent},
  {path: 'info/:id', component: DictionaryDetailPageComponent},

  {
    path: 'product9',
    loadChildren: () => import('./thuc-hanh-ss9/product/product.module').then(module => module.ProductModule)
  },
  {
    path: 'category',
    loadChildren: () => import('./thuc-hanh-ss9/category/category.module').then(module => module.CategoryModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
