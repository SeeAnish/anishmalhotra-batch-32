import { Component } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css'],
  template: ` 
  <p> {{count}} </p>
  <button (click) = "like()">Yolo</button>
  `
})
export class HeaderComponent {
  name: String = "text"
  constructor(){}
  count = 0;
  like(){this.count++;}
}
//Design a header with a background blue with display menu option contact, log in, search box
//navigation shoud be vertical
// when you click on login display log out and vice versa