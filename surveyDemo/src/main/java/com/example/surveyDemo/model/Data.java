package com.example.surveyDemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="data")
public class Data {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="Users_id")
	private Usuario usuarios;
	
	private int Questions_id;
	private String answer;

	public Data() {
		// TODO Auto-generated constructor stub
	}
	

	public Data(Usuario usuarios, int questions_id, String answer) {
		this.usuarios = usuarios;
		Questions_id = questions_id;
		this.answer = answer;
	}


	public Usuario getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}

	public int getQuestions_id() {
		return Questions_id;
	}

	public void setQuestions_id(int questions_id) {
		Questions_id = questions_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	
	
}
