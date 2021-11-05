import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModuleDePointageComponent } from './module-de-pointage.component';

describe('ModuleDePointageComponent', () => {
  let component: ModuleDePointageComponent;
  let fixture: ComponentFixture<ModuleDePointageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModuleDePointageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ModuleDePointageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
