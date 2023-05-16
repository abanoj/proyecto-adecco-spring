package com.abanoj.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abanoj.spring.entities.Nota;

public interface NotaRepository extends JpaRepository<Nota,Integer> {	
	
}
