package com.abanoj.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abanoj.spring.repositories.UsuarioRepository;
import com.abanoj.spring.entities.Usuario;
import com.abanoj.spring.jwt.JwtUtils;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping("/all")
	public List<Usuario> allUsers(){
		return repository.findAll();
	}
	
	@GetMapping("/{username}")
	public Usuario findByUsername(@PathVariable("username") String username){
		return repository.findByUsername(username);
	}
	
	
	@PutMapping("/pass/{username}")
	public Usuario updatePassword(@PathVariable("username") String username, @RequestBody Usuario usuario) {
		Usuario usuarioAux = findByUsername(username);
		usuarioAux.setContrasena(usuario.getContrasena());
		return repository.save(usuarioAux);
	}
	
	@GetMapping("/")
	public ResponseEntity<Usuario> getUser(@RequestHeader("Authorization") String token){
		String authToken = token.substring(7); //Eliiminar Bearer del encabezado
		String username = JwtUtils.extractUsername(authToken);
		
		Usuario usuario = repository.findByUsername(username);
		if(usuario != null) {
			return ResponseEntity.ok(usuario);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Usuario usuario) {
		if(repository.existsByUsernameAndContrasena(usuario.getUsername(), usuario.getContrasena())) {
			String token = JwtUtils.generateAuthToken(usuario.getUsername());
			System.out.println("token: " + token);
			return ResponseEntity.ok(token);
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
	}

	/*@PostMapping("/login")
	public Usuario login(@RequestBody Usuario usuario) {
		return repository.findByUsernameAndContrasena(usuario.getUsername(), usuario.getContrasena());
	}*/
	
	@DeleteMapping("/{username}")
	public void deleteUser(@PathVariable("username") String username) {
		Usuario usuario = findByUsername(username);
		repository.delete(usuario);
	}
}
