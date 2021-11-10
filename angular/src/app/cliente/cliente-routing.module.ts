import {RouterModule, Routes} from '@angular/router';
import {WorkInProgressComponent} from './/work-in-progress/work-in-progress.component';
import {NgModule} from '@angular/core';
import {ClienteLayoutComponent} from '../layout/cliente-layout/cliente-layout.component';
import {ClienteDashboardComponent} from './cliente-dashboard/cliente-dashboard.component';
import {ProjectsComponent} from './projects/projects.component';

const routes: Routes = [
    { path: 'cliente-dashboard', component: ClienteLayoutComponent, children:[
            { path: '', component: ClienteDashboardComponent},
            { path: 'projects', component: ProjectsComponent},
            { path: 'work-in-progress', component: WorkInProgressComponent}
        ]}
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class ClienteRoutingModule { }
