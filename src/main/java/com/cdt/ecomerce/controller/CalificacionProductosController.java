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

import com.cdt.ecomerce.model.CalificacionProductos;
import com.cdt.ecomerce.repository.CalificacionProductosRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "calificacion")
public class CalificacionProductosController {
	
	@Autowired
	private CalificacionProductosRepository calificacionRepository;

	@GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<CalificacionProductos> getAllProducts() {
        return calificacionRepository.findAll();
    }
 
    @GetMapping(value = "/{id}")
    public Mono<CalificacionProductos> findById(@PathVariable Integer id) {
        return calificacionRepository.findById(id);
    }
 
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<CalificacionProductos> save(@RequestBody CalificacionProductos calificacion) {
        return calificacionRepository.crearCalificacion(
        		calificacion.getIdUsuario(),
        		calificacion.getIdProducto(),
        		calificacion.getCalificacion(),
        		calificacion.getOpinion());
    }
    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<CalificacionProductos> update(@RequestBody CalificacionProductos calificacion) {
        return calificacionRepository.save(
        		calificacion);
    }
 
    @DeleteMapping(value = "/{id}")
    public Mono<Void> delete(@PathVariable Integer id) {
        return calificacionRepository.deleteById(id);
    }
}
