
/*
 *  Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.

 */




programa
{
	
	funcao inicio()
	{
	//Declaração de variáveis
	inteiro numero1, numero2, numero3, numero4, quadrado1,quadrado2,quadrado3,quadrado4
	

	//Entrada de dados
	escreva("Digite o primeiro numero: ")
	leia(numero1)
	escreva("Digite o segundo numero: ")
	leia(numero2)
	escreva("Digite o terceiro numero: ")
	leia(numero3)
	escreva("Digite o quarto numero: ")
	leia(numero4)

	//Processamento e Saida
	quadrado1 = numero1*numero1
	quadrado2 = numero2*numero2
	quadrado3 = numero3*numero3
	quadrado4 = numero4*numero4

	se(quadrado3 >= 1000){
		escreva("O terceiro número é: " + numero3 + "O quadrado do terceiro número é: " + quadrado3)
	} senao {
		escreva("O primeiro número é: " + numero1+ "! Seu quadrado é: " + quadrado1+ "\nO segundo número é: " + numero2+ "! Seu quadrado é: " + quadrado2+ "\nO terceiro número é: " + numero3+ "! Seu quadrado é: " + quadrado3+ "\nO quarto número é: " + numero4+ "! Seu quadrado é: " + quadrado4)
			}
	

	


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 668; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */