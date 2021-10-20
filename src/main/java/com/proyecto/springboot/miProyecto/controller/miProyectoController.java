package com.proyecto.springboot.miProyecto.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.config.SaludoProperties;


@RestController
public class miProyectoController {
	
	
	@Autowired SaludoProperties sp;
	
	
	@GetMapping("/")
	public String  getSaludo() {
		
		
		System.out.println(sp.getIdioma());
		return sp.getIdioma();
		
		
	}

}
