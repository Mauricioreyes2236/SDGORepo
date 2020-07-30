package com.sdgor.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdgor.model.Privilegios;

@Repository
public interface IPrivilegiosRepo extends JpaRepository<Privilegios, Integer> {
	
	
}
