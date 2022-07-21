import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";


@Component({
  selector: 'app-demo-reactive-form',
  templateUrl: './demo-reactive-form.component.html',
  styleUrls: ['./demo-reactive-form.component.css']
})
export class DemoReactiveFormComponent implements OnInit {

  constructor() {
  }

  ngOnInit(): void {
  }

  contactForm = new FormGroup({
    firstname: new FormControl('',[Validators.required,Validators.minLength(10)]),
    lastname: new FormControl('',[Validators.required]),
    email: new FormControl('',[Validators.required]),
    gender: new FormControl('',[Validators.required]),
    isMarried: new FormControl('',[Validators.required]),
    country: new FormControl('',[Validators.required]),
    address: new FormGroup({
      city: new FormControl('',[Validators.required]),
      stress: new FormControl('',[Validators.required]),
      pincode: new FormControl('',[Validators.required])
    })
  });
  get firstname(){
    return this.contactForm.get('firstname');
  }
  countryList = [
    {id: 1, name: 'Viet Nam'},
    {id: 2, name: 'China'},
    {id: 3, name: 'Russia'},
  ];

  onSubmit() {
    console.log(this.contactForm)
  }
}
