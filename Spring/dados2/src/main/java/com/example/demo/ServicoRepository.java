package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
//DENTRO DO <> EU COLOCO PRIMEIRO O NOME DA CLASSE E DEPOIS O TIPO DO ID
public interface ServicoRepository extends JpaRepository<ServicoModel, Long>
{
	
}
