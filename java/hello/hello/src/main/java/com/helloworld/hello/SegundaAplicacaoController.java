package com.helloworld.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segunda")
public class SegundaAplicacaoController 
{

	@GetMapping
	public String primeira() 
	{
		return "O meu objetivo desta semana foi praticar Joins e aprender API REST e Spring!";
	}
	
}




