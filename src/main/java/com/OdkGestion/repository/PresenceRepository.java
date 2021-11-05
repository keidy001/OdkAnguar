package com.OdkGestion.repository;

import java.util.Date;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.OdkGestion.model.Presence;

public interface PresenceRepository extends JpaRepository<Presence, Long> {

	
	
}
