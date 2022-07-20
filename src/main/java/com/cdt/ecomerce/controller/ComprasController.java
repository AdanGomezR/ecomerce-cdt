package com.cdt.ecomerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdt.ecomerce.model.Compras;
import com.cdt.ecomerce.repository.ComprasRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "compras")
public class ComprasController {
	
	@Autowired
	private ComprasRepository compraRepository;
	
	@GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Compras> getAllProducts() {
        return compraRepository.findAll();
    }
 
    @GetMapping(value = "/{id}")
    public Mono<Compras> findById(@PathVariable Integer id) {
        return compraRepository.findById(id);
    }
 
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Compras> save(@RequestBody Compras compra) {
        return compraRepository.crearCompra(
        		compra.getIdUsuario(),
        		compra.getIdProducto(),
        		compra.getCantidadProducto(),
        		compra.getTotalCompra(),
        		compra.getFechaCompra());
    }
    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Compras> update(@RequestBody Compras compra) {
        return compraRepository.save(
        		compra);
    }
 
    @DeleteMapping(value = "/{id}")
    public Mono<Void> delete(@PathVariable Integer id) {
        return compraRepository.deleteById(id);
    }

}
