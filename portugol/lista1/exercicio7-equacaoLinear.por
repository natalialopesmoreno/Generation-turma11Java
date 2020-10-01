/*
 * Um sistema de equações lineares do tipo: 
, pode ser resolvido segundo mostrado abaixo : 
 
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 

 * 
 * 
 * 
 * 
 */



programa
{
	
	funcao inicio()
	{

		//Declaração de variáveis
		real    A,B,C,D,E,F
		real X = 0
		real Y = 0

		
		//Entrada
		escreva("Pro favor digite o coeficiente A: ")
		leia(A)
		escreva("Pro favor digite o coeficiente B: ")
		leia(B)
		escreva("Pro favor digite o coeficiente C: ")
		leia(C)
		escreva("Pro favor digite o coeficiente D: ")
		leia(D)
		escreva("Pro favor digite o coeficiente E: ")
		leia(E)
		escreva("Pro favor digite o coeficiente F: ")
		leia(F)
		
		//Processamentos
		X = (C*E - B*F)/(A*E -B*D)
		Y = (A*F - C*D)/(A*E - B*D)
		
		//Saida
		escreva("\nO valor de X é: " + X)
		escreva("\nO valor de Y é: "+ Y)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */