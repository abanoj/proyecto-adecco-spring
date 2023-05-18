package com.abanoj.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.abanoj.spring.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	List<Usuario> findByUsername(@Param("username") String username);
}
