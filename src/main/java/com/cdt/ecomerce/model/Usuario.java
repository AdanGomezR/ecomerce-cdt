package com.cdt.ecomerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("Usuarios")
public class Usuario {
	
	@Id
	private int idUsuario;
	@Column(value = "nombreUsuario")
	private String nombreUsuario;
	@Column(value = "apellidosUsuario")
	private String apellidosUsuario;
	@Column(value = "emailUsuario")
	private String emailUsuario;
	
	public Usuario() {
		super();
	}
	
	public Usuario(int idUsuario, String nombreUsuario, String apellidosUsuario, String emailUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidosUsuario = apellidosUsuario;
		this.emailUsuario = emailUsuario;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getApellidosUsuario() {
		return apellidosUsuario;
	}
	public void setApellidosUsuario(String apellidosUsuario) {
		this.apellidosUsuario = apellidosUsuario;
	}
	public String getEmailUsuario() {
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", apellidosUsuario="
				+ apellidosUsuario + ", emailUsuario=" + emailUsuario + "]";
	}
	
}
