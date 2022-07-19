import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularShowPetComponent } from './angular-show-pet.component';

describe('AngularShowPetComponent', () => {
  let component: AngularShowPetComponent;
  let fixture: ComponentFixture<AngularShowPetComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AngularShowPetComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AngularShowPetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
