
/*
 * 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.
 * 
 */



programa
{
	
	funcao inicio()
	{
		//Declaração de variárvel
		inteiro numero

		//Entrada de dados
		escreva("Digite um número: ")
		leia(numero)

		//Processamento e saída
		se(numero< 0 e (numero%2 ==0)){
			escreva("O número digitado é: "+ numero+ "! Este é um número negativo e par")
			
			}senao se(numero< 0 e (numero%2 !=0))
			{
				escreva("O número digitado é: "+ numero+ "! Este é um número negativo e ímpar")
				} 
			senao se(numero == 0){

			escreva("O número digitado é: "+ numero+ "!Este é um número neutro e par!")
				
				}senao{
				
				se(numero % 2 ==0){
					
					escreva("O número digitado é: "+ numero+ "!Este é um número positivo e par!")
					
					}senao{
						
						escreva("O número digitado é: "+ numero+ "!Este é um número positivo e ímpar!")
						
						}
		
				}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 543; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz;
 */
