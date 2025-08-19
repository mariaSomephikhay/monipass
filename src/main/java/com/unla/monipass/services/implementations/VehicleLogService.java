package com.unla.monipass.services.implementations;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.unla.monipass.dtos.VehicleLogDTO;
import com.unla.monipass.entities.Vehicle;
import com.unla.monipass.entities.VehicleLog;
import com.unla.monipass.mapper.IVehicleMapper;
import com.unla.monipass.repository.VehicleLogRepository;
import com.unla.monipass.services.IVehicleLogService;
import com.unla.monipass.services.IVehicleService;

@Service
public class VehicleLogService implements IVehicleLogService{

	@Autowired
	private VehicleLogRepository vehicleLogRepository;
	
	@Autowired
	IVehicleMapper vehicleMapper;
	
	@Autowired
	IVehicleService vehicleService;
	
	@Override
	public VehicleLog createOrUpdateVehicle(VehicleLogDTO vehicleLogDTO) throws Exception{
		Vehicle vehicle = vehicleService.getVehicleByCode(vehicleLogDTO.getVehicleCode());
		VehicleLog newVehicleLog = new VehicleLog();
		if(vehicle!=null) {
			Optional<VehicleLog> vehicleLog = vehicleLogRepository.findByVehicleAndExitTimeIsNull(vehicle);
			
			if(vehicleLog.isEmpty() || vehicleLog == null) {
				newVehicleLog.setVehicle(vehicle);
			}else {
				newVehicleLog = vehicleLog.get();
				
				LocalDateTime entryTime = newVehicleLog.getEntryTime();
				LocalDateTime exitTime = LocalDateTime.now();
				double durationHours = Duration.between(entryTime, exitTime).toHours();
				
				newVehicleLog.setExitTime(exitTime);
				newVehicleLog.setDurationHours(durationHours);
			}
			
			vehicleLogRepository.save(newVehicleLog);
			return newVehicleLog;
		}else {
			System.out.println("ERROR");
			//Add error
		}
		
		
		return null;
	}
}
