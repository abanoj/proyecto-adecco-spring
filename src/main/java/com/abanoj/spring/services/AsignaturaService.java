package com.abanoj.spring.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abanoj.spring.entities.Asignatura;
import com.abanoj.spring.repositories.AsignaturaRepository;

@Service
public class AsignaturaService {

	private final AsignaturaRepository asignaturaRepository;
	
	public AsignaturaService(AsignaturaRepository asignaturaRepository) {
		this.asignaturaRepository = asignaturaRepository;
	}

	public List<Asignatura> findAll() {
		return this.asignaturaRepository.findAll();
	}
	
    public Asignatura save(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    public void delete(Integer id) {
        asignaturaRepository.deleteById(id);
    }	
}
