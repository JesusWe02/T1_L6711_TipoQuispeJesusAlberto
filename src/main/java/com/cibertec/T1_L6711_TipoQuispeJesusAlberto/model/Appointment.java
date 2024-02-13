package com.cibertec.T1_L6711_TipoQuispeJesusAlberto.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "appointment")
public class Appointment {
	@Id
    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @Id
    @OneToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
	
	private LocalDate date;
	private LocalTime time;
}
