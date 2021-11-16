import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {UtenteLayoutComponent} from '../layout/utente-layout/utente-layout.component';
import {UtenteDashboardComponent} from './utente-dashboard/utente-dashboard.component';
import {UsersComponent} from './users/users.component';
import {WorkInProgressComponent} from './work-in-progress/work-in-progress.component';
import {ProgettoComponent} from './progetto/progetto.component';


const routes: Routes = [
    {
        path: 'utente-dashboard', component: UtenteLayoutComponent, children: [
            {path: '', component: UtenteDashboardComponent},
            {path: 'users', component: UsersComponent},
            {path: 'work-in-progress', component: WorkInProgressComponent},
            {path: 'progetti', component: ProgettoComponent}
        ]
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class UtenteRoutingModule {
}
