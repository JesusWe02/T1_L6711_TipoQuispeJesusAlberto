package com.cibertec.T1_L6711_TipoQuispeJesusAlberto.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.T1_L6711_TipoQuispeJesusAlberto.model.Prescription;
import com.cibertec.T1_L6711_TipoQuispeJesusAlberto.projections.ReportPrescriptionPatient;

public interface PrescriptionRepo extends JpaRepository<Prescription, Integer>{

	@Query("SELECT new com.cibertec.T1_L6711_TipoQuispeJesusAlberto.projections.ReportPrescriptionPatient("
            + "pre.patient.patientId, "
            + "pre.patient.patientFName, "
            + "pre.patient.patientLName, "
            + "SUM(pre.prescriptionCost) as totalPrescriptionCost ) "
            + "FROM Prescription pre "
            + "GROUP BY pre.patient.patientId, pre.patient.patientFName, pre.patient.patientLName")
	public List<ReportPrescriptionPatient> getReportPrescriptionPatients();
	
}
