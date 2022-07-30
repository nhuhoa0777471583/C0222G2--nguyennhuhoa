import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsignmentAddComponent } from './consignment-add.component';

describe('ConsignmentAddComponent', () => {
  let component: ConsignmentAddComponent;
  let fixture: ComponentFixture<ConsignmentAddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ConsignmentAddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsignmentAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
