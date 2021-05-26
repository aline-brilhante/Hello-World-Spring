package com.helloworld2.hello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class helloController {
	@GetMapping
	public String hello2() {
		return "Meus objetivos de aprendizagem da semana:\nAprender Spring Boot e entender melhor o funcionamento de Git/Github";
	}

}
