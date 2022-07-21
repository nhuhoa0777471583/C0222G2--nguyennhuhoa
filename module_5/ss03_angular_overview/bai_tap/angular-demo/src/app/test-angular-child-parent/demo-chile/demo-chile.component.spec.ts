import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DemoChileComponent } from './demo-chile.component';

describe('DemoChileComponent', () => {
  let component: DemoChileComponent;
  let fixture: ComponentFixture<DemoChileComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DemoChileComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DemoChileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
