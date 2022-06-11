package com.gestion.cliente.servicios;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestion.cliente.modelo.Factura;
import com.gestion.cliente.repositorio.FacturaRepositorio;

@Service
public class ServicesFactura implements ServiceFactura {
	@Autowired
	private FacturaRepositorio respositorioFactura;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Factura> findAll() {
		// TODO Auto-generated method stub
		return respositorioFactura.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Factura> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return respositorioFactura.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Factura> findById(Long num_factura) {
		// TODO Auto-generated method stub
		return respositorioFactura.findById(num_factura);
	}

	@Override
	@Transactional
	public Factura save(Factura factura) {
		// TODO Auto-generated method stub
		return respositorioFactura.save(factura);
	}

	@Override
	public void deleteById(Long num_factura) {
		respositorioFactura.deleteById(num_factura);
	}

}
