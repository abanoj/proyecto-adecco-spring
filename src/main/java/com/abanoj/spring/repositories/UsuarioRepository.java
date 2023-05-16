package com.abanoj.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abanoj.spring.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
