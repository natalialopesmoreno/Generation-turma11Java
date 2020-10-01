/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
 * exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
 * 
 */


programa
{
	
	
	funcao inicio()
	{
		// Declaração de variáveis
		inteiro Matriz[3][3]//essa matriz tem 3 linhas e 3 colunas
		inteiro soma =0
		inteiro somaDiagonal = 0

		//Entrada e Processamento
	para(inteiro linha = 0; linha < 3; linha++)
		{ // apontar para cada linha 0 ( eu só vou para a próxima passagem desse laço depois que fazer TUDO que está dentro das chaves)
			
			
			para(inteiro coluna= 0; coluna < 3; coluna++)
			{
			//apontar para cada coluna da linha(nesse para ele prenche todos os números daquela linha definida no "para" anterior, nesse caso sabemos que ele terá que preencher 3 números em cada linha)
			escreva("\nDigite o número da posição ["+linha+"]["+coluna+"]: ")
			leia(Matriz[linha][coluna])
			//A cada número que eu inserir na minha matriz eu somarei ele na variável abaixo
			soma = soma + Matriz[linha][coluna]
			
			
			}
//Na somaDiagonal e tenho que pegar um número de cada linha, da linha 0 eu pego a primeira posição que é a posição zero, então fica [0][0], na segunda linha eu pego o segundo número, para ser uma diagonal inclinada entã será o [1][1], e a última tem que continual inclinanbdo a diagonal então será mais pro  lado será o número na posição [3][3]
			somaDiagonal = somaDiagonal + Matriz[linha][linha]
		}
		
		// Saída
		limpa()
		escreva("\nA soma dos valores é de: " +soma)
		escreva("\nA soma dos valores da diagonal principal é de: " + somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1268; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */