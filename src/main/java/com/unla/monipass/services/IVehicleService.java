package com.unla.monipass.services;

import com.unla.monipass.entities.Vehicle;
import com.unla.monipass.exceptions.VehicleException;

public interface IVehicleService {
	public Vehicle getVehicleByCode(String Code) throws VehicleException;
	public Vehicle createOrUpdateVehicle(Vehicle vehicle) throws Exception;
}
