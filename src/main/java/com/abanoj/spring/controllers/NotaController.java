package com.abanoj.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abanoj.spring.repositories.NotaRepository;
import com.abanoj.spring.entities.Nota;

@RestController
@RequestMapping("/api/nota")
@CrossOrigin(origins = "http://localhost:4200")
public class NotaController {

	@Autowired
	private NotaRepository notaRepository;

	@GetMapping("/curso/{idC}/asignatura/{idA}")
	public List<Nota> allNotasCursoAsignatura(@PathVariable("idC") int idC, @PathVariable("idA") int idA){
		return notaRepository.findByIdCursoAndIdAsignatura(idC, idA);
	}
	
	@GetMapping("/curso/{idC}/alumno/{idA}")
	public List<Nota> allNotasCursoAlumno(@PathVariable("idC") int idC, @PathVariable("idA") int idA){
		return notaRepository.findByIdCursoAndIdAlumno(idC, idA);
	}

	@GetMapping("/asignatura/{idA}/alumno/{idS}")
	public List<Nota> allNotasAsignaturaAlumno(@PathVariable("idS") int idS, @PathVariable("idA") int idA){
		return notaRepository.findByIdAsignaturaAndIdAlumno(idA, idS);
	}

	@PostMapping("/")
	public void addNota(@RequestBody Nota nota) {
		notaRepository.save(nota);
	}
	
	@PutMapping("/{id}")
	public void updateNota(@PathVariable("id") int id, @RequestBody Nota nota) {
		if(notaRepository.existsById(id)) {
			nota.setId(id);
			notaRepository.save(nota);
		}
	}
	
	@DeleteMapping("/{id}")
	public void deleteNota(@PathVariable("id") int id) {
		if(notaRepository.existsById(id)) {
			notaRepository.deleteById(id);
		}
	}
}
