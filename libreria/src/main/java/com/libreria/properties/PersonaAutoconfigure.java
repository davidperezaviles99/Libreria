package com.libreria.properties;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.libreria.repository.Persona;

@Configuration
@ConditionalOnClass(Persona.class)
@EnableConfigurationProperties(PersonaProperties.class)
public class PersonaAutoconfigure {
	
	private final PersonaProperties properties;
	
	public PersonaAutoconfigure(PersonaProperties properties) {
		this.properties = properties;
	}
	
	@Bean
	public Persona persona() {
		return new Persona(properties.getNombre());
	}

}
