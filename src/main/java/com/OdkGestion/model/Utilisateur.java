package com.OdkGestion.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Profile", discriminatorType = DiscriminatorType.STRING,length= 20)
public  class Utilisateur implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String nom;
		private String prenom;
		private int age;
		private int telephone;
		private String email;
		private String login;
		private String password;
		private String genre;
		private LocalDate dateCreation;
		private LocalDate dateModification;
		@OneToMany(mappedBy = "utilisateur", fetch = FetchType.LAZY)
		private Collection<Presence> presence;
		public Utilisateur() {
			super();
		}
		public Utilisateur(String nom, String prenom, int age, int telephone, String email, String login,
				String password, String genre, LocalDate dateCreation, LocalDate dateModification,
				Collection<Presence> presence) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.age = age;
			this.telephone = telephone;
			this.email = email;
			this.login = login;
			this.password = password;
			this.genre = genre;
			this.dateCreation = dateCreation;
			this.dateModification = dateModification;
			this.presence = presence;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getTelephone() {
			return telephone;
		}
		public void setTelephone(int telephone) {
			this.telephone = telephone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public LocalDate getDateCreation() {
			return dateCreation;
		}
		public void setDateCreation(LocalDate dateCreation) {
			this.dateCreation = dateCreation;
		}
		public LocalDate getDateModification() {
			return dateModification;
		}
		public void setDateModification(LocalDate dateModification) {
			this.dateModification = dateModification;
		}
		public Collection<Presence> getPresence() {
			return presence;
		}
		public void setPresence(Collection<Presence> presence) {
			this.presence = presence;
		}

		
		
}
