package com.sdgor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

//import javax.persistence.Table;



@Entity
public class Usuario {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="native")
	private int Id;
	@Column
	@NotNull
	@Valid
	private String nombre;
	@Column
	@NotNull
	@Valid
	private String app;
	@Column
	@NotNull
	@Valid
	private String apm;
	@Column
	@NotNull
	@Valid
	private String telefono_o;
	@Column
	@NotNull
	@Valid
	private String telefono_c;
	@Column
	@Email
	@NotNull
	@Valid
	private String email;
	@Column
	@NotNull
	@Valid
	private String rfc;
	@Column
	@NotNull
	@Valid
	private String contraseña;	
	@ManyToOne
	@JoinColumn(name = "FK_Privilegio", nullable = false, updatable = false)
	private Privilegios privilegios;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApp() {
		return app;
	}
	public void setApp(String app) {
		this.app = app;
	}
	public String getApm() {
		return apm;
	}
	public void setApm(String apm) {
		this.apm = apm;
	}
	public String getTelefono_o() {
		return telefono_o;
	}
	public void setTelefono_o(String telefono_o) {
		this.telefono_o = telefono_o;
	}
	public String getTelefono_c() {
		return telefono_c;
	}
	public void setTelefono_c(String telefono_c) {
		this.telefono_c = telefono_c;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public Privilegios getPrivilegios() {
		return privilegios;
	}
	public void setPrivilegios(Privilegios privilegios) {
		this.privilegios = privilegios;
	}





	

}
