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
  constructor(public aservice: AuthService) { }
  onlogin(){
    if(this.loginInfo.email == "a@b.com" && this.loginInfo.pwd == "123")
    {
      console.log("User Authenticated")
    }
  }
  ngOnInit() {
  }

}
