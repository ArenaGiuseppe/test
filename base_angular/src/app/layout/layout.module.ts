import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UtenteLayoutComponent } from './utente-layout/utente-layout.component';
import { UtenteMenuComponent } from './utente-layout/utente-menu/utente-menu.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { UserLayoutComponent } from './user-layout/user-layout.component';
import { UserMenuComponent } from './user-layout/user-menu/user-menu.component';


@NgModule({
  declarations: [UtenteLayoutComponent, UtenteMenuComponent, HeaderComponent, UserLayoutComponent, UserMenuComponent],
  imports: [
    CommonModule,
    RouterModule
  ]
})
export class LayoutModule { }
