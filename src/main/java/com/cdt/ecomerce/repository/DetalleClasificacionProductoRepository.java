package com.cdt.ecomerce.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import com.cdt.ecomerce.model.DetalleClasificacionProducto;


public interface DetalleClasificacionProductoRepository extends R2dbcRepository<DetalleClasificacionProducto, Integer> {

}
