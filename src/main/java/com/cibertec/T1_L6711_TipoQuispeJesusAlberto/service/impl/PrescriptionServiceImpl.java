package com.cibertec.T1_L6711_TipoQuispeJesusAlberto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.T1_L6711_TipoQuispeJesusAlberto.model.Prescription;
import com.cibertec.T1_L6711_TipoQuispeJesusAlberto.projections.ReportPrescriptionPatient;
import com.cibertec.T1_L6711_TipoQuispeJesusAlberto.repo.PrescriptionRepo;
import com.cibertec.T1_L6711_TipoQuispeJesusAlberto.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService{
	
	@Autowired
	PrescriptionRepo prescriptionRepo;

	@Override
	public List<Prescription> list() {
		// TODO Auto-generated method stub
		return prescriptionRepo.findAll();
	}

	@Override
	public Prescription add(Prescription pre) {
		// TODO Auto-generated method stub
		return prescriptionRepo.save(pre);
	}

	@Override
	public Prescription update(Prescription pre) {
		// TODO Auto-generated method stub
		return prescriptionRepo.save(pre);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		prescriptionRepo.deleteById(id);
	}

	@Override
	public List<ReportPrescriptionPatient> getReportPrescriptionPatients() {
		// TODO Auto-generated method stub
		List<ReportPrescriptionPatient> list = prescriptionRepo.getReportPrescriptionPatients();
		return list;
	}
}
