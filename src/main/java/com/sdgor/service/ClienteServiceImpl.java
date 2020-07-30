package com.sdgor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdgor.model.Cliente;
import com.sdgor.repo.IClienteRepo;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	IClienteRepo repo;

	@Override
	public Iterable<Cliente> getAllClientes() {
		return repo.findAll();
	}

	@Override
	public Cliente createCliente(Cliente cliente) {
		cliente= repo.save(cliente);
		return cliente;
	}

	@Override
	public Cliente getClienteById(Integer Id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
