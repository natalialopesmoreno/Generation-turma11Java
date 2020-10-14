package utilidades;

import java.util.Random;
import java.util.Scanner;

public class SorteioGruposAleatorios {

	public static void main(String[] args) {
//ESSE PROGRAMA SE BASEIA NA LISTA DE ALUNOS DE UMA CLASSE RECEBE O NÚMERO DE ALUNOS QUE SE DEVE TER POR GRUPO E DIVIDE OS ALUNOS ALEATORIAMENTE NOS GRUPOS


		//DECLARANDO OS VETORES
		final int LIMITE = 39;
		int mat[] = new int [LIMITE]; // 0-38
		String lista[] = {"Bruna dos Santos","BRUNO CORREIA DA COSTA","BRUNO DE FREITAS SOUSA","Carla Cristina Conceição de Paula","Christian Garcia Amantino","Cleiton Ortega dos Santos","Debora Miranda Carmona","Everton Luiz Rosário de Oliveira","GABRIEL REIS RITTER","Gildenor Junior da Silva Costa","Guilherme Marcionilo Pedroso do Rosario Silva","Herick Willians Canhete Rocha","Jacqueline Alves Barbosa","João Victor dos Santos Rigoleto","Jonas De Oliveira Santos","JONATHAN CAVALCANTI DE PAULA","Juliana Cavalaro de Oliveira","Karina Soares Lima","Larissa Meira Dominguez","Leonardo Iamur Terra","Lysandro Andrade Martin","Matheus Araujo de moraes","Matheus Fernandes Rodrigues","Matheus Trindade Torok","Mônica dos santos ribeiro","Natália Lopes moreno","Phelipe Almeida de Souza","Rafaela de Albuquerque","Ricardo Martins Corrêa","SARAH LIDIA DE OLIVEIRA BRAIA","Stefanie Dias Costa","Tiago Diniz Gomes","Victor Augusto de Souza Tavares","Vivian Rodrigues Nakano","Washington pereira dos santos","Wellington Vieira","Wesley Bueno da Silva","Yago Tonoli Domingues","Zaine de Queiros Jesus"};
		int x = 0;
		char resp;
		int pessoasGrupo =0;
		int totalSemresto=0;
		int contador = 0;
		int sorteioPessoa = 0;
		int numeroGrupo = 0;
		int grupo[] = new int [LIMITE];
		int qtdGrupo = 1;
		int copiaqtdGrupo = qtdGrupo;
		int contadorAleatorio = 1;
		int resto =0;
		
		
		Random aleatorio = new Random();
		
		Scanner leia = new Scanner(System.in);
		
		for(x = 0; x <LIMITE; x++)
		{
			mat[x] = x+1;
		}		
		System.out.println("Matricula       Alunox");
		System.out.println("\n");
		
		
		//IMPRIMINDO A LISTA DE ALUNOS
		for (x = 0; x < LIMITE; x++)
		{
			//fuciona bem até o 9
			if (x < 9)
			{
				System.out.println("  "+mat[x]+"             "+ lista[x]);	
			}
			else
			{
				System.out.println("  "+mat[x]+"            "+lista[x]); 	
			}
			System.out.println("\n");
		}

		
		
		
		
		

			
		// DIVIDINDO OS GRUPOS
			System.out.println("Quantas pessoas por grupo você quer que tenha?");
			pessoasGrupo= leia.nextInt();
			
			if(pessoasGrupo <= 20)
			{
			resto = LIMITE%pessoasGrupo;
			totalSemresto = LIMITE - resto;
			System.out.println(resto);
			qtdGrupo =  (totalSemresto/pessoasGrupo);
			System.out.println(qtdGrupo); 
			
			//int numerosSorteados [] = new int [qtdGrupo];

				for(int a = 1; a <= qtdGrupo ; a ++)
				{
					
						for(int y = 0; y< pessoasGrupo  ; y++)
						{
							//Se o resto é 0  o sorteio fica muito difícil no final então eu tive que completar na mão
							if(resto == 0) {
								if(a<qtdGrupo) 
								{
							sorteioPessoa = aleatorio.nextInt(LIMITE-1) + 0;
							while(grupo[sorteioPessoa] != 0) 
							{
								sorteioPessoa = aleatorio.nextInt(LIMITE-1) + 0;
							}
							grupo [sorteioPessoa]= a;
							contador++;
							
							}else 
							{
								for(int b = 1; b <= pessoasGrupo ; b ++)
								{
									for(int c =0; c<LIMITE; c++) 
									{
										if(grupo[c] == 0) 
										{
											grupo[c] = qtdGrupo;
											contador++;
											break;
										}
										
									}
								}
							}
							}
							//SE O RESTO NÃO É ZERO É MAIS FÁCIL QUE EU COMPLETO QUE FICOU FALTANDO ABAIXO
							else 
							{
								sorteioPessoa = aleatorio.nextInt(LIMITE-1) + 0;
								while(grupo[sorteioPessoa] != 0) 
								{
									sorteioPessoa = aleatorio.nextInt(LIMITE-1) + 0;
								}
								grupo [sorteioPessoa]= a;
								contador++;
							}
						}
						
						

					}
				
				//ESSE  É PRA PREENCHER AS PESSOAS QUE ESTÃO SEM NÚMERO
				copiaqtdGrupo = qtdGrupo;
				if(resto !=0) {
					for(int a = 0; a < LIMITE ; a ++) 
					{
						if(grupo[a] == 0) 
						{
								grupo [a] = copiaqtdGrupo;
								copiaqtdGrupo --;
								contador++;
						}
							
						
					}
				}
				
				//AQUI EU IMPRIMO A LISTA DOS GRUPOS
				for(int a = 0; a <= qtdGrupo ; a ++) 
				{
					System.out.printf("\n-------------GRUPO %d-------------\n", a);
					for( x = 0; x < LIMITE ; x ++) 
					{
						if(grupo[x] == a) 
						{
							System.out.println("\nA matrícula é: "+ mat[(x)]+ "\nO grupo é: "+ grupo [x] + "\nA pessoa é :"+ lista[(x)] );

						}
					}
				}
				
		}else
		{
		System.out.println("Você digitou um número inválido Digite um número menor do que 20 e maior do que 1");
		}
		
		

	}

}
