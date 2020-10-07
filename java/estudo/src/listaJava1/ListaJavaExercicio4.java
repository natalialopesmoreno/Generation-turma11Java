package listaJava1;

import java.util.Scanner;

public class ListaJavaExercicio4 
{

	public static void main(String[] args) 
	{
		/*
		 * Faça um programa em que permita a entrada de um número qualquer e 
		 * exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; 
		 * se for ímpar exiba o número elevado ao quadrado.
		 */
		
		
		int numero;
		String mensagem;

		Scanner leia = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Digite um número: ");
		numero = leia.nextInt();

		// Processamento e saída
		
		//Operador ternário precisa de ((condição)? o que acontece se for positivo : o que acontece se for negativo)
		System.out.println(mensagem = ((numero == 0)? "Você digitou 0! " :((numero %2 == 0)?  ((numero<0)? "Não há raiz quadrada de número negativo!" :"Este número é par! E sua raiz quadrada é: " + Math.sqrt(numero)) : "Este número é ímpar! Seu valor elevado ao quadrado é: " + Math.pow(numero, 2))));
		
		
		
		leia.close();
	}

}
