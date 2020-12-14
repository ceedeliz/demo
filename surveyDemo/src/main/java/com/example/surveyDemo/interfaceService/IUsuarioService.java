package com.example.surveyDemo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.surveyDemo.model.Usuario;

public interface IUsuarioService {
	public List<Usuario> listar();
	public Optional<Usuario> listarId(int id);
	public int save(Usuario usuario);
	public void delete(int id);
	
}
