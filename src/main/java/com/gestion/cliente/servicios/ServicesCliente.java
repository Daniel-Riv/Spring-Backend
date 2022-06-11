package com.gestion.cliente.servicios;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestion.cliente.modelo.Cliente;
import com.gestion.cliente.repositorio.ClienteRepositorio;

@Service
public class ServicesCliente implements ServiceCliente{

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Cliente> findAll() {
        return clienteRepositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Cliente> findAll(Pageable pageable) {
        return clienteRepositorio.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Cliente> findById(Long id) {
        return clienteRepositorio.findById(id);
    }

    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }

    @Override
    @Transactional
    public void deleteById(Long id_cliente) {
        clienteRepositorio.deleteById(id_cliente);
    }
    
}
