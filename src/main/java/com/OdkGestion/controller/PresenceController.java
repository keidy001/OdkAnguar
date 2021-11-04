package com.OdkGestion.controller;

import java.util.Date;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.OdkGestion.model.Presence;
import com.OdkGestion.model.Utilisateur;
import com.OdkGestion.service.impl.PresenceService;
import com.OdkGestion.service.impl.UtilisateurService;
@RestController
@RequestMapping("/api/presences")
public class PresenceController {
	@Autowired
	private PresenceService presenceService;
	@PostMapping()
	public ResponseEntity<Presence> saveApprenant(@RequestBody Presence presence){
		return new ResponseEntity<Presence>(presenceService.savePresence(presence),HttpStatus.CREATED);
	}
	@GetMapping
	public List<Presence> getAllApprenants(){
		return presenceService.getAllPresence();
		
	}
	@GetMapping("{id}")
	public  ResponseEntity<Presence> getPresenceById(@PathVariable("id")long presenceId){
		return new ResponseEntity<Presence>(presenceService.getPresenceById(presenceId), HttpStatus.OK);
		
	}
	@PutMapping("{id}")
	public ResponseEntity<Presence> updatePresence(@PathVariable("id") long id,@RequestBody Presence presence){
		return new ResponseEntity<Presence>(presenceService.updatePresence(presence, id), HttpStatus.OK);
		
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deletePresence(@PathVariable("id") long id ){
		presenceService.deletePresence(id);
		return new ResponseEntity<String>("Liste de présence supprimer avec succes.", HttpStatus.OK);
		
	}
	
	@GetMapping("/jours")
	public ResponseEntity<List<Presence>> getPresenceByDate(@RequestParam Date jour) {
		return new ResponseEntity<List<Presence>>(presenceService.findByJour(jour), HttpStatus.OK);
	}
}
