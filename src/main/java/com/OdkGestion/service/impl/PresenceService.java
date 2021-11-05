package com.OdkGestion.service.impl;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.OdkGestion.model.Presence;

public interface PresenceService {

	public Presence savePresence(Presence presence);
	public List<Presence> getAllPresence();
	public Presence getPresenceById(long id);
	public Presence updatePresence(Presence presence, long id);
	public void deletePresence(long id);
	public List<Presence>findByPresenceBetween (Date startDate, Date endDate);

}
