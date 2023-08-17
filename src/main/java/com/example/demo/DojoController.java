package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@GetMapping("/dojo")
	public String getDojo() {
		return "<h1>¡El Dojo es increíble!<h1>";
	}
	
	@GetMapping("/{dojoName}")
	public String getDojoByName(@PathVariable("dojoName") String nombre) {
		
		if(nombre.equals("burbank-dojo")) {
			return "El Dojo Burbank está localizado al sur de California";
		}
		else if(nombre.equals("san-jose")) {
			return "El Dojo SJ es el cuartel general";
		}
		return "Ese dojo no existe";	
		
	}
	
}
