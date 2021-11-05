import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AjouterApprennantComponent } from './ajouter-apprennant.component';

describe('AjouterApprennantComponent', () => {
  let component: AjouterApprennantComponent;
  let fixture: ComponentFixture<AjouterApprennantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AjouterApprennantComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AjouterApprennantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
