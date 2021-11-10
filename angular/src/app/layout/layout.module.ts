import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UtenteLayoutComponent } from './utente-layout/utente-layout.component';
import { UtenteMenuComponent } from './utente-layout/utente-menu/utente-menu.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { ClienteLayoutComponent } from './cliente-layout/cliente-layout.component';
import { ClienteMenuComponent } from './cliente-layout/cliente-menu/cliente-menu.component';


@NgModule({
  declarations: [UtenteLayoutComponent, UtenteMenuComponent, HeaderComponent, ClienteLayoutComponent, ClienteMenuComponent],
  imports: [
    CommonModule,
    RouterModule
  ]
})
export class LayoutModule { }
