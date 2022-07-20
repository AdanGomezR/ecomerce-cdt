package com.cdt.ecomerce.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.query.Param;

import com.cdt.ecomerce.model.Usuario;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UsuarioRepository extends R2dbcRepository<Usuario, Integer> {

	@Query("select * from Usuarios where nombreUsuario like '%:nombre%'")
	Flux<Usuario> findByNombre(String nombre);
	
	@Query("INSERT INTO Usuarios values (:idUsuario, :nombreUsuario, :apellidosUsuario, :emailUsuario)")
	Mono<Usuario> crearUsuario(
			@Param(value = "idUsuario") int idUsuario,
			@Param(value = "nombreUsuario") String nombreUsuario,
			@Param(value = "apellidosUsuario") String apellidosUsuario,
			@Param(value = "emailUsuario") String emailUsuario);
}
