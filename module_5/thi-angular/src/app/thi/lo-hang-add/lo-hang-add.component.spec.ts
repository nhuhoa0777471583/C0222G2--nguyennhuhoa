import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoHangAddComponent } from './lo-hang-add.component';

describe('LoHangAddComponent', () => {
  let component: LoHangAddComponent;
  let fixture: ComponentFixture<LoHangAddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoHangAddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoHangAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
