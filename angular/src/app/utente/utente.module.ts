import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { UtenteRoutingModule } from './utente-routing.module';
import { UtenteDashboardComponent } from './utente-dashboard/utente-dashboard.component';
import { UsersComponent } from './users/users.component';
import { WorkInProgressComponent } from './work-in-progress/work-in-progress.component';


@NgModule({
  declarations: [UtenteDashboardComponent, UsersComponent, WorkInProgressComponent],
  imports: [
    CommonModule,
    UtenteRoutingModule,
    FormsModule
  ]
})
export class UtenteModule { }
