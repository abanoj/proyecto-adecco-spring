package com.abanoj.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abanoj.spring.entities.Asignatura;
import com.abanoj.spring.repositories.AsignaturaRepository;

@RestController
@RequestMapping("/api/asignatura")
public class AsignaturaController {
	
	@Autowired
	private AsignaturaRepository repository;
		
	@GetMapping("/all")
	public List<Asignatura> allAsignaturas(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Asignatura findById(@PathVariable("id") int id) {
		return repository.findById(id).orElse(null);
	}
	
	
}
