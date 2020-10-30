package com.helloworld.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeira")
public class PrimeiraAplicacaoController 
{
	@GetMapping
	public String primeira() 
	{
		return "As habilidades utilizadas neste projeto foram: Persistência, Comunicação, Orientação ao futuro, Mentalidade de crescimento e Atenção aos detalhes!";
	}

}
