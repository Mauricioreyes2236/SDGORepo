package com.sdgor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.validation.constraints.Email;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	@Column
	private String Medio_p;
	@Column
	private String Metodo_p;
	@Column
	private String RFC;
	@Column
	private String Razon_s;
	@Column
	private String Nombre_c;
	@Column
	private String Apellido_p;
	@Column
	private String Apellido_m;
	@Column 
	private String telefono_of;
	@Column
	private String telefono_ce;
	@Column 
	private String Observaciones;
	@Column
	@Email
	private String Email;
	@Column
	private String Hora_1;
	@Column
	private String Hora_2;
	@Column
	private String Hora_3;
	@Column
	private String Hora_4;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getMedio_p() {
		return Medio_p;
	}
	public void setMedio_p(String medio_p) {
		Medio_p = medio_p;
	}
	public String getMetodo_p() {
		return Metodo_p;
	}
	public void setMetodo_p(String metodo_p) {
		Metodo_p = metodo_p;
	}
	public String getRFC() {
		return RFC;
	}
	public void setRFC(String rFC) {
		RFC = rFC;
	}
	public String getRazon_s() {
		return Razon_s;
	}
	public void setRazon_s(String razon_s) {
		Razon_s = razon_s;
	}
	public String getNombre_c() {
		return Nombre_c;
	}
	public void setNombre_c(String nombre_c) {
		Nombre_c = nombre_c;
	}
	public String getApellido_p() {
		return Apellido_p;
	}
	public void setApellido_p(String apellido_p) {
		Apellido_p = apellido_p;
	}
	public String getApellido_m() {
		return Apellido_m;
	}
	public void setApellido_m(String apellido_m) {
		Apellido_m = apellido_m;
	}
	public String getTelefono_of() {
		return telefono_of;
	}
	public void setTelefono_of(String telefono_of) {
		this.telefono_of = telefono_of;
	}
	public String getTelefono_ce() {
		return telefono_ce;
	}
	public void setTelefono_ce(String telefono_ce) {
		this.telefono_ce = telefono_ce;
	}
	public String getObservaciones() {
		return Observaciones;
	}
	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getHora_1() {
		return Hora_1;
	}
	public void setHora_1(String hora_1) {
		Hora_1 = hora_1;
	}
	public String getHora_2() {
		return Hora_2;
	}
	public void setHora_2(String hora_2) {
		Hora_2 = hora_2;
	}
	public String getHora_3() {
		return Hora_3;
	}
	public void setHora_3(String hora_3) {
		Hora_3 = hora_3;
	}
	public String getHora_4() {
		return Hora_4;
	}
	public void setHora_4(String hora_4) {
		Hora_4 = hora_4;
	}
	
	
	
}
