package com.sdgor.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdgor.model.Modulos;

@Repository
public interface IModulosRepo extends JpaRepository<Modulos, Integer>{

}
