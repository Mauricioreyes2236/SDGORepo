package com.sdgor.service;

import com.sdgor.model.Usuario;

public interface UsuarioService {
	public Iterable<Usuario> getAllUsuarios();

	public Usuario createUsuario( Usuario usuario) throws Exception;
	
	public Usuario getUsuarioById(Integer Id) throws Exception;	

}
