import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DefinitionComponent } from './definition/definition.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { QuestionsComponent } from './questions/questions.component';

const routes: Routes = [
  {path:'',redirectTo:'home',pathMatch:'full'},
  {path:'home',component:HomeComponent,title:"home component"},
  {path:'definition',component:DefinitionComponent,title:"definition component"},
  {path:'question',component:QuestionsComponent,title:"question component"},
  {path:'**',component:NotFoundComponent,title:"notfound "}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
