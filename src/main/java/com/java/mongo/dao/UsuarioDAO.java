package com.java.mongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.java.mongo.modelo.Usuario;

@Repository
public interface UsuarioDAO extends MongoRepository<Usuario, String>{

}
