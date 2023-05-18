package com.abanoj.spring.services;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abanoj.spring.entities.Asignatura;
import com.abanoj.spring.entities.Curso;
import com.abanoj.spring.repositories.AsignaturaRepository;
import com.abanoj.spring.repositories.CursoRepository;

@Service
public class CursoService {
	private final CursoRepository cursoRepository;
	private final AsignaturaRepository asignaturaRepository;
	
	public CursoService(CursoRepository cursoRepository, AsignaturaRepository asignaturaRepository) {
		this.cursoRepository = cursoRepository;
		this.asignaturaRepository = asignaturaRepository;
	}

	public List<Asignatura> obtenerAsignaturasCurso(int id){
		Curso curso = cursoRepository.findById(id).orElse(null);
		if(curso != null) {
			List<Integer> listaIds = curso.getAsignaturas();
			List<Asignatura> aux = new ArrayList<Asignatura>();
			for (Integer i : listaIds) {
				if(i != null) {
					aux.add(asignaturaRepository.findById(i).orElse(null));
				}
			}
			return aux;
		}
		return Collections.emptyList();
	}
	
}
