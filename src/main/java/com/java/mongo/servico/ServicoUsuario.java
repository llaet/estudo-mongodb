package com.java.mongo.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.mongo.dao.UsuarioDAO;
import com.java.mongo.modelo.Usuario;

@Service
public class ServicoUsuario {
	
	@Autowired
	private UsuarioDAO dao;

	public List<Usuario> encontrarTodos() {
		return this.dao.findAll();
	}
}
