package lista1exercicios;

import java.util.Scanner;

public class Lista1Exercicio8 {

	public static void main(String[] args) {

		
		//Declara��o de vari�veis
				double custoFabrica;
				double custoCliente = 0;
				double percentagemDistribuidor = 0.28;
				double impostos = 0.45;

				Scanner leia = new Scanner(System.in);
				//Entrada de dados
				System.out.println("Por favor insira o custo de F�brica do ve�culo: ");
				custoFabrica = leia.nextDouble();
				//Processamento
				custoCliente = custoFabrica +(custoFabrica*percentagemDistribuidor) + (custoFabrica*impostos);
				//Sa�da
				System.out.println("O custo do ve�culo para o cliente � de: " + custoCliente);
		
		
	}

}
