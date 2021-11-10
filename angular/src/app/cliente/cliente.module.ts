import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ClienteDashboardComponent } from './cliente-dashboard/cliente-dashboard.component';
import { ProjectsComponent } from './projects/projects.component';
import { WorkInProgressComponent } from './work-in-progress/work-in-progress.component';
import {ClienteRoutingModule} from './cliente-routing.module';

@NgModule({
  declarations: [ClienteDashboardComponent, ProjectsComponent, WorkInProgressComponent],
  imports: [
    CommonModule,
    ClienteRoutingModule
  ]
})
export class ClienteModule { }
