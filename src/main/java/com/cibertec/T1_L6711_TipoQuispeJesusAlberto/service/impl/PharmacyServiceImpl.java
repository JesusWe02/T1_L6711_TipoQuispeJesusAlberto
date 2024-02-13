package com.cibertec.T1_L6711_TipoQuispeJesusAlberto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.T1_L6711_TipoQuispeJesusAlberto.model.Pharmacy;
import com.cibertec.T1_L6711_TipoQuispeJesusAlberto.repo.PharmacyRepo;
import com.cibertec.T1_L6711_TipoQuispeJesusAlberto.service.PharmacyService;

@Service
public class PharmacyServiceImpl implements PharmacyService{
	
	@Autowired
	PharmacyRepo pharmacyRepo;

	@Override
	public List<Pharmacy> list() {
		// TODO Auto-generated method stub
		return pharmacyRepo.findAll();
	}

	@Override
	public Pharmacy add(Pharmacy pha) {
		// TODO Auto-generated method stub
		return pharmacyRepo.save(pha);
	}

	@Override
	public Pharmacy update(Pharmacy pha) {
		// TODO Auto-generated method stub
		return pharmacyRepo.save(pha);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		pharmacyRepo.deleteById(id);
	}
}
