import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserDashboardComponent } from './user-dashboard/user-dashboard.component';
import { ProjectsComponent } from './projects/projects.component';
import { WorkInProgressComponent } from './work-in-progress/work-in-progress.component';
import {UserRoutingModule} from './user-routing.module';

@NgModule({
  declarations: [UserDashboardComponent, ProjectsComponent, WorkInProgressComponent],
  imports: [
    CommonModule,
    UserRoutingModule
  ]
})
export class UserModule { }
