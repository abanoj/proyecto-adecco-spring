package com.abanoj.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abanoj.spring.repositories.UsuarioRepository;
import com.abanoj.spring.entities.Usuario;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping("/all")
	public List<Usuario> allUsers(){
		return repository.findAll();
	}
}
