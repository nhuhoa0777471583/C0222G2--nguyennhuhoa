import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DemoTemplateDriveFormComponent } from './demo-template-drive-form.component';

describe('DemoTemplateDriveFormComponent', () => {
  let component: DemoTemplateDriveFormComponent;
  let fixture: ComponentFixture<DemoTemplateDriveFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DemoTemplateDriveFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DemoTemplateDriveFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
