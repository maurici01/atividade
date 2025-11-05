package com.atividade.atividade.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.atividade.Repository.UsuarioRepository;
import com.atividade.atividade.model.Usuario;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/projeto/getAll")
	public ResponseEntity<Object> getAll(){
		ArrayList<Usuario> usuarios = usuarioRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(usuarios);
	}
}
