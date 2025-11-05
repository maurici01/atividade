package com.atividade.atividade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {
	
	@GetMapping("/projeto")
	public String projeto() {
		return "projeto";
	}
	
	@GetMapping("/projeto/home")
	public String home() {
		return "home";
	}
}
