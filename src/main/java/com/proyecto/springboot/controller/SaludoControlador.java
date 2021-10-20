package com.proyecto.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.proyecto.springboot.miProyecto.config.SaludoProperties;

@Controller
public class SaludoControlador {
	
	@Autowired SaludoProperties ps;
	
	@GetMapping("/")
	public String  getSaludo() {
		
		return "hola";
		
		
		
	}

}
