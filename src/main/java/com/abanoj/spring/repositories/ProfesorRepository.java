package com.abanoj.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abanoj.spring.entities.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {

}
