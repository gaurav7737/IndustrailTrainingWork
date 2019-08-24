import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './component/home/home.component';
import { SearchComponent } from './component/search/search.component';
import { Book } from './model/book';
import { BookComponent } from './component/book/book.component';
import { CartComponent } from './component/cart/cart.component';

const routes: Routes = [
  { path:'home',component: HomeComponent},
  { path: 'search',component: SearchComponent},
  { path: '',redirectTo: '/home',pathMatch: 'full'},
  {path: 'cart',component: CartComponent},

  {path:'book/:id', pathMatch: 'full', component:BookComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
