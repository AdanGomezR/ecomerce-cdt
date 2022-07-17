package com.cdt.ecomerce.model;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("Calificaion_productos")
public class CalificacionProductos {

	@Column(value = "idUsuario")
	private int idUsuario;
	@Column(value = "idProducto")
	private int idProducto;
	@Column(value = "calificacion")
	private int calificacion;
	@Column(value = "opinion")
	private String opinion;
	
	public CalificacionProductos() {
		super();
	}
	
	public CalificacionProductos(int idUsuario, int idProducto, int calificacion, String opinion) {
		super();
		this.idUsuario = idUsuario;
		this.idProducto = idProducto;
		this.calificacion = calificacion;
		this.opinion = opinion;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public String getOpinion() {
		return opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	
	@Override
	public String toString() {
		return "CalificacionProductos [idUsuario=" + idUsuario + ", idProducto=" + idProducto + ", calificacion="
				+ calificacion + ", opinion=" + opinion + "]";
	}
		
}
