package com.renzo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renzo.entity.Contribuyente;

public interface ContribuyenteRepository extends JpaRepository<Contribuyente, Integer>{
	
}
