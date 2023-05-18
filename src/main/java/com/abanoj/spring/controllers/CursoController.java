package com.abanoj.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abanoj.spring.entities.Asignatura;
import com.abanoj.spring.entities.Curso;
import com.abanoj.spring.repositories.CursoRepository;
import com.abanoj.spring.services.CursoService;

@RestController
@RequestMapping("/api/curso")
public class CursoController {

	@Autowired
	private CursoRepository repository;

	private final CursoService service;
	
	public CursoController(CursoService service) {
		this.service = service;
	}
	
	@GetMapping("/all")
	public List<Curso> allCursos(){
		return repository.findAll();
	}
	
	@GetMapping("/id/{id}")
	public Curso findById(@PathVariable("id") int id) {
		return repository.findById(id).orElse(null);
	}
	
	@GetMapping("/nombre/{nombre}")
	public List<Curso> findByName(@PathVariable("nombre") String nombre) {
		return repository.findByNombre(nombre);
	}
	
	@GetMapping("{id}/asignaturas")
	public List<Asignatura> allAsignaturas(@PathVariable("id") int id){
		return service.obtenerAsignaturasCurso(id);
	}
}
