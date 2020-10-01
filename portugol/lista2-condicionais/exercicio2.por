
/*
 * Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
 * E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
 * caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
 * No final do processamento imprimir o salário total e o salário excedente.
 * 
 * 
 * 
 */


programa
{
	
	funcao inicio()
	{
		//declaração de variáveis

		inteiro C = 0 // código
		inteiro valorHora = 10 // Até 50 horas
		inteiro valorHoraExcesso = 20
		real pagamento = 0 //soma do salarioToTal e do salarioExcedente
		real salarioTotal = 0 // salario total até as 50 horas
		real E = 0 // valor recebido pelas horas extras
		real N = 0// número de horas trabalhadas
		

		//entrada de dados
		escreva("Digite a quantidade de horas de trabalho: ")
		leia(N)
		escreva("Digite o número do código: ")
		leia(C)
		
		
		

		//Processamento
		salarioTotal = 50 * valorHora
		
		se(N > 50){
			E = (N -50)*valorHoraExcesso 
			}

			pagamento = salarioTotal + E
		//Saída
		escreva("O empresário de código: "+C+" trabalhou  "+N+ " horas"+" o sálario total regular é de: " + salarioTotal + "O pagamento do excesso de trabalho foi de: "+ E + "O pagamento final foi de: "+ pagamento)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 128; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */