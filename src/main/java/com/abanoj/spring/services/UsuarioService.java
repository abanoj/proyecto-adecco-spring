package com.abanoj.spring.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abanoj.spring.entities.Usuario;
import com.abanoj.spring.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	private final UsuarioRepository usuarioRepository;
	
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public List<Usuario> findAll() {
		return this.usuarioRepository.findAll();
	}
	
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void delete(Integer id) {
        usuarioRepository.deleteById(id);
    }	
}
