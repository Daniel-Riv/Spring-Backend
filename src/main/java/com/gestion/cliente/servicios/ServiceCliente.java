package com.gestion.cliente.servicios;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gestion.cliente.modelo.Cliente;

public interface ServiceCliente {
   
    public Iterable<Cliente> findAll();
    public Page<Cliente> findAll(Pageable pageable);
    public Optional<Cliente> findById(Long id_cliente);
    public Cliente save(Cliente cliente);
    public void deleteById(Long id);
}
