import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeDePresenceComponent } from './liste-de-presence.component';

describe('ListeDePresenceComponent', () => {
  let component: ListeDePresenceComponent;
  let fixture: ComponentFixture<ListeDePresenceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeDePresenceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeDePresenceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
