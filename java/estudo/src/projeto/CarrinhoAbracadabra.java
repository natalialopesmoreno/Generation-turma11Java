package projeto;

import java.util.Scanner;

public class CarrinhoAbracadabra {
public static void main(String[] args) {
	

	
	
	
//	//			COMPRA UM PRODUTO – QTDE
//	MONTA UM SUBTOTAL - OK
//	CONTINUA S/N - OK
//	COMPRA ALGO NOVO OU ALTERAR O QUE JÁ COMPROU ***Falta esse
//	O VALOR DE ESTOQUE TEM QUE SER ATUALIZADO-OK
//	A COMPRA TEM QUE SER COMPATIVEL COM ESTOQUE-OK
	
	
	String nome;
	char sexo;
	int dia=0;
	int mes =0;
	int ano=2020;
	String produtos[] = {"Camiseta", "Blusa", "Saia", "Calça", "Vestido", "Shorts", "Jaqueta", "Chapéu", "Sapato", "Cachecol"};
	int precos [] = {40, 90, 30, 95, 120, 50, 200, 30, 150, 40};
	int quantidade [] = {10,10,10,10,10,10,10,10,10,10};
	
	String produtosCarrinho[] = new String[produtos.length];
	int quantidadeCarrinho[] = new int[produtos.length];
	int valorCarrinho [] = new int[produtos.length];
	int codigoCarrinho [] = new int[produtos.length];
	int subtotal =0;
	int codigoProdutoComprar =0;
	int totalItensCarrinho =0;
	int quantidadeProdutoCarrinho =0;
	char contador ='S';
	int funcao = 0;
	int diferencaAlteracao = 0;

	
	
	
	Scanner leia = new Scanner(System.in);
	
	System.out.print("Digite o seu nome: ");
	nome = leia.next();
	System.out.print("Digite o seu sexo:F- feminino, M- masculino, O - outros ");
	sexo = leia.next().toUpperCase().charAt(0);
	System.out.print("Digite o dia de hoje 1-31: ");
	dia = leia.nextInt();
	System.out.print("Digite o mês 1-12 : ");
	mes = leia.nextInt();
	
	while(contador =='S' ) 
	{
		System.out.println("----------------------------------------------------PRODUTOS-LOJAS-ABRACADABRA----------------------------------------------------\n");
	System.out.println("CÓDIGO ---- QTDE---- PRODUTO ---- PREÇO ----\n");
		
		for(int x = 0; x < produtos.length; x++ ) 
		{
			
			System.out.println(x + "        " + quantidade[x] + "        " +produtos[x] + "        " + precos[x] );
		}
		
	System.out.println("Você deseja:\n 1- Inserir produtos ao carrinho \n 2-Remover algum produto \n 3- Alterar a quantidade do produto \n 4- Visualizar carrinho \n 5-Sair");
		funcao = leia.nextInt();
		switch (funcao) {
		case 1: {
			//Inserir produto
			System.out.printf("Cliente %s digite o código do produto que deseja comprar?", nome);
			codigoProdutoComprar = leia.nextInt();
				if(quantidade[codigoProdutoComprar] < 0 ){
				System.out.println("Sinto muito o produto está esgotado!");
				}else 
				{
				System.out.printf("O produto que você selecionou é %s, por favor informe a quantidade: ", produtos[codigoProdutoComprar]);
				quantidadeProdutoCarrinho = leia.nextInt();

				
					if(quantidadeProdutoCarrinho <= quantidade[codigoProdutoComprar] )
					{
					quantidade[codigoProdutoComprar] -= quantidadeProdutoCarrinho;
					produtosCarrinho[codigoProdutoComprar] = produtos[codigoProdutoComprar];
					quantidadeCarrinho[codigoProdutoComprar] = quantidadeProdutoCarrinho;
					valorCarrinho [codigoProdutoComprar] = precos[codigoProdutoComprar];
					codigoCarrinho[codigoProdutoComprar] = codigoProdutoComprar;
					subtotal += precos[codigoProdutoComprar];
					totalItensCarrinho++;
					}else 
					{
						System.out.printf("\nEstá quantidade não está disponível! Só há %d itens deste produto ",quantidade[codigoProdutoComprar] );
					}
				
			
			}
				while(contador != 'S' && contador != 'N' ) 
				{
					System.out.println("\nDVocê deseja continuar S-sim ou N-nao");
					contador = leia.next().toUpperCase().charAt(0);
				}
				break;

		}
		case 2: {
			//Remover produto
			if(totalItensCarrinho > 0) 
			{
			System.out.printf("Cliente %s digite o código do produto que deseja excluir do carrinho?", nome);
			codigoProdutoComprar = leia.nextInt();
			produtosCarrinho[codigoProdutoComprar] = null;
			quantidade[codigoProdutoComprar] += quantidadeCarrinho[codigoProdutoComprar];
			quantidadeCarrinho[codigoProdutoComprar] = 0;
			
			}else 
			{
				System.out.println("Não há itens deste produto no carrinho!");
			}
			break;
		}
		case 3: {
			
			
			System.out.printf("Cliente %s digite o código do produto que deseja alterar do carrinho?", nome);
			codigoProdutoComprar = leia.nextInt();
			if(quantidadeCarrinho[codigoProdutoComprar] > 0) 
			{
			System.out.printf("O produto que você selecionou é %s, por favor informe a nova quantidade: ", produtos[codigoProdutoComprar]);
			quantidadeProdutoCarrinho = leia.nextInt();
			diferencaAlteracao = quantidade[codigoProdutoComprar] - quantidadeProdutoCarrinho;
			quantidadeCarrinho[codigoProdutoComprar] = quantidadeProdutoCarrinho;
			quantidade[codigoProdutoComprar] += diferencaAlteracao;
			
			}else 
			{
				System.out.println("Seu carrinho não contém este produto!");
			}
			break;
		}
		case 4: {
			System.out.println("----------------------------------------------------PRODUTOS-MEU-CARRINHO----------------------------------------------------\n");	
			System.out.println("CÓDIGO ---- QTDE---- PRODUTO ---- PREÇO ----\n");
			for(int x = 0; x < produtosCarrinho.length; x++ ) 
			{
				
				System.out.println(x + "        " + quantidadeCarrinho[x] + "        " +produtosCarrinho[x] + "        " + valorCarrinho[x] );
			}
					
					
					break;
				}
		case 5: {
			
			contador = 'N';
					
					
					break;
				}
		default:
			throw new IllegalArgumentException("Opção inválida!" );
			
		}
	
	
	}
	
	
	
	
}

}
