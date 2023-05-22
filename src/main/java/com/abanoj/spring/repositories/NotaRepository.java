package com.abanoj.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abanoj.spring.entities.Nota;

public interface NotaRepository extends JpaRepository<Nota,Integer> {	
	List<Nota> findByIdCursoAndIdAlumno(Integer idCurso, Integer idAlumno);
	List<Nota> findByIdCursoAndIdAsignatura(Integer idCurso, Integer idAsignatura);
	List<Nota> findByIdAsignaturaAndIdAlumno(Integer idAsignatura, Integer idAlumno);
}
