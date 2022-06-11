package com.gestion.cliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.cliente.modelo.Producto;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long> {

}
