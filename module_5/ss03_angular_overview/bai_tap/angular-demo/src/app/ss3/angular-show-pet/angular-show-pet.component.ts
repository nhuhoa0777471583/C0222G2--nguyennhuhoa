import { Component, OnInit } from '@angular/core';
import {Pet} from "../../pet";


@Component({
  selector: 'app-angular-show-pet',
  templateUrl: './angular-show-pet.component.html',
  styleUrls: ['./angular-show-pet.component.css']
})
export class AngularShowPetComponent implements OnInit {
  pet: Pet = {
    name: 'poni',
    image: 'http://yourdost-blog-images.s3-ap-southeast-1.amazonaws.com/wp-content/uploads/2016/01/03165939/Dogs.jpg'
  };
  constructor() { }

  ngOnInit(): void {
  }

}
