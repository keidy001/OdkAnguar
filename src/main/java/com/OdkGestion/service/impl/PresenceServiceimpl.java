package com.OdkGestion.service.impl;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OdkGestion.exception.RessourceNotFoundException;
import com.OdkGestion.model.Presence;
import com.OdkGestion.model.Utilisateur;
import com.OdkGestion.repository.PresenceRepository;
import com.OdkGestion.repository.UtilisateurRepository;
@Service
public class PresenceServiceimpl implements PresenceService {

	@Autowired
	private PresenceRepository presenceRepository;

	@Override
	public Presence savePresence(Presence presence) {
		// TODO Auto-generated method stub
		return presenceRepository.save(presence);
	}

	@Override
	public List<Presence> getAllPresence() {
		// TODO Auto-generated method stub
		return presenceRepository.findAll();
	}
	

	@Override
	public Presence getPresenceById(long id) {
		Optional<Presence>  presence = presenceRepository.findById(id);
		 if (presence.isPresent()) {
				return presence.get();
			}
			else {
				throw new RessourceNotFoundException("Presence", "Id", id);
			}
	}

	@Override
	public Presence updatePresence(Presence presence, long id) {
		Presence updatePresence = presenceRepository.findById(id).orElseThrow(
				() -> new  RessourceNotFoundException("Presence", "id", id));
							
					updatePresence.setDate(presence.getDate());
					updatePresence.setHeureArrive(presence.getHeureArrive());
					updatePresence.setHeureDepart(presence.getHeureDepart());
					updatePresence.setUtilisateur(presence.getUtilisateur());
					
					presenceRepository.save(updatePresence);
					return updatePresence;
	}

	@Override
	public void deletePresence(long id) {
		presenceRepository.findById(id).orElseThrow(
				() -> new RessourceNotFoundException("Presence", "id", id));
		
		presenceRepository.deleteById(id);
		
	}

	@Override
	public List<Presence> findByPresenceBetween(Date startDate, Date endDate) {
		
		return null;
	}

	



	
	
	
}
