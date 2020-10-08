package utilidades;

import java.util.Scanner;

public class Laco {

	public static void main(String[] args) {
		
		
		int contador =0;
		int numero =1;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println(numero);
			System.out.println("Digite um número diferente de 0 para continuar");
			contador = leia.nextInt();
			numero++;
			
		}while(contador!=0);

	}

}
