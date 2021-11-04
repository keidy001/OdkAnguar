package com.OdkGestion.model;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Apprenants")
public class Apprenant extends Utilisateur {
	private ApprenantStatus apprenantStatus;

	public Apprenant() {
		super();
	}

	public Apprenant(String nom, String prenom, int age, int telephone, String email, String login, String password,
			String genre, LocalDate dateCreation, LocalDate dateModification, Collection<Presence> presence,
			ApprenantStatus apprenantStatus) {
		super(nom, prenom, age, telephone, email, login, password, genre, dateCreation, dateModification, presence);
		this.apprenantStatus = apprenantStatus;
	}
	
	
	
	
}
