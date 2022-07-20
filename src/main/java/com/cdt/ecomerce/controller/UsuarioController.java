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

import com.cdt.ecomerce.model.Usuario;
import com.cdt.ecomerce.repository.UsuarioRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository userRepository;
	
	@GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Usuario> getAllProducts() {
        return userRepository.findAll();
    }
 
    @GetMapping(value = "/{id}")
    public Mono<Usuario> findById(@PathVariable Integer id) {
        return userRepository.findById(id);
    }
 
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Usuario> save(@RequestBody Usuario usuario) {
        return userRepository.crearUsuario(
        		usuario.getIdUsuario(),
        		usuario.getNombreUsuario(),
        		usuario.getApellidosUsuario(),
        		usuario.getEmailUsuario());
    }
    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Usuario> update(@RequestBody Usuario usuario) {
        return userRepository.save(
        		usuario);
    }
 
    @DeleteMapping(value = "/{id}")
    public Mono<Void> delete(@PathVariable Integer id) {
        return userRepository.deleteById(id);
    }
}
