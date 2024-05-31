package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class prueba {
	@GetMapping("/Hola")
	public String welcome() {
		return "Hello world";
	}
	
	@GetMapping("/Calculo")
	public Integer Calculo(@RequestParam Integer num1,Integer num2) {
		return num1+num2 ;
	}

}
