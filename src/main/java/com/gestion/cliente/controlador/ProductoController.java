package com.gestion.cliente.controlador;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.cliente.modelo.Producto;
import com.gestion.cliente.servicios.ServiceProducto;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

	@Autowired
	private ServiceProducto services;
	//agregar
	@PostMapping
	public ResponseEntity<?> add(@RequestBody Producto producto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(services.save(producto));
	}
	//mostrar
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") Long id_producto) {
		Optional<Producto> producto = services.findById(id_producto);
		if (!producto.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(producto);
	}

}
