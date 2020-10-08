package utilidades;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		
		
			int x = 0;
			int y = 0;
			
			Scanner leia = new Scanner(System.in);
			System.out.print("Digite um número: ");
			x = leia.nextInt();
			System.out.print("Digite um outro número: ");
			y = leia.nextInt();
			
			System.out.printf("\nOs números antes: x = %d, y = %d", x,y);
			System.out.println("\n***************************************");
			System.out.println("\n***************************************");
		
			x= x + y; 
			y= x - y;
			x= x - y;
			
			System.out.printf("\nOs números depois: x = %d, y = %d", x,y);
			

//			• x= x + y | x= 70 + 50 , basicamente x=120
//
//			• y= x - y | y = 120 - 70 , ficamos com y=50
//
//			• x= x - y | x= 120 - 50 , finalmente x=70.
	}

}
