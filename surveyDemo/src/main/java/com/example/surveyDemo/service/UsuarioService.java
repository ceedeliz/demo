package com.example.surveyDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.surveyDemo.interfaceService.IUsuarioService;
import com.example.surveyDemo.interfaces.IUsuario;
import com.example.surveyDemo.model.Usuario;

@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	private IUsuario data;
	
	
	@Override
	public List<Usuario> listar() {
		
		return (List<Usuario>)data.findAll();
	}

	@Override
	public Optional<Usuario> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Usuario usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
