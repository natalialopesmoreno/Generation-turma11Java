package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Para endereçar a URL eu faço o RequestMapping
@RequestMapping("/hello")
@RestController
public class ServicoController 
{

	//ESSE É O GET DA API REST
	//INJETOU O REPOSITÓRIO DO SERVICO PARA COMUNICAR COM O BANCO DE DADOS
		@Autowired
		private ServicoRepository repository;
	// FAÇO O GET DO HTTP e o Read DO CRUD COM O COMANDO .findAll()
		
		@GetMapping ("/servicos")
		public List<ServicoModel> pegarTodos() 
		{		
			return repository.findAll();
		}
		
		// FAÇO O POST DO HTTP e o C-REATE DO CRUD COM O COMANDO .save(OBJECT)
		//@RequestBody é reposnsável por falar para o método pegar as informações 
		//do body da requisição, ou seja, os dados que o usuário digitou e colocar pra dentro do método pra
		//salvar na tabela que eu também forneci no método;
		
		@PostMapping ("/servicos")
		public ServicoModel criar (@RequestBody ServicoModel TabelaServico)
		{
			repository.save(TabelaServico);
			return	TabelaServico;		
		}
		
}
		
		
//		@GetMapping("/get1")
//		public String hello1() 
//		{
//			return "Hey get1, hello Word!";
//		}
	//	
//		@GetMapping("/get2")
//		public String hello2() 
//		{
//			return "Hey get2, hello Word!";
//		}

	

