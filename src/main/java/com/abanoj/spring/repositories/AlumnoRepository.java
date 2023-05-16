package com.abanoj.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abanoj.spring.entities.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

}
