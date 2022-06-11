package com.gestion.cliente.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CLIENTE")
public class Cliente {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cliente;
	@Column(name = "nombre", length = 60, nullable = false)
	private String nombre;
	@Column(name = "apellido", length = 60, nullable = false)
	private String apellido;
	@Column(name = "direccion", length = 40, nullable = false)
    private String direccion;
    @Column(name = "fecha_nacimiento", length = 40, nullable = false)
	private String fecha_nacimiento;
    @Column(name = "telefono", length = 40, nullable = false)
	private int telefono;
	@Column(name = "email", nullable = false, unique = true, length = 60)
	private String email;

	public Cliente(int id_cliente, String nombre, String apellido,String direccion, String fecha_nacimiento,int telefono, String email) {
		super();
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion=direccion;
		this.fecha_nacimiento= fecha_nacimiento;
		this.telefono= telefono;
		this.email = email;
		
	}
	
	public Cliente() {
		
	}
	public Cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

	public int getId_cliente() {
		return id_cliente;
	}
 
	public void setId_cliente(int id) {
		this.id_cliente = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}