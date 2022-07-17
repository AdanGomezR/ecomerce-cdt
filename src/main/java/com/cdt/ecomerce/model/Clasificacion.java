package com.cdt.ecomerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("Clasificaciones")
public class Clasificacion {
	
	@Id
	private int idClasificacion;
	@Column(value = "nombreClasificacion")
	private String nombreClasificacion;
	@Column(value = "descripcionClasificacion")
	private String descripcionClasificacion;
	
	public Clasificacion() {
		super();
	}

	public Clasificacion(int idClasificacion, String nombreClasificacion, String descripcionClasificacion) {
		super();
		this.idClasificacion = idClasificacion;
		this.nombreClasificacion = nombreClasificacion;
		this.descripcionClasificacion = descripcionClasificacion;
	}

	public int getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(int idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	public String getNombreClasificacion() {
		return nombreClasificacion;
	}

	public void setNombreClasificacion(String nombreClasificacion) {
		this.nombreClasificacion = nombreClasificacion;
	}

	public String getDescripcionClasificacion() {
		return descripcionClasificacion;
	}

	public void setDescripcionClasificacion(String descripcionClasificacion) {
		this.descripcionClasificacion = descripcionClasificacion;
	}

	@Override
	public String toString() {
		return "Clasificaciones [idClasificacion=" + idClasificacion + ", nombreClasificacion=" + nombreClasificacion
				+ ", descripcionClasificacion=" + descripcionClasificacion + "]";
	}
	
}
