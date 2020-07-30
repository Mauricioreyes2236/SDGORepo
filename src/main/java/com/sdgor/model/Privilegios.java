package com.sdgor.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Privilegios {

	@Id
	private int Id;
	private String nombre_p;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNombre_p() {
		return nombre_p;
	}
	public void setNombre_p(String nombre_p) {
		this.nombre_p = nombre_p;
	}
	
	


		
	
}
