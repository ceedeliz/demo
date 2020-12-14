package com.example.surveyDemo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.surveyDemo.model.Question;

public interface IQuestionService {
	public List<Question> listar();
	public Optional<Question> listarId(int id);
	public int save(Question question);
	public void delete(int id);
	
}
