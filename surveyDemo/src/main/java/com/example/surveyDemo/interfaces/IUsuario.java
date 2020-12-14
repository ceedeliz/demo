package com.example.surveyDemo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.surveyDemo.model.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario, Integer>{

}
