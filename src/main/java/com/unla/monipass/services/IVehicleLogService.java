package com.unla.monipass.services;

import com.unla.monipass.dtos.VehicleLogDTO;
import com.unla.monipass.entities.VehicleLog;

public interface IVehicleLogService {

	VehicleLog createOrUpdateVehicle(VehicleLogDTO vehicleLogDTO) throws Exception;

}
