/*
 * Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
 */

programa
{
	
	funcao inicio()
	{
		//Declaração de variáveis
		real nota1, nota2, nota3, 
		real media =0
		//Entrada
		escreva("Por favor digite a primeira nota: ")
		leia(nota1)
		escreva("Por favor digite a segunda nota: ")
		leia(nota2)
		escreva("Por favor digite a terceira nota: ")
		leia(nota3)
		//Processamentos
		media = (nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5)

		//Saida
		escreva("A sua média é : ", media)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */