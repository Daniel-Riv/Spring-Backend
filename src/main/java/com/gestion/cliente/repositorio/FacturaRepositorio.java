package com.gestion.cliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.cliente.modelo.Factura;

@Repository
public interface FacturaRepositorio extends JpaRepository<Factura,Long > {

}
