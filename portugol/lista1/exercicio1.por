programa
{
	
	funcao inicio()
	{
		//Declarar variáveis
		inteiro idadeAnos, idadeMeses, idadeDias, 
		inteiro totalDias = 0
		
		//Entrada de dados
		escreva("Digite sua idade: ")
		leia(idadeAnos)
		escreva("Digite quantos meses: ")
		leia(idadeMeses)
		escreva("Digite quantos dias: ")
		leia(idadeDias)
		
		//Processamento
		//convertendo as mediads para dias
		totalDias = idadeAnos*365
		totalDias = totalDias + (idadeMeses*30)
		totalDias = totalDias + idadeDias
		
		//Saída de dados
		escreva("O total de dias de idade é: " + totalDias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 111; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */