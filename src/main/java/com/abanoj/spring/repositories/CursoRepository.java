package com.abanoj.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.abanoj.spring.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
	List<Curso> findByNombre(@Param("nombre") String nombre);
}
