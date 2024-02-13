package com.cibertec.T1_L6711_TipoQuispeJesusAlberto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.T1_L6711_TipoQuispeJesusAlberto.model.Patient;
import com.cibertec.T1_L6711_TipoQuispeJesusAlberto.repo.PatientRepo;
import com.cibertec.T1_L6711_TipoQuispeJesusAlberto.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepo patientRepo;
	
	@Override
	public List<Patient> list() {
		// TODO Auto-generated method stub
		return patientRepo.findAll();
	}

	@Override
	public Patient add(Patient pat) {
		// TODO Auto-generated method stub
		return patientRepo.save(pat);
	}

	@Override
	public Patient update(Patient pat) {
		// TODO Auto-generated method stub
		return patientRepo.save(pat);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		patientRepo.deleteById(id);
	}

}
