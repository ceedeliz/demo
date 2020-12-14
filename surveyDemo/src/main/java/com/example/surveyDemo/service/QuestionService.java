package com.example.surveyDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.surveyDemo.interfaceService.IQuestionService;
import com.example.surveyDemo.interfaces.IQuestion;
import com.example.surveyDemo.model.Question;
@Service
public class QuestionService implements IQuestionService{
	@Autowired
	private IQuestion data;
	
	@Override
	public List<Question> listar() {
		return (List<Question>)data.findAll();
	}

	@Override
	public Optional<Question> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Question q) {
		int res=0;
		Question question=data.save(q);
		if(!question.equals(null)) {
			res=1;
		}
		
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
