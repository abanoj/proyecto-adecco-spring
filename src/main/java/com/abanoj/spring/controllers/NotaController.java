package com.abanoj.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abanoj.spring.repositories.NotaRepository;
import com.abanoj.spring.services.NotaService;
import com.abanoj.spring.entities.Nota;

@RestController
@RequestMapping("/api/nota")
public class NotaController {

	@Autowired
	private NotaRepository notaRepository;
	
	private final NotaService notaService;
	
	public NotaController(NotaService notaService) {
		this.notaService = notaService;
	}
	
	@GetMapping("/curso/{idC}/asignatura/{idA}")
	public List<Nota> allNotasAsignatura(@PathVariable("idC") int idC, @PathVariable("idA") int idA){
		return notaService.obtenerNotasAsignaturaCurso(idC, idA);
	}
}
