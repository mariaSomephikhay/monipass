package com.unla.monipass.entities;

import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Getter @Setter @NoArgsConstructor
@Table(name="vehicle")
public class Vehicle {
	
	@Id
	@Column(name="vehicle_code", nullable=false)
	private String vehicleCode;
	
	@Column(name="responsible_person", nullable=true)
	private String responsiblePerson;
	
	@Column(name="state", nullable=false)
	private boolean state;
	
	@CreationTimestamp
	@Column(name="created_at", nullable=false)
	private LocalDateTime createdAt;
	
	@UpdateTimestamp
	@Column(name="update_at", nullable=false)
	private LocalDateTime updateAt;

}
