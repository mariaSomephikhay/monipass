package com.unla.monipass.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unla.monipass.entities.Vehicle;
import com.unla.monipass.entities.VehicleLog;

@Repository
public interface VehicleLogRepository extends CrudRepository<VehicleLog, String>{

	public Optional<VehicleLog> findByVehicleAndExitTimeIsNull(Vehicle vehicle);
	
}
