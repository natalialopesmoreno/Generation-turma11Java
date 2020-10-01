/*
 * 
 * Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, 
 * a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
 * Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
 * 
 */

programa
{
	
	funcao inicio()
	{
		inteiro totalLidos = 0, soma=0, media=0, valorLido=1

		enquanto(valorLido>=0)
		{
			escreva("Digite um número positivo para somar e um negativo para sair: ")
			leia(valorLido)
			totalLidos= totalLidos+1
			soma = soma+valorLido
			}

			media = soma/totalLidos

			escreva("O total do somatório é de: "+soma+"\n"+ "A media é de: "+media+"\n"+ "O total do valores lidos é de: "+totalLidos+"\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 457; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */