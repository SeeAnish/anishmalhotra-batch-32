import { Router } from '@angular/router';
import { AuthService } from './../services/auth.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginInfo = {email: '', pwd: ''}
  isuserloggedin = false;
  constructor(private aservice: AuthService, private router: Router) { }
  onlogin(){
    if(this.loginInfo.email == "a@b.com" && this.loginInfo.pwd == "123")
    {
      this.aservice.login();
      console.log("User Authenticated");
      this.router.navigate(['/sidebar']);
    }
  }
  ngOnInit() {
  }

}
