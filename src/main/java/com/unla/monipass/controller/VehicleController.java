package com.unla.monipass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.unla.monipass.dtos.VehicleDTO;
import com.unla.monipass.dtos.VehicleLogDTO;
import com.unla.monipass.mapper.IVehicleMapper;
import com.unla.monipass.services.IVehicleLogService;
import com.unla.monipass.services.IVehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	IVehicleService vehicleService;
	
	@Autowired
	IVehicleLogService vehicleLogService;
	
	@Autowired
	IVehicleMapper vehicleMapper;
	
	@PostMapping("/new")
	public ResponseEntity<Object> newVehicle (@RequestBody VehicleDTO newVehicle){	
		try {	
			vehicleService.createOrUpdateVehicle(vehicleMapper.dtoToUser(newVehicle));
			return ResponseEntity.status(HttpStatus.CREATED).body("Vehiculo creado exitosamente");
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al crear el Vehiculo, " + e.getMessage());
		}
	}
	
	@PostMapping("/login")
	public ResponseEntity<Object> loginVehicle (@RequestBody VehicleLogDTO vehicleLog){	
		try {	
			vehicleLogService.createOrUpdateVehicle(vehicleLog);
			return ResponseEntity.status(HttpStatus.OK).body("Se a ingresado correctamente");
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Error al ingresar, " + e.getMessage());
		}
	}
}
