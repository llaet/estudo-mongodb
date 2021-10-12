package com.java.mongo.recurso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.mongo.modelo.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class RecursoUsuario {
	
	@GetMapping
	public ResponseEntity<List<Usuario>> encontrarTodos() {
		Usuario testerson = new Usuario("1", "testerson", "emailt@email.com");
		Usuario testilda = new Usuario("2", "testilda", "emails@email.com");
		
		List<Usuario> usuarios = new ArrayList<Usuario>(Arrays.asList(testerson, testilda));
		
		return ResponseEntity.ok(usuarios);
	}

}
