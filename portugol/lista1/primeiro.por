programa
{
	

	
	funcao inicio()
	{
		//escreva("Oi, ")
		//escreva("meu nome é Natália, ")
		//escreva("sou aluna da Generation")
		cadeia nomeUsuario//declaração da variável
		inteiro anoNascimento
		real salario
		
		//Entrada
		escreva("Digite o nome do usuario: ")// escreveu na tela
		leia(nomeUsuario)// atribuiu o que foi escrito à variável declarada anteriormente
		//escreva(nomeUsuario)//imprimindo a informação no console
		escreva("Digite seu ano de nascimento: ")
		leia(anoNascimento)
		escreva("Digite seu salário: ")// separe o salario com ponto e não com vírgula
		leia(salario)
		inteiro idade = 2020 - anoNascimento
		
		//saida
		escreva("\n Olá! O seu nome é: "+ nomeUsuario)
		escreva("\n Eu nasci no ano de: ", anoNascimento)
		escreva("\n Meu salário é de: ", salario)
		escreva("\n Minha idade é: "+ idade + " anos")
	}	

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 685; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */