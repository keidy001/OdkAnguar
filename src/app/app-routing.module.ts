import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AjouterApprennantComponent } from './ajouter-apprennant/ajouter-apprennant.component';
import { AjouterFormateurComponent } from './ajouter-formateur/ajouter-formateur.component';
import { ListeDePresenceParDateComponent } from './liste-de-presence-par-date/liste-de-presence-par-date.component';
import { ListeDePresenceComponent } from './liste-de-presence/liste-de-presence.component';
import { ListeDesUtilisateursComponent } from './liste-des-utilisateurs/liste-des-utilisateurs.component';
import { LoginComponent } from './login/login.component';
import { ModifierDonneestilisateurComponent } from './modifier-donneestilisateur/modifier-donneestilisateur.component';
import { ModifierMotDePasseComponent } from './modifier-mot-de-passe/modifier-mot-de-passe.component';
import { ModuleDePointageComponent } from './module-de-pointage/module-de-pointage.component';
import { SupprimerLesUtilisateursComponent } from './supprimer-les-utilisateurs/supprimer-les-utilisateurs.component';
import { UtilisateurComponent } from './utilisateur/utilisateur.component';



const routes: Routes = [

  {
    path:'liste-de-presence',
    component:ListeDePresenceComponent
    
  },

  {
    path:'ajouter-formateur',
    component:AjouterFormateurComponent
    
  },

  {
    path:'ajouter-apprennant',
    component:AjouterApprennantComponent
    
  },

  {
    path:'module-de-pointage',
    component:ModuleDePointageComponent},

    {
      path:'modifier-donneestilisateur',
      component:ModifierDonneestilisateurComponent},
      {
        path:'login',
        component:LoginComponent},

        {
          path:'Utilisateur',
          component:UtilisateurComponent},

          {
            path:'supprimer-les-utilisateurs',
            component:SupprimerLesUtilisateursComponent},
            {
              path:'modifier-mot-de-passe',
              component:ModifierMotDePasseComponent},

              {
                path:'liste-des-utilisateurs',
                component:ListeDesUtilisateursComponent},
                {
                  path:'liste-de-presence-date',
                  component:ListeDePresenceParDateComponent
                  
                }
              


    
  

  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
