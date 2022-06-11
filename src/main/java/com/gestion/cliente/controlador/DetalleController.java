package com.gestion.cliente.controlador;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.gestion.cliente.modelo.Detalle;
import com.gestion.cliente.servicios.ServiceDetalle;

@RestController
@RequestMapping("/api/v1/detalles")
public class DetalleController {
	
	@Autowired
	private ServiceDetalle services;
	
	@GetMapping("/detalles/{id}")
	public ResponseEntity<?> getDetalle(@PathVariable(value="id") Long numdetalle){
		Optional<Detalle> detalle = services.findById(numdetalle);
		if (!detalle.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(detalle);
	}
	@GetMapping
    public List<Detalle> readAll(){
        List<Detalle> detalles = StreamSupport.stream(services.findAll().spliterator(), false).collect(Collectors.toList());
        return detalles;
    }
	
	@PostMapping
	public ResponseEntity<Detalle> Add(@RequestBody Detalle detalle){
		return ResponseEntity.status(HttpStatus.CREATED).body(services.save(detalle));
	}
	

}
