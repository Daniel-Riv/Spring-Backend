package com.gestion.cliente.servicios;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gestion.cliente.modelo.Producto;

public interface ServiceProducto {
	
	public Iterable<Producto> findAll();
    public Page<Producto> findAll(Pageable pageable);
    public Optional<Producto> findById(Long id_Producto);
    public Producto save(Producto producto);
    public void deleteById(Long id);

}
