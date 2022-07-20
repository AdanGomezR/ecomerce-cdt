package com.cdt.ecomerce.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.query.Param;

import com.cdt.ecomerce.model.Compras;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ComprasRepository extends R2dbcRepository<Compras, Integer> {

	@Query("select * from Compras where idProducto like '%:idProducto%'")
	Flux<Compras> findByidProducto(String idProducto);
	
	@Query("INSERT INTO Compras values (:idUsuario, :idProducto, :cantidadProducto, :totalCompra, :fecha_compra)"
			+ "alter table Productos set stockProducto = stockProducto- :cantidadProducto")
	Mono<Compras> crearCompra(
			@Param(value = "idUsuario") int idUsuario,
			@Param(value = "idProducto") int idProducto,
			@Param(value = "cantidadProducto") int cantidadProducto,
			@Param(value = "totalCompra") double totalCompra,
			@Param(value = "fecha_compra") String fechaCompra);

}
