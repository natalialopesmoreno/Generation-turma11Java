package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//DENTRO DO <> EU COLOCO PRIMEIRO O NOME DA CLASSE E DEPOIS O TIPO DO ID
public interface ManutencaoRepository extends JpaRepository<ManutencaoTable, Long> {

	Optional<ManutencaoTable> findByNome(String nome);

	Optional<ManutencaoTable> findByNomeAndCategoria(String nome, String categoria);


}
