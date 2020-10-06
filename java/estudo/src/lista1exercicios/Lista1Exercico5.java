package lista1exercicios;

import java.util.Scanner;

public class Lista1Exercico5 {

	public static void main(String[] args) {
		
		
		double nota1, nota2, nota3;
		double media =0;
		
		Scanner leia = new Scanner(System.in);
		//Entrada
		
		System.out.println("Por favor digite a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Por favor digite a segunda nota: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Por favor digite a terceira nota: ");
		nota3 = leia.nextDouble();
		//Processamentos
		media = (nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5);

		//Saida
		System.out.println("A sua média é : "+ media);
		
		leia.close();

	}

}
