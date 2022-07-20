package com.cdt.ecomerce.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.query.Param;

import com.cdt.ecomerce.model.Clasificacion;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClasificacionRepository extends R2dbcRepository<Clasificacion, Integer>{
	
	@Query("select * from Clasificaciones where descripcionClasificacion like '%:descripcion%'")
	Flux<Clasificacion> findByDescripcion(String descripcion);
	
	@Query("INSERT INTO Clasificaciones values (:idClasificacion, :nombreClasificacion, :descripcionClasificacion)")
	Mono<Clasificacion> crearClasificacion(
			@Param(value = "idClasificacion") int idClasificacion,
			@Param(value = "nombreClasificacion") String nombreClasificacion,
			@Param(value = "descripcionClasificacion") String descripcionClasificacion);

}
