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

		
//		Desafio de colocar o sistema todo em tern�rio			
		String msg = ((a>=b && a>=c)? ((b>=c)?"Os n�meros e ordem crescente: " + a +" "+ b+ " " +c :"Os n�meros e ordem crescente: "+ a+ " "+c+" "+b ):(b>=a && b>=c)? ((a>=c)? "Os n�meros e ordem crescente: "+ b+ " "+a+" "+ c :  "Os n�meros e ordem crescente: "+ b+ " "+c+" "+ a) : ((c>=a && c>=b))? ((a>=b)? "Os n�meros e ordem crescente: "+ c+ " "+a+" "+ b :  "Os n�meros e ordem crescente: "+ c+ " "+b+" "+ a): " " );
		System.out.println(msg);
		
//		if(a>=b && a>=c)
//		{
//			
//			Em formato tern�rio(dentro do primeiro if)
//			System.out.printf(((b>=c)?"Os n�meros e ordem crescente: " + a +" "+ b+ " " +c :"Os n�meros e ordem crescente: "+ a+ " "+c+" "+b ));
//			Em formato tradicional
//			if(b>=c)
//			{
//				System.out.printf("Os n�meros e ordem crescente:  %d , %d , %d", a,b,c );
//				
//			}else 
//			{
//				System.out.printf("Os n�meros e ordem crescente:  %d , %d , %d", a,c,b );
//			}
//		} 
//		else if(b>=a && b>=c)
//		{
//			
//			//			Em formato tern�rio(dentro do primeiro if)
//			System.out.println(((a>=c)? "Os n�meros e ordem crescente: "+ b+ " "+a+" "+ c :  "Os n�meros e ordem crescente: "+ b+ " "+c+" "+ a));
//			Em formato tradicional
//		
//			if(a>=c)
//			{
//				System.out.printf("Os n�meros e ordem crescente:  %d , %d , %d", b,a,c );
//				
//			}else 
//			{
//				System.out.printf("Os n�meros e ordem crescente:  %d , %d , %d", b,c,a );
//			}

//		}
//		else if(c>=a && c>=b)
//			
//		{
//			//			Em formato tern�rio(dentro do primeiro if)
//			System.out.println(((a>=b)? "Os n�meros e ordem crescente: "+ c+ " "+a+" "+ b :  "Os n�meros e ordem crescente: "+ c+ " "+b+" "+ a));

//			if(a>=b)
//			{
//				System.out.printf("Os n�meros e ordem crescente:  %d , %d , %d", c,a,b );
//				
//			}else 
//			{
//				System.out.printf("Os n�meros e ordem crescente:  %d , %d , %d", c,b,a );
//			}
		leia.close();
		}
		
	}


