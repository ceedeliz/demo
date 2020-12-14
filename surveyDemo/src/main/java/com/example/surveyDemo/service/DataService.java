package com.example.surveyDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.surveyDemo.interfaceService.IDataService;
import com.example.surveyDemo.interfaces.IData;
import com.example.surveyDemo.model.Data;

@Service
public class DataService implements IDataService{
	@Autowired
	private IData data;

	@Override
	public List<Data> listar() {
		return (List<Data>) data.listarCustom();
	}

	@Override
	public Optional<Data> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Data data) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
