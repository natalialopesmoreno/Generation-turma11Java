/*
 * Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos

 * 
 * 
 */



programa
{
	funcao inicio()
	{
	
		inteiro idade = 0
		
		escreva("Digite o sua idade:")
		leia(idade)
		
		
		se(idade < 0){
			escreva("Idade inválida!")
			
		}senao se (idade>=18){
				escreva("Sua idade é: "+idade+"! A sua categoria é Adulto")
		
		}senao se (idade > 13 ){
				escreva("Sua idade é: "+idade+"! A sua categoria é Juvenil B")
		}senao se (idade > 11 ){
				escreva("Sua idade é: "+idade+"! A sua categoria é Juvenil A")
		}senao se (idade > 7 ){
				escreva("Sua idade é: "+idade+"! A sua categoria é Infantil B")
		}senao se(idade > 7 ){
				escreva("Sua idade é: "+idade+"! A sua categoria é Infantil A") 
		}senao { 
			escreva("Sua idade é: "+idade+"Você é muito jovem para competir, mais alguns anos e você estará pronto!")
		}
		 		
		}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1013; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */