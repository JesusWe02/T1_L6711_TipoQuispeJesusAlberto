package com.cibertec.T1_L6711_TipoQuispeJesusAlberto.service;

import java.util.List;

import com.cibertec.T1_L6711_TipoQuispeJesusAlberto.model.Patient;

public interface PatientService {
	public List<Patient> list();
	public Patient add(Patient pat);
	public Patient update(Patient pat);
	public void delete(int id);
}
