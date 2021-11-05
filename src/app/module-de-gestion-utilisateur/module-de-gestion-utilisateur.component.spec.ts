import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModuleDeGestionUtilisateurComponent } from './module-de-gestion-utilisateur.component';

describe('ModuleDeGestionUtilisateurComponent', () => {
  let component: ModuleDeGestionUtilisateurComponent;
  let fixture: ComponentFixture<ModuleDeGestionUtilisateurComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModuleDeGestionUtilisateurComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ModuleDeGestionUtilisateurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
