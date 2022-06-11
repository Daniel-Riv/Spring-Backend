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
@Table(name ="FACTURA")
public class Factura {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num_fuctura;
	@Column(name = "fecha",nullable=false,length = 60)
	private String fecha;
	@ManyToOne
	@JoinColumn(name="id_cliente",nullable= false)	
	private Cliente id_cliente;
	
	public Factura(int num_fuctura, String fecha, Cliente id_cliente) {
		this.num_fuctura = num_fuctura;
		this.fecha = fecha;
		this.id_cliente = id_cliente;
	}
	
	public Factura() {
		
	}
	
	 public Factura(int num_factura) {
	        this.num_fuctura = num_factura;
	    }

	public int getNum_fuctura() {
		return num_fuctura;
	}

	public void setNum_fuctura(int num_fuctura) {
		this.num_fuctura = num_fuctura;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Cliente getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Cliente id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	
	
	
	

}
