package lista2exercicios;

import java.util.Scanner;

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		// Declara��o de vari�rvel
		int numero;
		String mensagem;

		Scanner leia = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();

		// Processamento e sa�da
		
		//Operador tern�rio precisa de ((condi��o)? o que acontece se for positivo : o que acontece se for negativo)
		System.out.println(mensagem = ((numero == 0)? "Voc� digitou 0! Ele � um n�mero neutro e par!" :(numero < 0)? ((numero%2 == 0)? "Este n�mero � negativo e par" : "Este n�mero � negativo e �mpar")  : ((numero%2 == 0)? "Este n�mero � positivo e par" : "Este n�mero � positivo e �mpar") ));
		
	
	

		leia.close();
	}
}
