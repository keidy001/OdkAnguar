package com.OdkGestion.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OdkGestion.exception.RessourceNotFoundException;
import com.OdkGestion.model.Utilisateur;
import com.OdkGestion.repository.UtilisateurRepository;
@Service
public class UtilisateurServiceImp implements UtilisateurService{
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	public Utilisateur saveUtlisateur(Utilisateur utilisateur) {
		
		return utilisateurRepository.save(utilisateur);
	}

	public List<Utilisateur> getAllUtilisateur() {
		// TODO Auto-generated method stub
		return utilisateurRepository.findAll();
	}

	public Utilisateur getUtilisateurById(long id) {
		// TODO Auto-generated method stub
		 Optional<Utilisateur>  utilisateur = utilisateurRepository.findById(id);
		 if (utilisateur.isPresent()) {
				return utilisateur.get();
			}
			else {
				throw new RessourceNotFoundException("Utilisateur", "Id", id);
			}
	}

	public Utilisateur UpdateUtilisateur(Utilisateur utilisateur, long id) {
		Utilisateur updateFormateur = utilisateurRepository.findById(id).orElseThrow(
				() -> new  RessourceNotFoundException("Utilisateur", "id", id));
							
					updateFormateur.setNom(utilisateur.getNom());
					updateFormateur.setPrenom(utilisateur.getPrenom());
					updateFormateur.setAge(utilisateur.getAge());
					updateFormateur.setTelephone(utilisateur.getTelephone());
					updateFormateur.setEmail(utilisateur.getEmail());
					updateFormateur.setLogin(utilisateur.getLogin());
					updateFormateur.setPassword(utilisateur.getPassword());
					updateFormateur.setGenre(utilisateur.getGenre());
					updateFormateur.setDateCreation(utilisateur.getDateCreation());
					updateFormateur.setDateModification(utilisateur.getDateModification());
					
					utilisateurRepository.save(updateFormateur);
					return updateFormateur;
	}

	public void deleteUtilisateur(long id) {
		utilisateurRepository.findById(id).orElseThrow(
				() -> new RessourceNotFoundException("Utilisateur", "id", id));
		
		utilisateurRepository.deleteById(id);
		
	}

}
