package lista1exercicios;

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {

		int A,B,C;
		int R=0;
		int S =0;
		int D = 0;
		int somaR = 0;
		int somaS = 0;


		Scanner leia = new Scanner(System.in);

		//Entradas
		System.out.println("Por favor, digite o valor de A: ");
		A = leia.nextInt();
		System.out.println("Por favor, digite o valor de B: ");
		B = leia.nextInt();
		System.out.println("Por favor, digite o valor de C: ");
		C = leia.nextInt();
			
		//PRocessamento
		somaR = A + B;
		somaS= B + C;
		R= somaR * somaR;
		S= somaS * somaS;
		D = (R + S)/2;
		

		//Saída

		System.out.println("O valor de D é: "+ D);
		
		leia.close();

	}

}
