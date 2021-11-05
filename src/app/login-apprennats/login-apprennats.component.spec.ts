import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginApprennatsComponent } from './login-apprennats.component';

describe('LoginApprennatsComponent', () => {
  let component: LoginApprennatsComponent;
  let fixture: ComponentFixture<LoginApprennatsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoginApprennatsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginApprennatsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
