package com.abanoj.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abanoj.spring.entities.Asignatura;
import com.abanoj.spring.entities.Curso;
import com.abanoj.spring.entities.Nota;
import com.abanoj.spring.entities.Usuario;

public interface NotaRepository extends JpaRepository<Nota,Integer> {	
	List<Nota> findByCursoAndAlumno(Curso curso, Usuario alumno);
	List<Nota> findByCursoAndAsignatura(Curso curso, Asignatura asignatura);
	List<Nota> findByAsignaturaAndAlumno(Asignatura asignatura, Usuario alumno);
}
