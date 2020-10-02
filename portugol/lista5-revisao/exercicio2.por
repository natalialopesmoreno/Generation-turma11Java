/*
 * 
 * O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a c
 * ondição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
IMC em adultos Condição 
Abaixo de 18,5 Abaixo do peso 
Entre 18,5 e 25 Peso normal 
Entre 25 e 30 Acima do peso 
Acima de 30 obeso

 * 
 * 
 */




programa
{
	
	funcao inicio()
	{
		real peso =0, altura =0, IMC =0
		
		
		escreva("Digite o seu peso: ")
		leia(peso)
		escreva("Digite a sua altura: ")
		leia(altura)
		IMC = peso / ( altura*altura )

		se(IMC< 18.5)
		{
			escreva("\nSeu IMC é: ", IMC,"\nVocê está abaixo do peso normal!" )
		}senao se(IMC < 25)
		{
			escreva("\nSeu IMC é: ", IMC,"\nVocê está no peso normal!" )
		} senao se(IMC <= 30 )
		{
			escreva("\nSeu IMC é: ", IMC,"\nVocê está acima no peso normal!" )	
		}senao 
		{
			escreva("\nSeu IMC é: ", IMC,"\nVocê está obeso!" )
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 867; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */