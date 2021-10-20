package com.proyecto.springboot.miProyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proyecto.springboot.miProyecto.config.SaludoProperties;

import spring.starter.prueba.starter.Saludo;

@SpringBootApplication
public class MiProyectoApplication {

	@Autowired SaludoProperties ps;
	public static void main(String[] args) {
		SpringApplication.run(MiProyectoApplication.class, args);
		
		
		
		
		
	}

}
