package com.cdt.ecomerce.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import com.cdt.ecomerce.model.Usuario;

public interface UsuarioRepository extends R2dbcRepository<Usuario, Integer> {

}
