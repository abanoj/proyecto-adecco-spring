package com.abanoj.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.abanoj.spring.entities.Curso;
import com.abanoj.spring.repositories.CursoRepository;

@Service
@Transactional
public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;
	
	public List<Curso> getAll(){
		return cursoRepository.findAll();
	}
	
	public Curso getById(int id) {
		return cursoRepository.findById(id).get();
	}
	
	public Curso getByName(String nombre) {
		return cursoRepository.findByNombre(nombre);
	}
	
}
