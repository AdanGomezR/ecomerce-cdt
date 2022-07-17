package com.cdt.ecomerce.controller;

import java.time.Duration;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdt.ecomerce.model.Producto;
import com.cdt.ecomerce.repository.ProductoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "productos")
public class ProductoController {

	@Autowired 
	private  ProductoRepository productoRepository;
	
	@GetMapping(path = "/stream-flux", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<String> streamFlux() {
	    return Flux.interval(Duration.ofSeconds(1))
	      .map(sequence -> "Flux - " + LocalTime.now().toString());
	}
	
	 @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	    public Flux<Producto> getAllBooks() {
	        return productoRepository.findAll();
	    }
	 
	    @GetMapping(value = "/{id}")
	    public Mono<Producto> findById(@PathVariable Integer id) {
	        return productoRepository.findById(id);
	    }
	 
	    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	    public Mono<Producto> save(@RequestBody Producto producto) {
	        return productoRepository.save(producto);
	    }
	 
	    @DeleteMapping(value = "/{id}")
	    public Mono<Void> delete(@PathVariable Integer id) {
	        return productoRepository.deleteById(id);
	    }
	
}
