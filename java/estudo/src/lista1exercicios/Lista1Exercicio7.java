package lista1exercicios;

import java.util.Scanner;

public class Lista1Exercicio7 {

	public static void main(String[] args) {
		
			
				Scanner leia = new Scanner(System.in);
				int a , b , c , d , e , f ;
				double x=0 , y=0;
				
				
				System.out.print("Informe o Valor de A : ");
				a = leia.nextInt();
				System.out.print("Informe o Valor de B : ");
				b = leia.nextInt();
				System.out.print("Informe o Valor de C : ");
				c = leia.nextInt();
				System.out.print("Informe o Valor de D : ");
				d = leia.nextInt();
				System.out.print("Informe o Valor de E : ");
				e = leia.nextInt();
				System.out.print("Informe o Valor de F : ");
				f = leia.nextInt();
				x = (((c*e)-(b*f))/((a*e)-(b*d)));
				y =  ( ( (a*f) - (c*d) ) / ( (a*e) - (b*d) ) );
				System.out.printf("\nO valor de X � :  %.2f \n", x );
				System.out.printf("\nO valor de Y � :  %.2f", y);
				
				leia.close();
			}
		}
