package com.abanoj.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.abanoj.spring.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	Usuario findByUsername(@Param("username") String username);
	Usuario findByUsernameAndContrasena(@Param("username") String username, @Param("contrasena") String contrasena);
	Usuario findByDni(String dni);
	boolean existsByUsername(@Param("username") String username);
	boolean existsByUsernameAndContrasena(@Param("username") String username, @Param("contrasena") String contrasena);
}
