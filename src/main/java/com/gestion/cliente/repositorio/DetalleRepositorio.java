package com.gestion.cliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.cliente.modelo.Detalle;

@Repository
public interface DetalleRepositorio extends JpaRepository<Detalle, Long> {

}
