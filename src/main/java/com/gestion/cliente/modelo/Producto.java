package com.gestion.cliente.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="PRODUCTO")
public class Producto {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id_producto;
	@Column(name = "nombre", nullable = false, length = 60)
	private String nombre;
	@Column(name = "precio", nullable = false, length = 60)
	private int precio;
	@Column(name = "stock", nullable = false, length = 60)
	private int stock;
	public Producto(int id_producto, String nombre, int precio, int stock) {
		super();
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	public Producto(int id_producto) {
        this.id_producto = id_producto;
    }
	public int getId_producto() {
		return id_producto;
	} 
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
