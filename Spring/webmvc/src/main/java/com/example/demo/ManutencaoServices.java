package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManutencaoServices {

	@Autowired
	private ManutencaoRepository repository;
	
	public List<ManutencaoTable> findAllItens(){
		return (List<ManutencaoTable>) repository.findAll();
	}

	
	
}
