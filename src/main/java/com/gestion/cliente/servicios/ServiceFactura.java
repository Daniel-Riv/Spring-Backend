package com.gestion.cliente.servicios;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.gestion.cliente.modelo.Factura;

public interface ServiceFactura {
	
	  	public Iterable<Factura> findAll();
	    public Page<Factura> findAll(Pageable pageable);
	    public Optional<Factura> findById(Long num_factura);
	    public Factura save(Factura factura);
	    public void deleteById(Long num_factura);

}
