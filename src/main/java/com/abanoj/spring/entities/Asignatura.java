package com.abanoj.spring.entities;

import javax.persistence.*;

@Entity
@Table(name = "asignaturas")
public class Asignatura {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	private Usuario titular;
	@Column(nullable=true)
	private Usuario suplente;
	

	public Asignatura(int id) {
		this.id = id;
	}

	public Asignatura(String nombre, Usuario titular) {
		this.nombre = nombre;
		this.titular = titular;
	}

	public Asignatura(String nombre, Usuario titular, Usuario suplente) {
		this.nombre = nombre;
		this.titular = titular;
		this.suplente = suplente;
	}

	public Asignatura(int id, String nombre, Usuario titular, Usuario suplente) {
		this.id = id;
		this.nombre = nombre;
		this.titular = titular;
		this.suplente = suplente;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Usuario getTitular() {
		return titular;
	}
	public void setTitular(Usuario titular) {
		this.titular = titular;
	}
	public Usuario getSuplente() {
		return suplente;
	}
	public void setSuplente(Usuario suplente) {
		this.suplente = suplente;
	}
	
	
}
