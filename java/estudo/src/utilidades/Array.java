package utilidades;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * VETOR COM OS 4 TIMES DE SÃO PAULO
	CORINTHIANS
	PALMEIRAS
	SPFC
	SANTOS
	GANHA - 3 PONTOS
	EMPATA - 1 PONTO
	PERDE - 0 PONTO
	PRIMEIRA RODADA
	CADA TIME SE GANHOU, PERDEU OU EMPATOU
	MOSTRA A PONTUAÇÃO DA PRIMEIRA RODADA
	SEGUNDA RODADA

		 */
		int ganha = 3;
		int empata = 1;
		int perde = 0;
		int contador=1;
		String times [] = {"Corinthians", "Palmeiras", "SPFC", "Santos"};
		int pontuacao [] = new int[4];
		char resposta;
		
		
		
		int rodada=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(contador != 0)
		{
			
			for(int x = 0; x < times.length; x++)
			{
				System.out.printf("Se o time %s ganhou digite G - Se o time  %s perdeu digite P- Se o time  %s empatou digite E", times[x], times[x], times[x]);
				resposta = leia.next().toUpperCase().charAt(0);
				if(resposta == 'G')
				{
					pontuacao[x] = pontuacao[x] + ganha; 
					
				}else if(resposta == 'E') 
				{
					pontuacao[x] = pontuacao[x] + empata;
				}else if(resposta == 'P') 
				{
					pontuacao[x] = pontuacao[x] + perde;
				}else 
				{
					System.out.println("Opção inválida!");
				}
			}
			
			
			rodada++;
			System.out.printf("A pontuação da %d° rodada  é: \nO time %s conquistou %d pontos \nO time %s conquistou %d pontos \nO time %s conquistou %d pontos \nO time %s conquistou %d pontos \n", rodada, times[0], pontuacao[0],times[1], pontuacao[1],times[2], pontuacao[2], times[3], pontuacao[3] );
			
			System.out.print("Deseja continuar para a próxima rodada? Digite um número diferente de 0 para continuar");
			contador = leia.nextInt();
			
			
			
		}
		
		
		
	}

}
