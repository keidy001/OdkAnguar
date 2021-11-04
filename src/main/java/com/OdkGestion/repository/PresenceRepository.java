package com.OdkGestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OdkGestion.model.Presence;

public interface PresenceRepository extends JpaRepository<Presence, Long> {

	
}
