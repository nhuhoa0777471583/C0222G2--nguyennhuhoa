import {Injectable} from "@angular/core";
import {ActivatedRouteSnapshot, Router, RouterStateSnapshot} from "@angular/router";
import {AuthenticateService} from "./AuthenticateService";

@Injectable({
  providedIn: "root"
})
export class AuthGaurdService {
  constructor(private router: Router, private authenticateService: AuthenticateService) {
  }

  canActivate(router: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
    if (this.authenticateService.isUserLoggedIn()) {
      return true;
    }
    this.router.navigate(['login']);
    return false;
  }
}
