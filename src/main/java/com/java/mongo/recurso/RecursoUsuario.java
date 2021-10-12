package com.java.mongo.recurso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.mongo.modelo.Usuario;
import com.java.mongo.servico.ServicoUsuario;

@RestController
@RequestMapping(value = "/usuarios")
public class RecursoUsuario {
	
	@Autowired
	private ServicoUsuario servico;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> encontrarTodos() {
		
		List<Usuario> usuarios = this.servico.encontrarTodos();
		
		return ResponseEntity.ok(usuarios);
	}

}
