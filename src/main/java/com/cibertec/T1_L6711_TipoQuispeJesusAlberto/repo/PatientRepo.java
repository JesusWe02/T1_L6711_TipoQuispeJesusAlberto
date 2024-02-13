package com.cibertec.T1_L6711_TipoQuispeJesusAlberto.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.T1_L6711_TipoQuispeJesusAlberto.model.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer>{

}
