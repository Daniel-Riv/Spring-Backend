package com.gestion.cliente.servicios;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestion.cliente.modelo.Detalle;
import com.gestion.cliente.repositorio.DetalleRepositorio;

@Service
public class ServicesDetalle implements ServiceDetalle {
	
	@Autowired
	private DetalleRepositorio reposiDetalle;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Detalle> findAll() {
		// TODO Auto-generated method stub
		return reposiDetalle.findAll();
	}
	 
	@Override
	@Transactional(readOnly = true)
	public Optional<Detalle> findById(Long num_detalle) {
		// TODO Auto-generated method stub
		return reposiDetalle.findById(num_detalle);
	}

	@Override
	@Transactional
	public Detalle save(Detalle detalle) {
		// TODO Auto-generated method stub
		return  reposiDetalle.save(detalle);
	}
	


	@Override
	@Transactional
	public void deleteById(Long num_detalle) {
		reposiDetalle.deleteById(num_detalle);
	}

	@Override
	public Page<Detalle> findAll(org.springframework.data.domain.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
