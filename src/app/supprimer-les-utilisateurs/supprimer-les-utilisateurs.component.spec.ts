import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SupprimerLesUtilisateursComponent } from './supprimer-les-utilisateurs.component';

describe('SupprimerLesUtilisateursComponent', () => {
  let component: SupprimerLesUtilisateursComponent;
  let fixture: ComponentFixture<SupprimerLesUtilisateursComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SupprimerLesUtilisateursComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SupprimerLesUtilisateursComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
