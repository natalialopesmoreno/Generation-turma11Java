package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
public class Controller  implements WebMvcConfigurer
{

	//ACESSAR A PÁGINA PELO LOCALHOST:8080 -> TE LEVA AUTOMATICAMENTE PARA O INDEX
	//Ele liga você com as views
	public void addViewControllers(ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/index.html");
	}
	
	
	//ESSE É O GET DA API REST
		//INJETOU O REPOSITÓRIO DO SERVICO PARA COMUNICAR COM O BANCO DE DADOS
			@Autowired
			private ManutencaoRepository repository;
		// FAÇO O GET DO HTTP e o Read DO CRUD COM O COMANDO .findAll()
			
			@GetMapping ("/manutencao")
			public List<ManutencaoTable> buscarTodos() 
			{		
				return repository.findAll();
			}
			
			@GetMapping ("/manutencao/{id}")
			public Optional<ManutencaoTable> buscarUm(@PathVariable Long id) 
			{		
				return repository.findById(id);
			}
			
			
			@GetMapping ("/manutencao/{nome}")
			public Optional<ManutencaoTable> buscarPorNome(@PathVariable String nome) 
			{		
				return repository.findByNome(nome);
			}
			
			//GET COM 2 ATRIBUTOS
			@GetMapping ("/manutencao/{nome}/{categoria}")
			public Optional<ManutencaoTable> buscarPorNomeECategoria(@PathVariable String nome,@PathVariable String categoria) 
			{		
				return repository.findByNomeAndCategoria(nome, categoria);
			}
			
			//DELETE
			@DeleteMapping ("/manutencao/{id}")
			public void remover(@PathVariable Long id) 
			{		
				repository.deleteById(id);
			}
			
			
			
			// FAÇO O POST DO HTTP e o C-REATE DO CRUD COM O COMANDO .save(OBJECT)
			//@RequestBody é reposnsável por falar para o método pegar as informações 
			//do body da requisição, ou seja, os dados que o usuário digitou e colocar pra dentro do método pra
			//salvar na tabela que eu também forneci no método;
			
			@PostMapping ("/manutencao")
			public ManutencaoTable criar (@RequestBody ManutencaoTable manutencao)
			{
				repository.save(manutencao);
				return	manutencao;		
			}
			
			//UPDATE
			@PutMapping("/manutencao/{id}")
			public ManutencaoTable atualizar(@PathVariable Long id, @RequestBody ManutencaoTable manutencao) 
			{
				manutencao.setId(id);
				repository.save(manutencao);
				return manutencao;
			}
			
			
	
	
	
}
