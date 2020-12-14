package com.example.surveyDemo.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.surveyDemo.model.Data;

@Repository
public interface IData extends CrudRepository<Data, Integer>{
	// inner join questions q on d.Questions_id = q.id
	@Query("SELECT answer FROM Data d")
	public List<Data> listarCustom();


}
