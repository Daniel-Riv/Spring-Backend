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

import com.gestion.cliente.modelo.Factura;
import com.gestion.cliente.servicios.ServiceFactura;

@RestController
@RequestMapping("/api/v1/factura")
public class FacturaController {
	
	@Autowired
	private ServiceFactura services;
	
	@PostMapping
	 public ResponseEntity<?> create(@RequestBody Factura factura){
        return ResponseEntity.status(HttpStatus.CREATED).body(services.save(factura));
    } 

	@GetMapping
    public List<Factura> readAll(){
        List<Factura> facturas = StreamSupport.stream(services.findAll().spliterator(), false).collect(Collectors.toList());
        return facturas;
    }
	
	 @GetMapping("/factura/{id}")
	    public ResponseEntity<?> read(@PathVariable(value = "id") Long num_factura) {
	        Optional<Factura> factura = services.findById(num_factura);
	        if(!factura.isPresent()) {
	            return ResponseEntity.notFound().build();
	        }
	        return ResponseEntity.ok(factura);
	    }
}
 