/*
 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

 * 
 */

programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		//Declaração de variável
		inteiro N1[4][6]
		inteiro N2[4][6]
		inteiro M1soma[4][6]
		inteiro M2sub[4][6]

		//Entrada,Processamento e Saída

		para(inteiro linha = 0; linha < 4; linha = linha +1)
		{
			
			para(inteiro y= 0; y < 6; y = y+1)

		
			{
				// Eu insiro um número sorteado em A1, insiro um número sorteado em A2, insiro a soma destes dois números em M1soma e insiro a subtração no M2sub
			N1[linha][y] = Util.sorteia(1, 100)
			N2[linha][y] = Util.sorteia(1, 100)
			M1soma[linha][y] = N1[x][y] + N2[x][y]
			M2sub[linha][y] = N1[x][y] - N2[x][y]
			pula()
			escreva("O valor de N1 na posição["+x+"]["+y+"] é de: "+N1[x][y])
			pula()
			escreva("O valor de N2 na posição["+x+"]["+y+"] é de: "+N2[x][y])
			pula()
			escreva("O valor de M1 na posição" + "["+x+"]["+y+"] é de: "+ M1soma[x][y])
			pula()
			escreva("O valor de M2 na posição ["+x+"]["+y+"] é de: "+ M2sub[x][y])
			pula()
			pula()
			
			}
			pula()
			pula()
	}
}
	funcao pula(){
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 719; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */