package lista1exercicios;

import java.util.Scanner;

public class Lista1Exercicio1 {
	public static void main(String[] args)
	{
				int a=0, m=0, d=0, diasDeIdade =0, restoA =0, restoM =0;
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Digite quantos anos de vida você tem: ");
				diasDeIdade = scan.nextInt();
				
				
				restoA = diasDeIdade % 365;
				a = (diasDeIdade-restoA) / 365;
				
				restoM = restoA % 30;
				m = (restoA -restoM)/30;
				System.out.println(m);
				
				d = restoM;
				
				 System.out.println("A sua idade em dias é: " + diasDeIdade);		
				System.out.println("Você tem de idade: " + a + " anos" + m + " meses" + d+ " dias");


		
		
		scan.close();
	}
}
