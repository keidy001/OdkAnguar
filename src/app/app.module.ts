import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './home/home.component';
import { LayoutModule } from '@angular/cdk/layout';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { LoginComponent } from './login/login.component';
import { LoginApprennatsComponent } from './login-apprennats/login-apprennats.component';
import { ListeDePresenceComponent } from './liste-de-presence/liste-de-presence.component';
import { ModifierMotDePasseComponent } from './modifier-mot-de-passe/modifier-mot-de-passe.component';
import { ModuleDeGestionUtilisateurComponent } from './module-de-gestion-utilisateur/module-de-gestion-utilisateur.component';
import { ModuleDePointageComponent } from './module-de-pointage/module-de-pointage.component';
import { AjouterFormateurComponent } from './ajouter-formateur/ajouter-formateur.component';
import { AjouterApprennantComponent } from './ajouter-apprennant/ajouter-apprennant.component';
import { ModifierDonneestilisateurComponent } from './modifier-donneestilisateur/modifier-donneestilisateur.component';
import { ListeDesUtilisateursComponent } from './liste-des-utilisateurs/liste-des-utilisateurs.component';
import { SupprimerLesUtilisateursComponent } from './supprimer-les-utilisateurs/supprimer-les-utilisateurs.component';
import { ListeDePresenceParApprennantComponent } from './liste-de-presence-par-apprennant/liste-de-presence-par-apprennant.component';
import { ListeDePresenceParDateComponent } from './liste-de-presence-par-date/liste-de-presence-par-date.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { UtilisateurComponent } from './utilisateur/utilisateur.component';
import { ListeUtilisateursComponent } from './liste-utilisateurs/liste-utilisateurs.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    LoginApprennatsComponent,
    ListeDePresenceComponent,
    ModifierMotDePasseComponent,
    ModuleDeGestionUtilisateurComponent,
    ModuleDePointageComponent,
    AjouterFormateurComponent,
    AjouterApprennantComponent,
    ModifierDonneestilisateurComponent,
    ListeDesUtilisateursComponent,
    SupprimerLesUtilisateursComponent,
    ListeDePresenceParApprennantComponent,
    ListeDePresenceParDateComponent,
   
    UtilisateurComponent,
        ListeUtilisateursComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    LayoutModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
