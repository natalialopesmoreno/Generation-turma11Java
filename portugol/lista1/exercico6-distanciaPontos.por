
/*
 * Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
 * A fórmula que efetua tal cálculo é: 
 * 
 */

programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//Declaração de variáveis
		inteiro x1,y1,x2,y2
		real raiz = 0
		real soma=0
		real quadrado1=0
		real quadrado2 =0
		real distancia= 0
		real sub1=0 
		real sub2 =0

		
		//Entrada
		escreva("Por favor informe a posição x do primeiro plano: ")
		leia(x1)
		escreva("Por favor informe a posição y do primeiro plano: ")
		leia(y1)
		escreva("Por favor informe a posição x do segundo plano: ")
		leia(x2)
		escreva("Por favor informe a posição x do segundo plano: ")
		leia(y2)

		//Processamentos
		//realizar as subtrações
		sub1 = x1 - x2
		sub2 = y1 - y2
		//realizar as potências
		quadrado1 = sub1*sub1
		quadrado2 =sub2*sub2
		soma = quadrado1 + quadrado2
		//realizar o calculo da raiz quadrada
		raiz = mat.raiz(soma, 2)
		
		//Saida

		escreva("A distância entre os pontos indicados é de: ", raiz)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 814; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */