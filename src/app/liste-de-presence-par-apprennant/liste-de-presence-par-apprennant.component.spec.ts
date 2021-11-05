import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeDePresenceParApprennantComponent } from './liste-de-presence-par-apprennant.component';

describe('ListeDePresenceParApprennantComponent', () => {
  let component: ListeDePresenceParApprennantComponent;
  let fixture: ComponentFixture<ListeDePresenceParApprennantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeDePresenceParApprennantComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeDePresenceParApprennantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
