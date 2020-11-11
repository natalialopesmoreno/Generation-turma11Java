package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//DENTRO DO <> EU COLOCO PRIMEIRO O NOME DA CLASSE E DEPOIS O TIPO DO ID
public interface ManutencaoRepository extends JpaRepository<ManutencaoTable, Long> {

	Optional<ManutencaoTable> findByNome(String nome);

	Optional<ManutencaoTable> findByNomeAndCategoria(String nome, String categoria);
	
	  @Query(value = "SELECT * FROM tb_manutencao_crud where id >= 3", nativeQuery = true)
	    List<ManutencaoTable> anosIntervalos();



}
