/*
 * 
 * Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos. 
 * Em seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.
 * 
 */


programa
{
	
	funcao inicio()
	{
		const inteiro TAMANHO = 3
		inteiro vetor [TAMANHO]
		inteiro matriz [TAMANHO][TAMANHO]
		inteiro matrizMultiplicacao [TAMANHO][TAMANHO]

		para(inteiro x = 0; x < 3; x++)
		{
			escreva("\nDigite um número: ")
			leia(vetor[x])
		}
		//Preenchendo a MAtriz com números
		para(inteiro x = 0; x < TAMANHO; x++)
		{
			//Aqui o ponteiro está apontando para a linha
			para(inteiro y = 0; y <TAMANHO; y++)
			{
				//Aqui o ponteiro está indo para cada coluna da linha que foi escolhida
				escreva("\nDigite um número: ")
				leia(matriz[x][y])
			}
			
		}

		//Aqui iremos multiplicar o vetor pela matriz
		para(inteiro x = 0; x < TAMANHO; x++)
		{
			//Aqui o ponteiro está apontando para a linha
			para(inteiro y = 0; y < TAMANHO; y++)
			{
				//Aqui o ponteiro está indo para cada coluna da linha que foi escolhida
				
				matrizMultiplicacao [x][y] = vetor[x] *matriz[x][y] 
			}
			
		}


		//saída com mais um laço para apresentar os resultados objetido através da multiplicação
			escreva("Multiplicação do vetor pelas colunas da matriz:\n")
			para(inteiro x=0; x<TAMANHO;x++){
			//laço da coluna da matriz
			para (inteiro 2z=0; z < TAMANHO; z++){
				escreva(matrizMultiplicacao [x][z]);
				escreva("\n")
				}
		
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1272; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */