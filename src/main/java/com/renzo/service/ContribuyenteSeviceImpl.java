package com.renzo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renzo.entity.Contribuyente;
import com.renzo.repository.ContribuyenteRepository;

@Service
public class ContribuyenteSeviceImpl implements ContribuyenteService{

	@Autowired
	private ContribuyenteRepository repository;

	@Override
	public List<Contribuyente> lstContribuyente() {
		return repository.findAll();
	}
	
	
}
