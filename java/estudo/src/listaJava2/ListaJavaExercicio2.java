package listaJava2;

import java.util.Scanner;

public class ListaJavaExercicio2 {

	public static void main(String[] args) {
		// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		int x =0, par =0, impar =0, numero =0;
		
		
		Scanner leia = new Scanner(System.in);
		for(x = 1; x<= 10; x++) 
		{
			System.out.print("Digite um n�mero");
			numero = leia.nextInt();
			if(numero % 2 !=0)
			{
				impar++;
			}else
			{
				par++;
			}
		}
		System.out.printf("Foram lidos %d n�meros pares e %d n�mero �mpares", par, impar);
		leia.close();
	}

}
