package com.example.surveyDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.surveyDemo.interfaceService.IQuestionService;
import com.example.surveyDemo.interfaceService.IUsuarioService;
import com.example.surveyDemo.interfaceService.IDataService;
import com.example.surveyDemo.model.Data;
import com.example.surveyDemo.model.Question;
import com.example.surveyDemo.model.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@Autowired
	private IUsuarioService listaUsuarios;
	
	@Autowired
	private IQuestionService qService;

	@Autowired
	private IDataService dService;
	
	@GetMapping("")
	public String listarQ(Model model) {	 
		List<Question> questions= qService.listar();
		System.out.println("lista de questions");
		System.out.println(questions.size());
		model.addAttribute("usuario", new Usuario());
		model.addAttribute("questions", questions);
		return "index";
	}

	
	@GetMapping("/usuarios")
	public String listar(Model model) {	 
		List<Usuario> usuarios = listaUsuarios.listar();
		System.out.println(usuarios);
		model.addAttribute("usuarios", usuarios);
		return "index";		
	}
	
	@GetMapping("/newQuestion")
	public String addQuestion(Model model){
		model.addAttribute("question", new Question());
		return "newQuestion";
	}
	
	@PostMapping("/addQuestion")
	public String saveQuestion(@Validated Question q, Model model){
		qService.save(q);
		return "redirect:";
	}
	
	@PostMapping("/addData")
	public String addData(@Validated Data d, Model model) {
		return "redirect:";
	}
	
	@GetMapping("/listar")
	public String qData(Model model) {
		System.out.println("________hola__________________");
		List<Data> dataSet = dService.listar();
		System.out.println(dataSet);
		System.out.println("________hola__________________");
		model.addAttribute("dataSet", dataSet);		
		return "dataList";
	}
	
		
}
