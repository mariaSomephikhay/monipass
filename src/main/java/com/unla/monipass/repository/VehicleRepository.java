package com.unla.monipass.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.unla.monipass.entities.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, String>{

	public Optional<Vehicle> findById(String id);
}
