import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './component/home/home.component';
import { ProfileComponent } from './component/profile/profile.component';
import { CreateProfileComponent } from './component/profile/create-profile.component';
import { SelectLanguageStudiesComponent } from './component/profile/select-language-studies.component';
import { StudyComponent } from './component/study/study.component';
import { QuizComponent } from './component/study/quiz.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: '/home',
    pathMatch: 'full'
  },
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'profile',
    component: ProfileComponent
  },
  {
    path: 'profile/create-profile',
    component: CreateProfileComponent
  },
  {
    path: 'profile/select-language-studies',
    component: SelectLanguageStudiesComponent
  },
  {
    path: 'study/:language',
    component: StudyComponent
  },
  {
    path: 'study/:language/quiz',
    component: QuizComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const routedComponents = [
  HomeComponent,
  ProfileComponent,
  CreateProfileComponent,
  SelectLanguageStudiesComponent,
  StudyComponent,
  QuizComponent
];
