package com.abanoj.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.abanoj.spring.entities.Nota;

public interface NotaRepository extends JpaRepository<Nota,Integer> {	
	List<Nota> findByIdCursoAndIdAlumno(@Param("idCurso") Integer idCurso, @Param("idAlumno") Integer idAlumno);
	List<Nota> findByIdCursoAndIdAsignatura(@Param("idCurso") Integer idCurso, @Param("idAsignatura") Integer idAsignatura);
	List<Nota> findByIdAsignaturaAndIdAlumno(@Param("idAsignatura") Integer idAsignatura, @Param("idAlumno") Integer idAlumno);
}
