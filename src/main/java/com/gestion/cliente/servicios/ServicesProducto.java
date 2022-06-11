package com.gestion.cliente.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestion.cliente.modelo.Producto;
import com.gestion.cliente.repositorio.ProductoRepositorio;
@Service
public class ServicesProducto implements ServiceProducto {
	
	@Autowired
	private ProductoRepositorio repositorioProducto;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Producto> findAll() {
		// TODO Auto-generated method stub
		return repositorioProducto.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Producto> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return repositorioProducto.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Producto> findById(Long id_Producto) {
		// TODO Auto-generated method stub
		return repositorioProducto.findById(id_Producto);
	}

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return repositorioProducto.save(producto);
	}

	@Override
	public void deleteById(Long id) {
		repositorioProducto.deleteById(id);
	}
	

}
