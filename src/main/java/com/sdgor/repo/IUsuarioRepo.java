package com.sdgor.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdgor.model.Usuario;

@Repository
public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
	
}
