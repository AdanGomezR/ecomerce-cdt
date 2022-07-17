package com.cdt.ecomerce.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import com.cdt.ecomerce.model.Compras;

public interface ComprasRepository extends R2dbcRepository<Compras, Integer> {

}
