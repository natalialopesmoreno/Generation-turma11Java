package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Para endereçar a URL eu faço o RequestMapping
@RequestMapping("/hello")
@RestController
public class ServicoController 
{
	@GetMapping("/get1")
	public String hello1() 
	{
		return "Hey get1, hello Word!";
	}
	
	@GetMapping("/get2")
	public String hello2() 
	{
		return "Hey get2, hello Word!";
	}
	//ESSE É O GET DA API REST
		@Autowired
		private ServicoRepository repository;
		
		@GetMapping ("/servicos")
		public List<ServicoModel> pegarTodos() {		
			return repository.findAll();
		}

	
}
