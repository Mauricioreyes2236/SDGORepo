package com.sdgor.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdgor.model.Cliente;

@Repository
	public interface IClienteRepo extends JpaRepository<Cliente, Integer>{
		
	}
