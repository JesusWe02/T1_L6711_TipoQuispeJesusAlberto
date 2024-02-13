package com.cibertec.T1_L6711_TipoQuispeJesusAlberto.service;

import java.util.List;

import com.cibertec.T1_L6711_TipoQuispeJesusAlberto.model.Pharmacy;

public interface PharmacyService {
	public List<Pharmacy> list();
	public Pharmacy add(Pharmacy pha);
	public Pharmacy update(Pharmacy pha);
	public void delete(int id);
}
