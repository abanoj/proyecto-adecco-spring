package com.abanoj.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abanoj.spring.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
