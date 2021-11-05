import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifierDonneestilisateurComponent } from './modifier-donneestilisateur.component';

describe('ModifierDonneestilisateurComponent', () => {
  let component: ModifierDonneestilisateurComponent;
  let fixture: ComponentFixture<ModifierDonneestilisateurComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModifierDonneestilisateurComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ModifierDonneestilisateurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
