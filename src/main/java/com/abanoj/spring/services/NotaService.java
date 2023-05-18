package com.abanoj.spring.services;

import java.util.List;
import java.util.Collections;

import org.springframework.stereotype.Service;

import com.abanoj.spring.entities.Asignatura;
import com.abanoj.spring.entities.Curso;
import com.abanoj.spring.entities.Nota;
import com.abanoj.spring.repositories.AsignaturaRepository;
import com.abanoj.spring.repositories.UsuarioRepository;
import com.abanoj.spring.repositories.CursoRepository;
import com.abanoj.spring.repositories.NotaRepository;

@Service
public class NotaService {
	private final NotaRepository notaRepository;
	private final CursoRepository cursoRepository;
	private final UsuarioRepository usuarioRepository;
	private final AsignaturaRepository asignaturaRepository;

	public NotaService(NotaRepository notaRepository, CursoRepository cursoRepository,
			UsuarioRepository usuarioRepository, AsignaturaRepository asignaturaRepository) {
		this.notaRepository = notaRepository;
		this.cursoRepository = cursoRepository;
		this.usuarioRepository = usuarioRepository;
		this.asignaturaRepository = asignaturaRepository;
	}
	
	//Mejorar para que filtre también por el curso y no solo la asignatura
	public List<Nota> obtenerNotasAsignaturaCurso(int idC, int idA){
		Curso curso = cursoRepository.findById(idC).orElse(null);
		if(curso != null && curso.getAsignaturas().contains(idA)) {
			Asignatura asignatura = asignaturaRepository.findById(idA).orElse(null);
			if(asignatura != null) {
				return notaRepository.findAllByIdAsignatura(idA);
			}
		}
		return Collections.emptyList();
	}
}
