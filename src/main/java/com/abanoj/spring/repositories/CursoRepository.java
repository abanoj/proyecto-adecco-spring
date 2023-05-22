package com.abanoj.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.abanoj.spring.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
	Curso findByNombre(@Param("nombre") String nombre);
}
