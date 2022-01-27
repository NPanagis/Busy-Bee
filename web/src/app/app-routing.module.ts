import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CatalogComponent } from './views/catalog/catalog.component';
import { HomeComponent } from './views/home/home.component';
import { PagenotfoundComponent } from './views/pagenotfound/pagenotfound.component';

const routes: Routes = [
  {path: 'catalog', component: CatalogComponent},
  {path: '', component: HomeComponent},
  {path: '**', component: PagenotfoundComponent}
]

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
