package com.cdt.ecomerce.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.query.Param;

import com.cdt.ecomerce.model.Producto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoRepository extends R2dbcRepository<Producto, Integer> {

	@Query("select * from Producto where descripcionProducto like '%:descripcion%'")
	Flux<Producto> findByDescripcion(String descripcion);
	
	@Query("INSERT INTO Productos values (:idProducto, :nombreProducto, :imagenProducto, :descripcionProducto, :precioProducto, :stockProducto)")
	Mono<Producto> crearProducto(
			@Param(value = "idProducto") int idProducto,
			@Param(value = "nombreProducto") String nombreProducto,
			@Param(value = "imagenProducto") String imagenProducto,
			@Param(value = "descripcionProducto") String descripcionProducto,
			@Param(value = "precioProducto") double precioProducto,
			@Param(value = "stockProducto") int stockProducto);
}
