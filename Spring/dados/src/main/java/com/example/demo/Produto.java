package com.example.demo;

import javax.persistence.*;

@Entity
// SE EU QUISER MUDAR O NOME DA TABELA SEM MUDAR O NOME DA CLASSE-@Table(name="Produtos")
public class Produto 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nome;
}
