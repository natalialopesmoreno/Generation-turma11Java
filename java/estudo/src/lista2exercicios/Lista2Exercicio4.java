package lista2exercicios;

import java.util.Scanner;

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		// Declaração de variárvel
		int numero;
		String mensagem;

		Scanner leia = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Digite um número: ");
		numero = leia.nextInt();

		// Processamento e saída
		
		//Operador ternário precisa de ((condição)? o que acontece se for positivo : o que acontece se for negativo)
		System.out.println(mensagem = ((numero == 0)? "Você digitou 0! Ele é um número neutro e par!" :(numero < 0)? ((numero%2 == 0)? "Este número é negativo e par" : "Este número é negativo e ímpar")  : ((numero%2 == 0)? "Este número é positivo e par" : "Este número é positivo e ímpar") ));
		
	
	

		leia.close();
	}
}
