package com.sdgor.service;

import com.sdgor.model.Cliente;

public interface ClienteService {
public Iterable<Cliente> getAllClientes();

public Cliente createCliente( Cliente cliente) throws Exception;

public Cliente getClienteById(Integer Id) throws Exception;
}
