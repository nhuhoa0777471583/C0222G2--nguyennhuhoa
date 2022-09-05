import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DinkComponent } from './dink.component';

describe('DinkComponent', () => {
  let component: DinkComponent;
  let fixture: ComponentFixture<DinkComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DinkComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DinkComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
