package com.OdkGestion.service.impl;

import java.util.List;
import com.OdkGestion.model.Utilisateur;

public interface UtilisateurService {
	
	public Utilisateur saveUtlisateur(Utilisateur utilisateur);
	public List<Utilisateur> getAllUtilisateur();
	public Utilisateur getUtilisateurById(long id);
	public Utilisateur UpdateUtilisateur(Utilisateur utilisateur, long id);
	public void deleteUtilisateur(long id);
}






