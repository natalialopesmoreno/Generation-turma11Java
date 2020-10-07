package listaJava1;

import java.util.Scanner;

public class ListaJavaExercicio1 {
	public static void main(String[] args) 
	{
	
		/*
		 * Faça um programa que receba três inteiros e diga qual deles é o maior.
		 * 
		 */
		
		int a =0, b =0, c =0;
		String mensagem;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		a = leia.nextInt();
		System.out.print("Digite o segundo valor: ");
		b = leia.nextInt();
		System.out.print("Digite o terceiro valor: ");
		c = leia.nextInt();
		
		
		mensagem = ((a>b)? ((a>c)?" O maior númer é o primeiro , no valor de:"+ a : " O maior númer é o terceiro , no valor de:"+ c) : ((b>c)?" O maior número é o segundo, no valor de:"+ b : " O maior númer é o terceiro , no valor de:"+ c) );
		System.out.print(mensagem);
		
		leia.close();
		
		
	}
}
