package listaJava2;

import java.util.Scanner;

public class ListaJavaExercicio2 {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		int x =0, par =0, impar =0, numero =0;
		
		
		Scanner leia = new Scanner(System.in);
		for(x = 1; x<= 10; x++) 
		{
			System.out.print("Digite um número");
			numero = leia.nextInt();
			if(numero % 2 !=0)
			{
				impar++;
			}else
			{
				par++;
			}
		}
		System.out.printf("Foram lidos %d números pares e %d número ímpares", par, impar);
		leia.close();
	}

}
