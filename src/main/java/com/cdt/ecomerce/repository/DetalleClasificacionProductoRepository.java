package com.cdt.ecomerce.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.query.Param;

import com.cdt.ecomerce.model.DetalleClasificacionProducto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface DetalleClasificacionProductoRepository extends R2dbcRepository<DetalleClasificacionProducto, Integer> {
	
	@Query("select * from Detalle_clasificaciones_productos where calificacion like '%:calificacion%'")
	Flux<DetalleClasificacionProducto> findByClasificacion(String calificacion);
	
	@Query("INSERT INTO Detalle_clasificaciones_productos values (:idProducto, :idClasificacion)")
	Mono<DetalleClasificacionProducto> crearClasificacion(
			@Param(value = "idProducto") int idProducto,
			@Param(value = "idClasificacion") int idClasificacion);
	
}
