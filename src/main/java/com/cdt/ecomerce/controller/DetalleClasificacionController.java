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

import com.cdt.ecomerce.model.DetalleClasificacionProducto;
import com.cdt.ecomerce.repository.DetalleClasificacionProductoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "clasificacionCompras")
public class DetalleClasificacionController {

	@Autowired
	private DetalleClasificacionProductoRepository detalleRepository;
	
	@GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<DetalleClasificacionProducto> getAllProducts() {
        return detalleRepository.findAll();
    }
 
    @GetMapping(value = "/{id}")
    public Mono<DetalleClasificacionProducto> findById(@PathVariable Integer id) {
        return detalleRepository.findById(id);
    }
 
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<DetalleClasificacionProducto> save(@RequestBody DetalleClasificacionProducto detalle) {
        return detalleRepository.crearClasificacion(
        		detalle.getIdProducto(),
        		detalle.getIdClasificacion());
    }
    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<DetalleClasificacionProducto> update(@RequestBody DetalleClasificacionProducto detalle) {
        return detalleRepository.save(
        		detalle);
    }
 
    @DeleteMapping(value = "/{id}")
    public Mono<Void> delete(@PathVariable Integer id) {
        return detalleRepository.deleteById(id);
    }

}
