package com.atividade.atividade.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.atividade.atividade.Repository.UsuarioRepository;
import com.atividade.atividade.model.Usuario;

@Configuration
public class Config implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void run(String... args) throws Exception {

		Usuario u1 = new Usuario(null, "mauricio", "mauricio@gmail", "71999");
		Usuario u2 = new Usuario(null, "Ana", "ana@gmail", "718889");
		Usuario u3 = new Usuario(null, "Maria", "maria@gmail", "717779");
		Usuario u4 = new Usuario(null, "Bianca", "bianca@gmail", "715559");
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
		
	}

}
