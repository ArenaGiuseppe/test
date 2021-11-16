import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { UtenteRoutingModule } from './utente-routing.module';
import { UtenteDashboardComponent } from './utente-dashboard/utente-dashboard.component';
import { UsersComponent } from './users/users.component';
import { WorkInProgressComponent } from './work-in-progress/work-in-progress.component';
import { ProgettoComponent } from './progetto/progetto.component';
import { DocumentoComponent } from './documento/documento.component';
import { ClienteComponent } from './cliente/cliente.component';


@NgModule({
  // tslint:disable-next-line:max-line-length
  declarations: [UtenteDashboardComponent, UsersComponent, WorkInProgressComponent, ProgettoComponent, DocumentoComponent, ClienteComponent],
  imports: [
    CommonModule,
    UtenteRoutingModule,
    FormsModule
  ]
})
export class UtenteModule { }
