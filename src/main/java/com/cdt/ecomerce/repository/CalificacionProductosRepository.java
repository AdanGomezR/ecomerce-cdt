package com.cdt.ecomerce.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.query.Param;

import com.cdt.ecomerce.model.CalificacionProductos;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CalificacionProductosRepository extends R2dbcRepository<CalificacionProductos, Integer> {
	
	@Query("select * from Calificaion_productos where calificacion like '%:calificacion%'")
	Flux<CalificacionProductos> findByCalificacion(String calificacion);
	
	@Query("INSERT INTO Calificaion_productos values (:idUsuario, :idProducto, :calificacion, :opinion)")
	Mono<CalificacionProductos> crearCalificacion(
			@Param(value = "idUsuario") int idUsuario,
			@Param(value = "idProducto") int idProducto,
			@Param(value = "calificacion") int calificacion,
			@Param(value = "opinion") String opinion);

}
