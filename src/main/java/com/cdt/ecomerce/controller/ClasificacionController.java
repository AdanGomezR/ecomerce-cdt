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

import com.cdt.ecomerce.model.Clasificacion;
import com.cdt.ecomerce.repository.ClasificacionRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "clasificacion")
public class ClasificacionController {

	@Autowired
	private ClasificacionRepository clasificacionRepository;
	
	@GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Clasificacion> getAllProducts() {
        return clasificacionRepository.findAll();
    }
 
    @GetMapping(value = "/{id}")
    public Mono<Clasificacion> findById(@PathVariable Integer id) {
        return clasificacionRepository.findById(id);
    }
 
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Clasificacion> save(@RequestBody Clasificacion clasificacion) {
        return clasificacionRepository.crearClasificacion(
        		clasificacion.getIdClasificacion(),
        		clasificacion.getNombreClasificacion(),
        		clasificacion.getDescripcionClasificacion());
    }
    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Clasificacion> update(@RequestBody Clasificacion clasificacion) {
        return clasificacionRepository.save(
        		clasificacion);
    }
 
    @DeleteMapping(value = "/{id}")
    public Mono<Void> delete(@PathVariable Integer id) {
        return clasificacionRepository.deleteById(id);
    }
}
