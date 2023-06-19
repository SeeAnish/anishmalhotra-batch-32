import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./bootstrap.css'],
  template: ` 
  <p> {{count}} </p>
  <button (click) = "like()">Yolo</button>
  `
})
export class HeaderComponent implements OnInit {
  public inputValue: String = "";
  constructor(){
    this.inputValue;
  }
  isLoggedIn:boolean = false;
  toggleLogin() {
    this.isLoggedIn = !this.isLoggedIn;
  }
  count = 0;
  like(){this.count++;}
  ngOnInit() {
  }
}
//'./bootstrap.min.css','./header.component.css'