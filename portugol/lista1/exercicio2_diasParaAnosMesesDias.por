programa
{
	
	funcao inicio()
	{
		//Declarar variáveis
		inteiro idadeAnos = 0, 
		inteiro idadeMeses = 0, 
		inteiro idadeDias= 0
		inteiro restoAnos=0
		inteiro restoMeses=0

		
		//Entrada de dados
		escreva("Digite sua idade em dias: ")
		leia(totalDias)
	
		
		//Processamento
		//convertendo as mediads 
		restoAnos = totalDias % 365 //quero saber o quanto resta da divisão porque o resto será o que eu vou calcuar os meses
		idadeAnos = (totalDias - restoAnos) / 365
		restoMeses = restoAnos % 30 // quero saber o quanto resta dos meses porque o resto eu calcularei os dias
		idadeMeses = (restoAnos - restoMeses) / 30
		idadeDias = restoMeses
		
		
		//Saída de dados
		escreva("De idade você tem: "+ idadeAnos+ "anos " + idadeMeses + "meses " + idadeDias + "dias" )
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 156; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */