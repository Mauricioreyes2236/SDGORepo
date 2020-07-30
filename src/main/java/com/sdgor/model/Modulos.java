package com.sdgor.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Modulos {

	@Id
	private int Id;
	private String nombre_m;
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "FK_Privilegio", nullable = false, updatable = false)
	private Privilegios privilegios;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre_m() {
		return nombre_m;
	}

	public void setNombre_m(String nombre_m) {
		this.nombre_m = nombre_m;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Privilegios getPrivilegios() {
		return privilegios;
	}

	public void setPrivilegios(Privilegios privilegios) {
		this.privilegios = privilegios;
	}
	
	
}
