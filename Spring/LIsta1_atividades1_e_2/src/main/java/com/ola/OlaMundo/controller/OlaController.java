package com.ola.OlaMundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {
	@GetMapping("/doce")
	public String olaMundo() {
		return "Olá mundo";
	}
	@GetMapping("/atividade1")
	public String atividade1() {
		return "Hbilidades e mentalidades utilizadas nessa atividades: Persistência, Trabalho em Equipe, Comunicação, Atenção aos Detalhes ";
	}
	@GetMapping("/atividade2")
	public String atividade2() {
		return "Objetivos de aprendizagens: Desejo aprnder mais sobre Java, MySQL, Spring e aperfeiçoar as minhas softskills";
	}
}
