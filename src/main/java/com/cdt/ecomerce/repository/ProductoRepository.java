package com.cdt.ecomerce.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import com.cdt.ecomerce.model.Producto;

public interface ProductoRepository extends R2dbcRepository<Producto, Integer> {

	
}
