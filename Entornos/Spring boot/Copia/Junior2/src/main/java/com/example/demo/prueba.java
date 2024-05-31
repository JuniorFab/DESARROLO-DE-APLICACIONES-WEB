package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DDO.User;
import com.example.demo.servicio.UserServicio;

@RestController
public class prueba {
	
	@GetMapping("/Hola")
	public String welcome() {
		return "Hello world";
	}

	@GetMapping("/Calculo")
	public Integer Calculo(@RequestParam Integer num1, Integer num2) {
		return num1 + num2;
	}


	@Autowired
	private UserServicio userservicio;

	@GetMapping("/Servicio")
	public List<User> GetallUsers() {
		return userservicio.getUser();

	}
	
	@GetMapping("/findbyid")
	public User finByid(@RequestParam Long id) {
		return userservicio.findbyif(id);
		
	}
	@GetMapping("/CreateUser")
	public User finByid(@RequestParam User user) {
		return userservicio.createuser(user);
		
	}
	

}
