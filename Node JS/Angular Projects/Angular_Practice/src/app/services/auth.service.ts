import { Injectable } from "@angular/core";

@Injectable({providedIn: "root"}) 

export class AuthService {
private _isLoggedIn = false;
    get isAuthenticated() {
        return this._isLoggedIn;
    }
constructor() {}
login() {
    this._isLoggedIn = true;
}

logout(){
    this._isLoggedIn = false;
}

// isAuthenticated(): boolean {
//     const isLoggedIn = localStorage.getItem("isLoggedIn");
//     return isLoggedIn === 'true';
// }
}
