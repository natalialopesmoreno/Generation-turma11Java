package utilidades;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		
		int multiplicador =0;

		int resultado = 0;
		
		//Scanner leia = new Scanner(System.in);
		
		for(int x = 1; x<=10; x++)
		{
			System.out.printf("Tabuada do %d", x);
			System.out.println("\n---------------------------------");
		
			for(int y = 1; y <= 10; y++)
			{
				resultado = x*y;
				System.out.printf("%d x %d = %d", x, y, resultado);
				System.out.println("\n ");
			}
		}
		}

	}

