import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent {

  number1 = 0;
  number2 = 0;
  result = 0;


  // @ts-ignore
  cal(operator) {
    switch (operator) {
      case '+':
        return this.result = this.number1 + this.number2;
      case '-':
        return this.result = this.number1 - this.number2;
      case '/':
        if(this.number2 != 0){
          return this.result = this.number1 / this.number2;
        }else {
          return "no number is divisible by 0!"
        }
      case '*':
        return this.result = this.number1 * this.number2;
    }
  }
}
