package com.example.surveyDemo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.surveyDemo.model.Question;

@Repository
public interface IQuestion extends CrudRepository<Question, Integer>{

}
