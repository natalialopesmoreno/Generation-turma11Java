package lista1exercicios;

import java.util.Scanner;

public class Lista1Exercicio2 {
	public static void main(String[] args) {
		
		
		
		
		int a=0, m=0, d=0, dias =0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o total de anos: ");
		a = scan.nextInt();
		System.out.println("Digite total em meses: ");
		 m = scan.nextInt();
		 System.out.println("Digite o total de dias: ");
		 d = scan.nextInt();
		 
		 dias = (d + (a *365) + (m*30));
		 System.out.println("A sua idade em dias é: " + dias);
		scan.close();
		
		
	}
}
