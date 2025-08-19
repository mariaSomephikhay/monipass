package com.unla.monipass.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
@Setter
@Getter
public class VehicleDTO {
	private String vehicleCode;
	private String responsiblePerson;
	private boolean state;
}
