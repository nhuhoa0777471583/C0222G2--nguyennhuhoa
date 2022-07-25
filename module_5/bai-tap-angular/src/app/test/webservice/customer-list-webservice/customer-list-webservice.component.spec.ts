import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerListWebserviceComponent } from './customer-list-webservice.component';

describe('CustomerListWebserviceComponent', () => {
  let component: CustomerListWebserviceComponent;
  let fixture: ComponentFixture<CustomerListWebserviceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomerListWebserviceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerListWebserviceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
