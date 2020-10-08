package listaJava2;

import java.util.Scanner;

public class ListaJavaExercicio6 {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. 
		 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		 */

		
		int qtd =0, numero=1, media =0, soma =0;
		
		Scanner leia = new Scanner(System.in);
		
		do 
		{
			
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero%3 ==0) 
			{
			qtd++;
			soma = soma+ numero;
			media = soma/qtd;
			}
			
		}while(numero !=0);

		System.out.println("A média dos números múltiplos de 3 foi: " + soma );
		
	}

}
