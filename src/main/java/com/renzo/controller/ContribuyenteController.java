package com.renzo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.renzo.entity.Contribuyente;
import com.renzo.service.ContribuyenteService;

@RestController
@RequestMapping("/rest/contribuyente")
public class ContribuyenteController {

	@Autowired
	private ContribuyenteService service;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Contribuyente>>  lstContribuyente(){
		List<Contribuyente> lista = service.lstContribuyente();
		return ResponseEntity.ok(lista);
	}
}
