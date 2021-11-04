package com.OdkGestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.OdkGestion.model.Utilisateur;
import com.OdkGestion.service.impl.UtilisateurService;

@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurController {
	@Autowired
	private UtilisateurService utilisateurService;
	@PostMapping()
	public ResponseEntity<Utilisateur> saveApprenant(@RequestBody Utilisateur utilisateur){
		return new ResponseEntity<Utilisateur>(utilisateurService.saveUtlisateur(utilisateur),HttpStatus.CREATED);
	}
	@GetMapping
	public List<Utilisateur> getAllApprenants(){
		return utilisateurService.getAllUtilisateur();
		
	}
	@GetMapping("{id}")
	public  ResponseEntity<Utilisateur> getApprenantById(@PathVariable("id")long apprenantId){
		return new ResponseEntity<Utilisateur>(utilisateurService.getUtilisateurById(apprenantId), HttpStatus.OK);
		
	}
	@PutMapping("{id}")
	public ResponseEntity<Utilisateur> updateUtilisateur(@PathVariable("id") long id,@RequestBody Utilisateur apprenant){
		return new ResponseEntity<Utilisateur>(utilisateurService.UpdateUtilisateur(apprenant, id), HttpStatus.OK);
		
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteUtilisateur(@PathVariable("id") long id ){
		utilisateurService.deleteUtilisateur(id);
		return new ResponseEntity<String>("Utilisateur supprimer avec succes.", HttpStatus.OK);
		
	}
}
