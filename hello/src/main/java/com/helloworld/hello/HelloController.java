package com.helloworld.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Persistência\nAtenção ao Detalhes\nOrientação ao Futuro\nMentalidade de Crescimento\nResponsabilidade Pessoal";
	}
}
