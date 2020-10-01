programa
{
	
	funcao inicio()
	{
		//declaração de variáveis
		real P = 0
		real M = 0
		real E = 0

		//entrada de dados
		escreva("Digite o peso dos tomates: ")
		leia(P)
		

		//Processamento
		se(P > 50){
			E = P-50
			M = 4*E
			
			}
		//Saída
		escreva("O peso dos tomates é de: "+P+" o excesso é de: " +E+" a multa é de: " + M)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */