package com.gestion.cliente.controlador;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.gestion.cliente.modelo.Cliente;
import com.gestion.cliente.servicios.ServiceCliente;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {
	
	@Autowired
    private ServiceCliente services;

    //agregar
    @PostMapping
    public ResponseEntity<?> add(@RequestBody Cliente cliente){
        return ResponseEntity.status(HttpStatus.CREATED).body(services.save(cliente));
    }

    //mostrar
    @GetMapping("/{id}")
    public ResponseEntity<?> getCliente(@PathVariable(value = "id") Long id_cliente) {
        Optional<Cliente> cliente = services.findById(id_cliente);
        if(!cliente.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cliente);
    }

    //Actualizar
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Cliente clienteDetails, @PathVariable(value = "id") Long id_cliente){
        Optional<Cliente> cliente = services.findById(id_cliente);
        if(!cliente.isPresent()){
            return ResponseEntity.notFound().build();
        }
        
        cliente.get().setNombre(clienteDetails.getNombre());
        cliente.get().setApellido(clienteDetails.getApellido());

        return ResponseEntity.status(HttpStatus.CREATED).body(services.save(cliente.get()));
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id_cliente) {
        if(!services.findById(id_cliente).isPresent()){
            return ResponseEntity.notFound().build();
        }
        services.deleteById(id_cliente);
        return ResponseEntity.ok().build();
    }
    //listar
    @GetMapping
    public List<Cliente> getAllCliente(){
        List<Cliente> clientes = StreamSupport.stream(services.findAll().spliterator(), false).collect(Collectors.toList());
        return clientes;
    }
}
