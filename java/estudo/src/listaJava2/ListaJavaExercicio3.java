package listaJava2;

import java.util.Scanner;

public class ListaJavaExercicio3 {

	public static void main(String[] args) {
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos. 
		 * O programa termina quando idade for =-99. (WHILE)
		 */
		
		
		int  mais50 =0, menos21 =0, idade =0;
		
		
		Scanner leia = new Scanner(System.in);
		
		while(idade != -99) 
		{
			System.out.println("Digite sua idade: * (Para sair digite -99)");
			idade = leia.nextInt();
			if(idade> 50)
			{
				mais50++;
			}else if(idade < 21 && idade > 0)
			{
				menos21++;
			}
			
		}
		
		System.out.printf("\nForam verificadas %d pessoas com menos de 21 anos e %d pessoas com mais de 50 anos", menos21, mais50);

	}

}
