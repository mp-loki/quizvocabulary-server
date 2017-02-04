import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpModule, JsonpModule } from '@angular/http';
import { AUTH_PROVIDERS } from 'angular2-jwt';

import './rxjs-extensions';
import { AppComponent } from './app.component';
import { AppRoutingModule, routedComponents } from './app-routing.module';
import { ProfileService } from './service/profile.service';
import { LanguageService } from './service/language.service';
import { StudyService } from './service/study.service';
import { Auth } from './service/auth.service';
import { AddVocabularyEntryComponent } from './component/study/add-vocabulary-entry.component';

@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpModule,
    JsonpModule,
  ],
  declarations: [
    AppComponent,
    AddVocabularyEntryComponent,
    routedComponents
  ],
  providers: [
    ProfileService,
    LanguageService,
    StudyService,
    Auth,
    AUTH_PROVIDERS
  ],
  bootstrap: [AppComponent],
})
export class AppModule { }
