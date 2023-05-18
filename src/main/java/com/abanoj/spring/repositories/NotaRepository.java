package com.abanoj.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.abanoj.spring.entities.Nota;

public interface NotaRepository extends JpaRepository<Nota,Integer> {	
	List<Nota> findAllByIdCurso(@Param("idCurso") Integer idCurso);	
	List<Nota> findAllByIdAsignatura(@Param("idAsignatura") Integer idAsignatura);
}
