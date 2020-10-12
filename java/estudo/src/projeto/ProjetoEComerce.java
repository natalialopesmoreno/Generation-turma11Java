package projeto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProjetoEComerce {

	public static void main(String[] args) {
		/*
		 * 10 itens por produto
		 * vetor produtos, preços, quantidades
		 * NOME LOJA AfroStyle
			Roupas
			10 itens
			Cada item tenha 10 PEÇAS NO MINIMO
			
			AS1 - Camisa AFRO - 10
			AS2- Calça balão - 10
			Calça Social
			Camiseta
			Vestido Afro
			 Blook Afro
			 
			PEGA O NOME E SEXO DO USUARIO-----
			CADASTRAREM OS PRODUTOS NO PROGRAMA E SEUS RESPECTIVOS VALORES E QTDES---
			EXIBI UMA LISTA DE PRODUTO – PREÇO- QTDE
			
			

			
			
			NOVO CLIENTE
			PROGRAMA
			LISTAS EM VETORES: PRODUTOS, QTDE, PRECOS
			TECH LEADER
			NOME DA LOJA / TIPO
			AS ROUPAS
			QUEM FAZ O QUE
			ENTRADAS
			DADOS CADASTRADOS
			CARRINHO DE COMPRA
			MONTAR AS LISTAS
			CALCULOS
			MONTAGEM DE RELATORIO – NF

		 */
		
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
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
		int subtotal=0;
		int codigoProdutoComprar =0;
		int totalItensCarrinho =0;
		int quantidadeProdutoCarrinho =0;
		int contador = 'S';
		int opcaoPagamento = 0;
		int quantidadeParcelas =0;
		int valorParcela= 0; 
		double valorParcelado =0.0;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		nome = leia.next();
		System.out.print("Digite o seu sexo:F- feminino, M- masculino, O - outros ");
		sexo = leia.next().toUpperCase().charAt(0);

		
		
			
		
//		//			COMPRA UM PRODUTO – QTDE
//		MONTA UM SUBTOTAL - OK
//		CONTINUA S/N - OK
//		COMPRA ALGO NOVO OU ALTERAR O QUE JÁ COMPROU 
//		O VALOR DE ESTOQUE TEM QUE SER ATUALIZADO
//		A COMPRA TEM QUE SER COMPATIVEL COM ESTOQUE
		
		
		while(contador =='S' ) 
		{
			System.out.println("----------------------------------------------------PRODUTOS-LOJAS-ABRACADABRA----------------------------------------------------\n");
		System.out.println("CÓDIGO ---- QTDE---- PRODUTO ---- PREÇO ----\n");
			
			for(int x = 0; x < produtos.length; x++ ) 
			{
				
				System.out.println(x + "        " + quantidade[x] + "        " +produtos[x] + "        " + precos[x] );
			}
			
		System.out.println("Você deseja:\n 1- Inserir produtos ao carrinho \n 2-Remover algum produto \n 3- Alterar a quantidade do produto \n 4- Visualizar carrinho \n 5-Sair");
			int funcao = leia.nextInt();
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
						subtotal += precos[codigoProdutoComprar]*quantidadeProdutoCarrinho;
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
					if(quantidadeProdutoCarrinho < quantidadeCarrinho[codigoProdutoComprar] ) 
					{
						int diferencaAlteracao = quantidade[codigoProdutoComprar] - quantidadeCarrinho[codigoProdutoComprar];
						quantidadeCarrinho[codigoProdutoComprar] = quantidadeProdutoCarrinho;
						quantidade[codigoProdutoComprar] += diferencaAlteracao;
					}
					else if(quantidadeProdutoCarrinho > quantidadeCarrinho[codigoProdutoComprar]) 
					{
						if(quantidadeProdutoCarrinho <= quantidade[codigoProdutoComprar])
						{
						int diferencaAlteracao = quantidadeProdutoCarrinho - quantidadeCarrinho[codigoProdutoComprar] ;
						quantidadeCarrinho[codigoProdutoComprar] = quantidadeProdutoCarrinho;
						quantidade[codigoProdutoComprar] -= diferencaAlteracao;
						}else 
						{
							System.out.println("Essa quantidade não está disponível no estoque\n");
						}
					}
				
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
					if(quantidadeCarrinho[x]>0) 
					{
						System.out.println(x + "        " + quantidadeCarrinho[x] + "        " +produtosCarrinho[x] + "        " + valorCarrinho[x] );
					}
				}
						
						
						break;
					}
			case 5: {
				
				contador = 'N';
						
						
						break;
					}
			default:
				System.out.println("Opção inválida!" );
				
			}
		
		
		}
		
		
		
		//PERGUNTA A OPÇÃO DE PAGAMENTO/ /		OPÇÕES DE PAGAMENTO
//		A VISTA 10% DESCONTO
//		CREDITO 1 A 3 VEZES SEM JUROS E MOSTRE AS PARCELAS
		
		System.out.println("As opções de pagamentos são: \n 1-A VISTA 10% DESCONTO ; \n 2- CREDITO 1 A 3 VEZES SEM JUROS");
		opcaoPagamento= leia.nextInt();
		switch (opcaoPagamento) {
		case 1: {
			//A VISTA 10% DESCONTO
			subtotal= (int) (subtotal*0.9);
			System.out.printf(" O valor de pagamento à vista ficará: %d reais",subtotal);
			break;
		}
		case 2: {
			//CREDITO 1 A 3 VEZES SEM JUROS E MOSTRE AS PARCELAS
			System.out.println("Em quantas vezes você deseja parcelar? 1 - 3");
			quantidadeParcelas = leia.nextInt();
			valorParcela = subtotal/quantidadeParcelas;
			System.out.printf("O seu pagamento será dividido em %d parcelas no valor de R$%d reais\n", quantidadeParcelas, valorParcela);


				
				if(quantidadeParcelas == 1) {
					System.out.println("Valor total a ser pago: "+subtotal);
				}
				else if (quantidadeParcelas == 2) {
					valorParcelado = subtotal / quantidadeParcelas;
					LocalDate parcela1 = hoje.plusDays(30);
					LocalDate parcela2 = hoje.plusDays(60);
					System.out.println("1ª Parcela de "+valorParcelado+" para "+formatador.format(parcela1));
					System.out.println("2ª Parcela de "+valorParcelado+" para "+formatador.format(parcela2));
				}
				else if (quantidadeParcelas == 3) {
					valorParcelado = subtotal / quantidadeParcelas;
					LocalDate parcela1 = hoje.plusDays(30);
					LocalDate parcela2 = hoje.plusDays(60);
					LocalDate parcela3 = hoje.plusDays(90);
					System.out.println("1ª Parcela de "+valorParcelado+" para "+formatador.format(parcela1));
					System.out.println("2ª Parcela de "+valorParcelado+" para "+formatador.format(parcela2));
					System.out.println("3ª Parcela de "+valorParcelado+" para "+formatador.format(parcela3));
					break;
			
					}
		}
		default:
			System.out.println("Opção Inválida!");
		}
		
		
//		//NOTA FISCALNOTA FISCAL
//		OS PRODUTOS, VALOR UNITARIO, VALOR TOTAL, ICMS 9% GERAL
//		OPÇÕES DE PAGAMENTO
//		A VISTA 10% DESCONTO
//		CREDITO 1 A 3 VEZES SEM JUROS E MOSTRE AS PARCELAS
		
		System.out.printf("Ola cliente %s  ", nome);
		System.out.println("\\n--------------------------------NOTA FISCAL--------------------------------\n");

		System.out.println("--------------------------------PAGAMENTO--------------------------------");
		System.out.printf("O seu pagamento será dividido em %d parcelas no valor de R$%d reais\n", quantidadeParcelas, valorParcela);
		for(int x =0; x< quantidadeParcelas; x++) 
		{
			if(opcaoPagamento ==2)
			{
			System.out.printf("\nA parcela %d no valor de R$ %d será no dia %d /%d / %d  ",x,valorParcela, dia, (mes+x), ano);
			}else 
			{
				System.out.printf(" O valor de pagamento à vista ficará: %d reais",subtotal);

			}
		}
		System.out.println("\n--------------------------------VALOR TOTAL--------------------------------\n");
		System.out.printf("\nR$ %d \n", subtotal);
		double imposto = subtotal*0.09;
		System.out.printf("\nO ICMS DA COMPRA FOI NO VALOR DE:R$ %.2f ",imposto);
		
	}

}
