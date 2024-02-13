package com.cibertec.T1_L6711_TipoQuispeJesusAlberto.service;

import java.util.List;

import com.cibertec.T1_L6711_TipoQuispeJesusAlberto.model.Prescription;
import com.cibertec.T1_L6711_TipoQuispeJesusAlberto.projections.ReportPrescriptionPatient;

public interface PrescriptionService {
	public List<Prescription> list();
	public Prescription add(Prescription pre);
	public Prescription update(Prescription pre);
	public void delete(int id);
	public List<ReportPrescriptionPatient> getReportPrescriptionPatients();
}
