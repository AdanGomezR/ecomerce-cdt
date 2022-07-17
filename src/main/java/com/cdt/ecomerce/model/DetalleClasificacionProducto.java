package com.cdt.ecomerce.model;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Table("Detalle_clasificaciones_productos")
public class DetalleClasificacionProducto {

	@Column(value = "idProducto")
	private int idProducto;
	@Column(value = "idClasificacion")
	private int idClasificacion;
	
	public DetalleClasificacionProducto() {
		super();
	}
	
	public DetalleClasificacionProducto(int idProducto, int idClasificacion) {
		super();
		this.idProducto = idProducto;
		this.idClasificacion = idClasificacion;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(int idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	@Override
	public String toString() {
		return "DetalleClasificacionProducto [idProducto=" + idProducto + ", idClasificacion=" + idClasificacion + "]";
	}
	
}
