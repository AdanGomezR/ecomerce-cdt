package com.cdt.ecomerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("Productos")
public class Producto {
	
	@Id
	@Column(value="idProducto")
	private int idProducto;
	@Column(value="nombreProducto")
	private String nombreProducto;
	@Column(value="imagenProducto")
	private String imagenProducto;
	@Column(value="descripcionProducto")
	private String descripcionProducto;
	@Column(value="precioProducto")
	private double precioProducto;
	@Column(value="stockProducto")
	private int stockProducto;
	
	public Producto() {
		super();
	}
	
	public Producto(int idProducto, String nombreProducto, String imagenProducto, String descripcionProducto,
			double precioProducto, int stockProducto) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.imagenProducto = imagenProducto;
		this.descripcionProducto = descripcionProducto;
		this.precioProducto = precioProducto;
		this.stockProducto = stockProducto;
	}
	
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getImagenProducto() {
		return imagenProducto;
	}
	public void setImagenProducto(String imagenProducto) {
		this.imagenProducto = imagenProducto;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	public double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public int getStockProducto() {
		return stockProducto;
	}
	public void setStockProducto(int stockProducto) {
		this.stockProducto = stockProducto;
	}
	@Override
	public String toString() {
		return "Productos [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", imagenProducto="
				+ imagenProducto + ", descripcionProducto=" + descripcionProducto + ", precioProducto=" + precioProducto
				+ ", stockProducto=" + stockProducto + "]";
	}

}
