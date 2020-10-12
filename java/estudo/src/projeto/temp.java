package projeto;

import java.time.LocalDate;

import java.time.LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import java.time.LocalDate;
		import java.time.format.DateTimeFormatter;
		import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
	


				LocalDate hoje = LocalDate.now();
				DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
				String nome;
				char sexo;
				String produtos[] = {"Fantasia Mágico", "Fantasia Mulher Maravilha", "Fantasia Super Man", "Fantasia Homem Aranha", "Fantasia Wolverine", "Fantasia Pikachu", "Fantasia Caveira", "Fantasia Branca de Neve", "Fantasia Policial", "Fantasia Bombeiro"};
				int precos [] = {80, 200, 180, 220, 210, 190, 70, 150, 75, 85};
				int quantidade [] = {10,10,10,10,10,10,10,10,10,10};
				
				String produtosCarrinho[] = new String[produtos.length];
				int quantidadeCarrinho[] = new int[produtos.length];
				int valorCarrinho [] = new int[produtos.length];
				int codigoCarrinho [] = new int[produtos.length];
				int subtotal =0;
				int codigoProdutoComprar =0;
				int totalItensCarrinho =0;
				int quantidadeProdutoCarrinho =0;
				char contador = 'S';
				int funcao = 0;
				int diferencaAlteracao = 0;
				int opcPgto =0;//opção de pagamento
				int desconto =0; // Desconto do pagamento a vista
				int valorComDesconto =0; // valor final caso pagamento a vista
				int parcelaCartao =0; // opção de parcelamento caso escolha pagar no cartão
				int qntParcela =0; // em quantas vezes no cartao a cliente quer fazer
				int valorParcelado =0; // o subtotal vai ser dividido pela qntParcela e vai dar isso aqui
				
				
				
				Scanner leia = new Scanner(System.in);
				
				System.out.print("Digite o seu nome: ");
				nome = leia.next();
				System.out.print("Digite o seu sexo:F- feminino, M- masculino, O - outros ");
				sexo = leia.next().toUpperCase().charAt(0);
				
				while(contador =='S' )
				{
					System.out.println("----------------------------------------------------PRODUTOS-LOJAS-ABRACADABRA----------------------------------------------------\n");
				System.out.println("CÓD ---- QTDE --------- PRODUTO ---------------------- PREÇO ------\n");
					
					for(int x = 0; x < produtos.length; x++ )
					{
						
						System.out.println(x + "    | \t " + quantidade[x] + "\t|    "+produtos[x] +"           \t|"+precos[x] );
					}
				System.out.println("-------------------------------------------------------------------");
				System.out.print("Você deseja:\n 1- Inserir produtos ao carrinho \n 2- Remover algum produto \n 3- Alterar a quantidade do produto \n 4- Visualizar carrinho \n 5- Efetuar o Pagamento \n Opção Escolhida: ");
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
								subtotal += precos[codigoProdutoComprar]*quantidadeProdutoCarrinho; //aqui
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
							if(quantidadeProdutoCarrinho < quantidade[codigoProdutoComprar] ) 
							{
								diferencaAlteracao = quantidade[codigoProdutoComprar] - quantidadeProdutoCarrinho;
								quantidadeCarrinho[codigoProdutoComprar] = quantidadeProdutoCarrinho;
								quantidade[codigoProdutoComprar] += diferencaAlteracao;
							}else if(quantidadeProdutoCarrinho > quantidade[codigoProdutoComprar]) 
							{
								diferencaAlteracao = quantidadeProdutoCarrinho - quantidade[codigoProdutoComprar] ;
								quantidadeCarrinho[codigoProdutoComprar] = quantidadeProdutoCarrinho;
								quantidade[codigoProdutoComprar] -= diferencaAlteracao;

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
				}//fecha while
				// pagamento da compra efetuada
				System.out.println("----------------------------------------------------PRODUTOS-MEU-CARRINHO----------------------------------------------------\n");
				System.out.println("O valor total da sua compra ficou em: "+subtotal+" reais.");
				System.out.println();
				System.out.println("Como gostaria de efetuar o pagamento? ");
				System.out.print("[1] À vista com 10% de desconto \n[2] No cartão de crédito em até 3x sem juros \nOpção Escolhida: ");
				opcPgto = leia.nextInt();
				System.out.println();
					if(opcPgto == 1) {
						desconto = (subtotal * 10) / 100;
						valorComDesconto = subtotal - desconto;
						System.out.println("Valor total a ser pago: "+valorComDesconto);
					}
					else if(opcPgto == 2) {
						System.out.println("Gostaria de parcelar em quantas vezes?");
						System.out.print("[1] 1x sem juros \n[2] 2x sem juros \n[3] 3x sem juros \nOpção Escolhida: ");
						parcelaCartao = leia.nextInt();
						System.out.println();
						if(parcelaCartao == 1) {
							System.out.println("Valor total a ser pago: "+subtotal);
						}
						else if (parcelaCartao == 2) {
							qntParcela = 2;
							valorParcelado = subtotal / qntParcela;
							LocalDate parcela1 = hoje.plusDays(30);
							LocalDate parcela2 = hoje.plusDays(60);
							System.out.println("1ª Parcela de "+valorParcelado+" para "+formatador.format(parcela1));
							System.out.println("2ª Parcela de "+valorParcelado+" para "+formatador.format(parcela2));
						}
						else if (parcelaCartao == 3) {
							qntParcela = 3;
							valorParcelado = subtotal / qntParcela;
							LocalDate parcela1 = hoje.plusDays(30);
							LocalDate parcela2 = hoje.plusDays(60);
							LocalDate parcela3 = hoje.plusDays(90);
							System.out.println("1ª Parcela de "+valorParcelado+" para "+formatador.format(parcela1));
							System.out.println("2ª Parcela de "+valorParcelado+" para "+formatador.format(parcela2));
							System.out.println("3ª Parcela de "+valorParcelado+" para "+formatador.format(parcela3));
						}
					}
				leia.close();
		

	}

}
