import {RouterModule, Routes} from '@angular/router';
import {WorkInProgressComponent} from '../user/work-in-progress/work-in-progress.component';
import {NgModule} from '@angular/core';
import {UserLayoutComponent} from '../layout/user-layout/user-layout.component';
import {UserDashboardComponent} from './user-dashboard/user-dashboard.component';
import {ProjectsComponent} from './projects/projects.component';

const routes: Routes = [
    { path: 'user-dashboard', component: UserLayoutComponent, children:[
            { path: '', component: UserDashboardComponent},
            { path: 'projects', component: ProjectsComponent},
            { path: 'work-in-progress', component: WorkInProgressComponent}
        ]}
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class UserRoutingModule { }
