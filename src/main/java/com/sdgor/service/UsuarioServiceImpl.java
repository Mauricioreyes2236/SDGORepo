package com.sdgor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdgor.model.Usuario;
import com.sdgor.repo.IUsuarioRepo;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	IUsuarioRepo repo;
	
	@Override
	public Iterable<Usuario> getAllUsuarios() {
		return repo.findAll();
	}

	@Override
	public Usuario createUsuario(Usuario usuario) {
		usuario = repo.save(usuario);
		return usuario;
	}

	@Override
	public Usuario getUsuarioById(Integer Id) throws Exception {
		return repo.findById(Id).orElseThrow(() -> new Exception("El usuario no existe"));
	}

}
