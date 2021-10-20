package com.libreria.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("persona.nombre")
public class PersonaProperties {
	
	private String nombre = "David";

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	

}
