package com.libreria.repository;

public class Persona {
	
	private String nombre;
	
	private static Persona unico;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		System.out.println("Mi nombre es: " +this.nombre);
	}
	
	public static Persona getSingletonInstance(String nombre) {
		if (unico == null) {
			unico = new Persona(nombre);
		} else {
			System.out.println("No se puede crear el objeto " +nombre);
		}
		return unico;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}

}
