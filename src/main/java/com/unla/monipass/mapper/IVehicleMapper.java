package com.unla.monipass.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.unla.monipass.dtos.VehicleDTO;
import com.unla.monipass.entities.Vehicle;

@Mapper(componentModel = "spring")
public interface IVehicleMapper {
	
	@Mapping(target = "createdAt", ignore = true)
	@Mapping(target = "updateAt", ignore = true)
	Vehicle dtoToUser(VehicleDTO dto);

	VehicleDTO vehicleToDto(Vehicle vehicle);

}
