package com.gestion.cliente.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="DETALLE")
public class Detalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int num_detalle;
	@ManyToOne
	@JoinColumn(name = "num_factura", nullable = false)
	private Factura num_factura;
	@ManyToOne
	@JoinColumn(name = "id_producto", nullable = false)
	private Producto id_producto;
	@Column(name = "cantidad", nullable = false, length = 60)
	private int cantidad;
	@Column(name = "precio", nullable = false, length = 60)
	private int precio;
	public Detalle(int num_detalle, Factura id_factura, Producto id_producto, int cantidad, int precio) {
		super();
		this.num_detalle = num_detalle;
		this.num_factura = id_factura;
		this.id_producto = id_producto;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public Detalle(int num_detalle) {
        this.num_detalle = num_detalle;
    }
    
    public Detalle(Factura num_factura) {
        this.num_factura = num_factura;
    }
    
    public Detalle(Producto id_producto) {
        this.id_producto = id_producto;
    }
	public int getNum_detalle() {
		return num_detalle;
	}
	public void setNum_detalle(int num_detalle) {
		this.num_detalle = num_detalle;
	}
	
	public Factura getNum_factura() {
		return num_factura;
	}
	public void setNum_factura(Factura num_factura) {
		this.num_factura = num_factura;
	}
	public Producto getId_producto() {
		return id_producto;
	}
	public void setId_producto(Producto id_producto) {
		this.id_producto = id_producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	

}
