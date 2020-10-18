package listaJava5Polimorfismo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Crie uma um programa para trabalhar com estoque de uma loja, 
		 * o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, 
		 * o programa deverá atender as seguintes funcionalidades:

			Armazenar dados da List
			Remover dados da list;
			Atualizar dados da list.
			Apresentar todos os dados da list.

		 */
		
		int index;
		
		List<Produto> lista = new ArrayList<Produto>();
		//Set  lista = new LinkedHashSet();
		
		Produto produto1 = new Produto("Televisão", 1, 2500.99, "Preta", 10);
		Produto produto2 = new Produto("Geladeira", 2, 1500.99, "Inox", 10);
		Produto produto3 = new Produto("Smartphone",3, 2000.99, "Branco", 10);
		Produto produto4 = new Produto("Forno", 4, 800.99, "Preto", 10);
		Produto produto5 = new Produto("Notebook", 5, 5500.99, "Branco", 10);
		//Cachorro c2 = new Cachorro("Cachorro3", 3, "marrom");
		
		lista.add(produto1);
		lista.add(produto2);
		lista.add(produto3);
		lista.add(produto4);
		lista.add(produto5);
		//lista.add(c2);
		
		
		System.out.println("----------LISTA DEPOIS DE ADICIONAR----------");
		for (Object obj : lista) 
		{
			System.out.println(obj.toString());
			System.out.println("\n");
			System.out.println("\n");
		}
		
		lista.remove(produto4);
		lista.remove(produto2);
		System.out.println("----------LISTA DEPOIS DE REMOVER----------");
		for (Object obj : lista) 
		{
			System.out.println(obj.toString());
			System.out.println("\n");
			System.out.println("\n");
		}
		
		lista.add(produto4);
		index = lista.indexOf(produto4);
		produto4.setPreco(999.00);
		lista.set(index, produto4);
		
		System.out.println("----------LISTA DEPOIS DE MODIFICAR ----------");
		for (Object obj : lista) 
		{
			System.out.println(obj.toString());
			System.out.println("\n");
			System.out.println("\n");
		}
		
		



	}

}
