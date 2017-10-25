/**
 * Created by Hoang Ta Duy on 10/16/2017.
 */
import {Routes} from "@angular/router/src";
import {RouterModule} from "@angular/router";
import {AppComponent} from "./app.component";

const routesConfig: Routes = [
  {path: '', component: AppComponent}
];

export const providers: any[]=[];

export const routing = RouterModule.forRoot(routesConfig);
