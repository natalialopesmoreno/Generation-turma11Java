package utilidades;

import java.util.Scanner;

public class SorteioGrupos {

	public static void main(String[] args) {

		


				
				//DECLARANDO OS VETORES
				final int LIMITE = 39;
				int resto = 0;
				int mat[] = new int [LIMITE]; // 0-38
				String lista[] = {"Bruna dos Santos","BRUNO CORREIA DA COSTA","BRUNO DE FREITAS SOUSA","Carla Cristina Concei��o de Paula","Christian Garcia Amantino","Cleiton Ortega dos Santos","Debora Miranda Carmona","Everton Luiz Ros�rio de Oliveira","GABRIEL REIS RITTER","Gildenor Junior da Silva Costa","Guilherme Marcionilo Pedroso do Rosario Silva","Herick Willians Canhete Rocha","Jacqueline Alves Barbosa","Jo�o Victor dos Santos Rigoleto","Jonas De Oliveira Santos","JONATHAN CAVALCANTI DE PAULA","Juliana Cavalaro de Oliveira","Karina Soares Lima","Larissa Meira Dominguez","Leonardo Iamur Terra","Lysandro Andrade Martin","Matheus Araujo de moraes","Matheus Fernandes Rodrigues","Matheus Trindade Torok","M�nica dos santos ribeiro","Nat�lia Lopes moreno","Phelipe Almeida de Souza","Rafaela de Albuquerque","Ricardo Martins Corr�a","SARAH LIDIA DE OLIVEIRA BRAIA","Stefanie Dias Costa","Tiago Diniz Gomes","Victor Augusto de Souza Tavares","Vivian Rodrigues Nakano","Washington pereira dos santos","Wellington Vieira","Wesley Bueno da Silva","Yago Tonoli Domingues","Zaine de Queiros Jesus"};
				int x = 0;
				char resp;
				int numGrupos = 0;
				int pessoasGrupo =0;
				int contadorGrupo = 1;
				int contadorPessoas = 0;
				int grupo[] = new int [LIMITE];
				
				Scanner leia = new Scanner(System.in);
				
				for(x = 0; x <LIMITE; x++)
				{
					mat[x] = x+1;
				}		
				System.out.println("Matricula       Alunox");
				System.out.println("\n");
				
				for (x = 0; x < LIMITE; x++)
				{
					//fuciona bem at� o 9
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

				do{
				System.out.println("Voc� deseja continuar? Sim,S ou N�o N ");
				resp = leia.next().toUpperCase().charAt(0);
				if(resp == 'S' )
				{
					System.out.println("Quantas pessoas por grupo voc� quer que tenha?");
					pessoasGrupo= leia.nextInt();
					
					if(pessoasGrupo <= 20){
					System.out.println("Matr�cula "+ " Grupo"+ " Aluno");
					
							for (int a = 0; a < LIMITE ; a += pessoasGrupo)
							{

								for(int y = 0; y< pessoasGrupo  ; y++)
								{
									if((a < LIMITE) && (a+contadorPessoas < LIMITE))
									{
									grupo[a + contadorPessoas] = contadorGrupo; 
									//escreva("\n A matr�cula �: ", mat[(a + contadorPessoas)], "\nO grupo �: ", contadorGrupo , "\n A pessoa � :", lista[(a + contadorPessoas)] )
									System.out.println("\n  "+mat[(a + contadorPessoas)]+ "    "+ contadorGrupo+ "    "+ lista[(a + contadorPessoas)]);
									contadorPessoas++;
									}else
									{ System.out.println("\nE esse � o �ltimo grupo que ficou com menos!");
										break;
									}
								}
								contadorPessoas  = 0;
								contadorGrupo ++;
							}
					}else
					{
						System.out.println("Voc� digitou um n�mero inv�lido Digite um n�mero menor do que 20");
						}
					
					}
				}while(resp =='S');
				
	


	}

}
