package com.unla.monipass.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.unla.monipass.entities.Vehicle;
import com.unla.monipass.exceptions.VehicleException;
import com.unla.monipass.repository.VehicleRepository;
import com.unla.monipass.services.IVehicleService;

@Service
public class VehicleService implements IVehicleService{

	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Override
	public Vehicle getVehicleByCode(String Code) throws VehicleException {
		return vehicleRepository.findById(Code).orElseThrow(() 
				-> VehicleException.of(VehicleException.Type.VEHICLE_NOT_FOUND));
	}

	@Override
	public Vehicle createOrUpdateVehicle(Vehicle vehicle) throws Exception{
		vehicleRepository.save(vehicle);
		return vehicle;
	}

}
