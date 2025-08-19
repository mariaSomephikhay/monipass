package com.unla.monipass.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Getter @Setter @NoArgsConstructor
@Table(name="vehicle_log")
public class VehicleLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@CreationTimestamp
	@Column(name="entry_time", nullable=false)
	private LocalDateTime entryTime;
	
	@Column(name="exit_time", nullable=true)
	private LocalDateTime exitTime;
	
	@Column(name="duration_hours", nullable=true)
	private Double durationHours;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="vehicle_code", nullable=true)
	private Vehicle vehicle;
}
