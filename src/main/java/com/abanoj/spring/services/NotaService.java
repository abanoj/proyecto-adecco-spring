package com.abanoj.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abanoj.spring.entities.Nota;
import com.abanoj.spring.repositories.NotaRepository;


@Service
@Transactional
public class NotaService {
	
	@Autowired
	private NotaRepository notaRepository;
	
	
	public List<Nota> getByCursoAndAsignatura(int idC, int idA) {
		return notaRepository.findByIdCursoAndIdAsignatura(idC, idA);
	}
	
	public List<Nota> getByCursoAndAlumno(int idC, int idA){
		return notaRepository.findByIdCursoAndIdAlumno(idC, idA);
	}
	
	public List<Nota> getByAsignaturaAndAlumno(int idA, int idU){
		return notaRepository.findByIdAsignaturaAndIdAlumno(idA, idU);
	}
	
	public boolean existsById(int id) {
		return notaRepository.existsById(id);
	}
	
	public void save(Nota nota) {
		notaRepository.save(nota);
	}
	
	public void delete(Nota nota) {
		notaRepository.delete(nota);
	}
	
	public void deleteById(int id) {
		notaRepository.deleteById(id);
	}
	
}
