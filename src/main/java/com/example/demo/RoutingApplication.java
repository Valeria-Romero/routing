package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/coding")
public class RoutingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutingApplication.class, args);
	}
	
//	@RequestMapping(value = "", method = RequestMethod.GET)
	@GetMapping("")
	public String holaDojo() {
		return "<h1>¡Hola Coding Dojo!</h1>";
	}
	
//	@RequestMapping(value = "/python", method = RequestMethod.GET)
	@GetMapping("/python")
	public String python() {
		return "<h1>¡Python/Django fue increíble!</h1>";
	}

//	@RequestMapping(value = "/java", method = RequestMethod.GET)
	@GetMapping("/java")
	public String java() {
		return "<h1>¡Java/Spring es mejor!</h1>";
	}

}
