

programa

{	
	funcao pula()
	{
		escreva("\n")
	}
	funcao linha()
	{
		para (inteiro a = 1 ; a < 60; a++){
			escreva("═")
		}
	}
	
	funcao inicio()
	{


		
		//DECLARANDO OS VETORES
		const inteiro LIMITE = 39
		inteiro resto = 0
		inteiro mat[LIMITE] // 0-38
		cadeia lista[] = {"Bruna dos Santos","BRUNO CORREIA DA COSTA","BRUNO DE FREITAS SOUSA","Carla Cristina Conceição de Paula","Christian Garcia Amantino","Cleiton Ortega dos Santos","Debora Miranda Carmona","Everton Luiz Rosário de Oliveira","GABRIEL REIS RITTER","Gildenor Junior da Silva Costa","Guilherme Marcionilo Pedroso do Rosario Silva","Herick Willians Canhete Rocha","Jacqueline Alves Barbosa","João Victor dos Santos Rigoleto","Jonas De Oliveira Santos","JONATHAN CAVALCANTI DE PAULA","Juliana Cavalaro de Oliveira","Karina Soares Lima","Larissa Meira Dominguez","Leonardo Iamur Terra","Lysandro Andrade Martin","Matheus Araujo de moraes","Matheus Fernandes Rodrigues","Matheus Trindade Torok","Mônica dos santos ribeiro","Natália Lopes moreno","Phelipe Almeida de Souza","Rafaela de Albuquerque","Ricardo Martins Corrêa","SARAH LIDIA DE OLIVEIRA BRAIA","Stefanie Dias Costa","Tiago Diniz Gomes","Victor Augusto de Souza Tavares","Vivian Rodrigues Nakano","Washington pereira dos santos","Wellington Vieira","Wesley Bueno da Silva","Yago Tonoli Domingues","Zaine de Queiros Jesus"}
		inteiro x = 0
		caracter resp 
		inteiro numGrupos = 0
		inteiro pessoasGrupo =0
		inteiro contadorGrupo = 1
		inteiro contadorPessoas = 0
		inteiro grupo[LIMITE]
		para (x = 0; x <LIMITE; x++)
		{
			mat[x] = x+1
		}		
		escreva("Matricula       Alunox")
		pula()
		
		para (x = 0; x < LIMITE; x++)
		{
			//fuciona bem até o 9
			se (x < 9)
			{
				escreva("  ",mat[x],"             ",lista[x]) 	
			}
			senao
			{
				escreva("  ",mat[x],"            ",lista[x]) 	
			}
			pula()
		}

		faca{
		escreva("Você deseja continuar? Sim,S ou Não N ")
		leia(resp)
		se(resp == 'S' ou resp =='s' )
		{
			escreva("Quantas pessoas por grupo você quer que tenha?")
			leia(pessoasGrupo)
			se(pessoasGrupo <= 20){
			escreva("Matrícula ", " Grupo", " Aluno")
			
					para (inteiro a = 0; a < LIMITE ; a = a + pessoasGrupo)
					{

						para(inteiro y = 0; y< pessoasGrupo  ; y++)
						{
						se((a < LIMITE) e (a+contadorPessoas < LIMITE))
						{
						grupo[a + contadorPessoas] = contadorGrupo 
						//escreva("\n A matrícula é: ", mat[(a + contadorPessoas)], "\nO grupo é: ", contadorGrupo , "\n A pessoa é :", lista[(a + contadorPessoas)] )
						escreva("\n  ", mat[(a + contadorPessoas)], "    ", contadorGrupo, "    ", lista[(a + contadorPessoas)])
						contadorPessoas++
						}senao
						{ escreva("\nE esse é o último grupo que ficou com menos!")
						pare
						}
						}
						contadorPessoas  = 0
						contadorGrupo ++
					}
			}senao
			{
				escreva("Você digitou um número inválido Digite um número menor do que 20")
				}
			
			}
		}enquanto(resp =='S' ou resp =='s')
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2894; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */