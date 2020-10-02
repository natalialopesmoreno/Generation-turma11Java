/*
 * 
 * Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
 * Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
Código Condição de pagamento 
1 À vista em dinheiro ou cheque, recebe 20% de desconto 
2 À vista no cartão de crédito, recebe 15% de desconto 
3 Em duas vezes, preço normal de etiqueta sem juros 
4 Em três vezes, preço normal de etiqueta mais juros de 10%

 * 
 * 
 */


programa
{
	
	funcao inicio()
	{


	const inteiro LIMITE=4
		cadeia produtos[] = {"Camisa","Calça","Camiseta","Vestido"}
		real precos[] = {100.00, 300.50, 90.75, 250.00}
		inteiro x
		inteiro codigo
		
		inteiro pagamento = 0
		para (x = 0; x<LIMITE;x++)
		{
			escreva("Codigo produto ",x+1," ",produtos[x],"  R$ ",precos[x])
			pulalinha()
		}
		
		



		escreva("Vai compra o que? Digite o codigo do produto:")
		leia(codigo)
		codigo= codigo-1
		pulalinha()
		escreva("Vc escolheu ",produtos[codigo]," no valor de ", precos[codigo])
		pulalinha()
		escreva("Vai pagar como:\n")
		escreva("1 À vista em dinheiro ou cheque, recebe 20% de desconto \n")
		escreva("2 À vista no cartão de crédito, recebe 15% de desconto \n")
		escreva("3 Em duas vezes, preço normal de etiqueta sem juros \n")
		escreva("4 Em três vezes, preço normal de etiqueta mais juros de 10%\n")
		escreva("Digite o numero da opcao:")
		
		leia(pagamento)

		escolha(pagamento){
			
			caso 1:
			valor = valor - (valor*0.20)
			escreva( "\nO valor a ser pago à vista será: ", valor )
			pare
			caso 2: 
			valor = valor - (valor*0.15)
			escreva( "\nO valor a ser pago à vista no cartão de crédito será: ", valor )
			pare
			caso 3:
			valor = valor / 2
			escreva( "\nO valor a ser pago será 2 parcelas de: ", valor )
			pare
			caso 4:
			valor = (valor*1.10) / 3
			escreva( "\nO valor a ser pago será 3 parcelas de: ", valor )
			pare
			caso contrario: 
			escreva("Opção inválida!")
			
			}
		
		
	}
	funcao pulalinha()
	{
		escreva("\n")
	}




		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 774; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */