import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  public firstname: string = '';
  lastname: String = '';
  email: String = '';
  password: String = "";
  phoneNumber: string = '';
  dob = new Date;
  ngOnInit() {
    // Initialize any necessary properties or perform other initialization logic here
  }

  displayFormValues() {
    var formValues = "First Name = " + this.firstname + "\n" +
                     "Last Name = " + this.lastname + "\n" +
                     "Phone Number = " + this.phoneNumber + "\n" +
                     "Email = " + this.email + "\n" +
                     "Password = " + this.password + "\n" +
                     "Date = " + this.dob; 
    console.log(formValues); 
  }
}
