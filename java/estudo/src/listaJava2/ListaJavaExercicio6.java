package listaJava2;

import java.util.Scanner;

public class ListaJavaExercicio6 {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado. 
		 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		 */

		
		int qtd =0, numero=1, media =0, soma =0;
		
		Scanner leia = new Scanner(System.in);
		
		do 
		{
			
			System.out.print("Digite um n�mero: ");
			numero = leia.nextInt();
			
			if(numero%3 ==0) 
			{
			qtd++;
			soma = soma+ numero;
			media = soma/qtd;
			}
			
		}while(numero !=0);

		System.out.println("A m�dia dos n�meros m�ltiplos de 3 foi: " + soma );
		
	}

}
