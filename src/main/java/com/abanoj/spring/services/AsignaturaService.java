package com.abanoj.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abanoj.spring.entities.Asignatura;
import com.abanoj.spring.repositories.AsignaturaRepository;

@Service
@Transactional
public class AsignaturaService {

	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	public List<Asignatura> findAll() {
		return asignaturaRepository.findAll();
	}
	
	public Asignatura getById(int id) {
		return asignaturaRepository.findById(id).get();
	}
	
	public Asignatura getByName(String nombre) {
		return asignaturaRepository.findByNombre(nombre);
	}
	
    public void save(Asignatura asignatura) {
        asignaturaRepository.save(asignatura);
    }

    public void delete(Integer id) {
        asignaturaRepository.deleteById(id);
    }	
}
