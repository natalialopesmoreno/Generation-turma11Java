package lista1exercicios;

import java.util.Scanner;

public class Lista1Exercicio8 {

	public static void main(String[] args) {

		
		//Declaração de variáveis
				double custoFabrica;
				double custoCliente = 0;
				double percentagemDistribuidor = 0.28;
				double impostos = 0.45;

				Scanner leia = new Scanner(System.in);
				//Entrada de dados
				System.out.println("Por favor insira o custo de Fábrica do veículo: ");
				custoFabrica = leia.nextDouble();
				//Processamento
				custoCliente = custoFabrica +(custoFabrica*percentagemDistribuidor) + (custoFabrica*impostos);
				//Saída
				System.out.println("O custo do veículo para o cliente é de: " + custoCliente);
		
		
	}

}
