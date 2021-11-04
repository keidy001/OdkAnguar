package com.OdkGestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OdkGestion.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

	
}
