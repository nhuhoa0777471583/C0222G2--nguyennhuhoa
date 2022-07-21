import {Component, Input, OnChanges, OnInit, SimpleChanges} from '@angular/core';

@Component({
  selector: 'app-child',
  template: '<h2>Child component</h2>current count is {{count}}',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnChanges{
  @Input()
  count: number | undefined ;

  ngOnChanges(changes: SimpleChanges): void {
    for (let property in changes) {
      if (property == 'count') {
        console.log('previous:', changes[property].previousValue);
        console.log('current:', changes[property].currentValue);
        console.log('first', changes[property].firstChange);
      }
    }
  }

  // private count = 0
  // set count(count: number) {
  //   this.count = count;
  //   console.log(count)
  // }
  //
  // get count(): number {
  //   return this.count;
  // }
}
