package com.cibertec.T1_L6711_TipoQuispeJesusAlberto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	
	private String patientFName;
	private String patientLName;
	private String patientAddress;
	private String patientPhoneNumber;
	
	@ManyToOne
	private Pharmacy pharmacy;
}
