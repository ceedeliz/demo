package com.example.surveyDemo.interfaceService;

import java.util.List;
import java.util.Optional;


import com.example.surveyDemo.model.Data;

public interface IDataService {
	
	public List<Data> listar();	
	public Optional<Data> listarId(int id);
	public int save(Data data);
	public void delete(int id);
}
