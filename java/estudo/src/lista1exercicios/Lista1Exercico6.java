package lista1exercicios;

import java.util.Scanner;

public class Lista1Exercico6 {

	public static void main(String[] args) {
		//Declara��o de vari�veis
				int x1,y1,x2,y2;
				double raiz = 0;
				double soma=0;
				double quadrado1=0;
				double quadrado2 =0;
				double distancia= 0;
				double sub1=0;
				double sub2 =0;

				Scanner leia = new Scanner(System.in);
				
				//Entrada
				System.out.println("Por favor informe a posi��o x do primeiro plano: ");
				x1 = leia.nextInt();
				
				System.out.println("Por favor informe a posi��o y do primeiro plano: ");
				y1 = leia.nextInt();
				
				System.out.println("Por favor informe a posi��o x do segundo plano: ");
				x2 = leia.nextInt();
				
				System.out.println("Por favor informe a posi��o y do segundo plano: ");
				y2 = leia.nextInt();
				

				//Processamentos
				//realizar as subtra��es
				sub1 = x1 - x2;
				sub2 = y1 - y2;
				//realizar as pot�ncias
				quadrado1 = sub1*sub1;
				quadrado2 =sub2*sub2;
				soma = quadrado1 + quadrado2;
				//realizar o calculo da raiz quadrada
				raiz = Math.sqrt(soma);
				
				//Saida
				System.out.println("A dist�ncia entre os pontos indicados � de: "+ raiz);

				

	}

}
