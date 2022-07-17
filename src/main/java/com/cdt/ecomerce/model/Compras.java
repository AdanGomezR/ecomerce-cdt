package com.cdt.ecomerce.model;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class Compras {

	@Column(value = "idUsuario")
	private int idUsuario;
	@Column(value = "idProducto")
	private int idProducto;
	@Column(value = "cantidadProducto")
	private int cantidadProducto;
	@Column(value = "totalCompra")
	private double totalCompra;
	@Column(value = "fechaCompra")
	private String fechaCompra;
	
	public Compras() {
		super();
	}
	
	public Compras(int idUsuario, int idProducto, int cantidadProducto, double totalCompra, String fechaCompra) {
		super();
		this.idUsuario = idUsuario;
		this.idProducto = idProducto;
		this.cantidadProducto = cantidadProducto;
		this.totalCompra = totalCompra;
		this.fechaCompra = fechaCompra;
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
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public double getTotalCompra() {
		return totalCompra;
	}
	public void setTotalCompra(double totalCompra) {
		this.totalCompra = totalCompra;
	}
	public String getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	@Override
	public String toString() {
		return "Compras [idUsuario=" + idUsuario + ", idProducto=" + idProducto + ", cantidadProducto="
				+ cantidadProducto + ", totalCompra=" + totalCompra + ", fechaCompra=" + fechaCompra + "]";
	}

}
