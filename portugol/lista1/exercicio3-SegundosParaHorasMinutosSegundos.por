programa
{
	
	funcao inicio()
	{
		//Declarando variáveis
		inteiro totalSegundos, 
		inteiro tempoHoras=0 
		inteiro tempoMinutos=0 
		inteiro tempoSegundos=0 
		inteiro restoHoras=0 
		inteiro restoMinutos=0


		//entrada de dados
		escreva("Informe o tempo total em segundos: ")
		leia(totalSegundos)

		//Processamento
		restoHoras = totalSegundos % 3600
		tempoHoras = (totalSegundos- restoHoras)/3600
		restoMinutos = restoHoras % 60
		tempoMinutos = (restoHoras-restoMinutos)/60
		tempoSegundos = restoMinutos
		

		//saída de dados

		escreva("O tempo em total é de: " + tempoHoras + " horas " + tempoMinutos+ " minutos " + tempoSegundos + " segundos ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 187; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */