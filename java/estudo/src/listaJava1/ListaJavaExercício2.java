package listaJava1;

import java.util.Scanner;

public class ListaJavaExerc�cio2 {

	public static void main(String[] args) 
	{
	
		/*
		 * Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		 */
		
		int a =0, b =0, c =0;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("Digite o primeiro valor: ");
		a = leia.nextInt();
		System.out.print("Digite o segundo valor: ");
		b = leia.nextInt();
		System.out.print("Digite o terceiro valor: ");
		c = leia.nextInt();

		
				
		
		
		if(a>b && a>c)
		{
			
			if(b>c)
			{
				System.out.printf("Os n�meros e ordem crescente:  %d , %d , %d", a,b,c );
				
			}else 
			{
				System.out.printf("Os n�meros e ordem crescente:  %d , %d , %d", a,c,b );
			}
		} 
		else if(b>a && b>c)
		{
			if(a>c)
			{
				System.out.printf("Os n�meros e ordem crescente:  %d , %d , %d", b,a,c );
				
			}else 
			{
				System.out.printf("Os n�meros e ordem crescente:  %d , %d , %d", b,c,a );
			}

		}
		else if(c>a && c>b)
		{
			if(a>b)
			{
				System.out.printf("Os n�meros e ordem crescente:  %d , %d , %d", c,a,b );
				
			}else 
			{
				System.out.printf("Os n�meros e ordem crescente:  %d , %d , %d", c,b,a );
			}
		}
		leia.close();
	}

}
