package listaJava2;

import java.util.Scanner;

public class ListaJavaExercicio5 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		 */
		
		int soma=0, numero=1;
		
		Scanner leia = new Scanner(System.in);
		
		do 
		{
			
			System.out.print("Digite um n�mero: ");
			numero = leia.nextInt();
			soma += +numero;
			
		}while(numero !=0);

		System.out.println("A soma dos n�meros digitados foi: " + soma );
	}

}
