import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeDePresenceParDateComponent } from './liste-de-presence-par-date.component';

describe('ListeDePresenceParDateComponent', () => {
  let component: ListeDePresenceParDateComponent;
  let fixture: ComponentFixture<ListeDePresenceParDateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeDePresenceParDateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeDePresenceParDateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
