package com.cibertec.T1_L6711_TipoQuispeJesusAlberto.projections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportPrescriptionPatient {
	private Integer pacienteId;
	private String name;
	private String lastname;
	private Double totalPrescriptionCost;
	
}
