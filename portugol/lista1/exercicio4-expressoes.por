/*
 * Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
 */

programa
{
	
	funcao inicio()
	{
		//Declaração de variáveis

		inteiro A,B,C
		inteiro R=0
		inteiro S =0
		inteiro D = 0
		inteiro somaR = 0
		inteiro somaS = 0



		//Entradas
		escreva("Por favor, digite o valor de A: ")
		leia(A)
		escreva("Por favor, digite o valor de B: ")
		leia(B)
		escreva("Por favor, digite o valor de C: ")
		leia(C)
			
		//PRocessamento
		somaR = A + B
		somaS= B + C
		R= somaR * somaR
		S= somaS * somaS
		D = (R + S)/2
		

		//Saída

		escreva("O valor de D é: "+ D)


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 262; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */