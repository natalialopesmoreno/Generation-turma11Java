/*
 * 
 * Função parImpar

Recebe um valor inteiro
Verificar se o valor é maior que 0 ou 0
Ela não faz em numero negativo
se par mande mensagem
se impar mande mensagem
se zero avise que usuário digitou zero

função inicio(){

inteiro valorUsuario
escreva(“Digite o valor”)
leia(valor)
ParImpar(valor)
}

Função ParImpar(inteiro valor)
{
	
}

 */



programa
{
	
	funcao inicio()
	{
		inteiro valorUsuario
		escreva("Digite o valor: ")
		leia(valorUsuario)
		ParImpar(valorUsuario)
		ParImpar(120)
	}




funcao ParImpar(inteiro valor)
{
	escreva("\n")
	se(valor == 0){
		escreva("Você digitou zero!")
		}
		senao se( valor < 0 )
		{
			escreva("Não é possível realizar a operação com números negativos!")
			}
			senao
			{
				se(valor%2 ==0)
				{
				escreva("Esse é número é par!")	
					} senao
					{
						escreva("Esse número é ímpar!")
						}
				}
				escreva("\n")
}
	 \//Alt+92 ☻☻☻☻
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 895; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */