package listaJava1;

import java.util.Scanner;

public class ListaJavaExercicio4 
{

	public static void main(String[] args) 
	{
		/*
		 * Fa�a um programa em que permita a entrada de um n�mero qualquer e 
		 * exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; 
		 * se for �mpar exiba o n�mero elevado ao quadrado.
		 */
		
		
		int numero;
		String mensagem;

		Scanner leia = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();

		// Processamento e sa�da
		
		//Operador tern�rio precisa de ((condi��o)? o que acontece se for positivo : o que acontece se for negativo)
		System.out.println(mensagem = ((numero == 0)? "Voc� digitou 0! " :((numero %2 == 0)?  ((numero<0)? "N�o h� raiz quadrada de n�mero negativo!" :"Este n�mero � par! E sua raiz quadrada �: " + Math.sqrt(numero)) : "Este n�mero � �mpar! Seu valor elevado ao quadrado �: " + Math.pow(numero, 2))));
		
		
		
		leia.close();
	}

}
