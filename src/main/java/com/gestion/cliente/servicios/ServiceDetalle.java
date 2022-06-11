package com.gestion.cliente.servicios;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gestion.cliente.modelo.Detalle;

public interface ServiceDetalle {

	public Iterable<Detalle> findAll();
	public Page<Detalle> findAll(Pageable pageable);
	public Optional<Detalle> findById(Long num_detalle);
	public Detalle save(Detalle detalle);
    public void deleteById(Long num_detalle); 
   
}
