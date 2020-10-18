package projeto.Ecommerce.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<Produto> produtosEstoque = new ArrayList<Produto>();

		Produto produto1 = new Produto("Fantasia Arlequina", 200.50, 10);
		Produto produto2 = new Produto("Fantasia Pantera Negra", 120.00, 10);
		Produto produto3 = new Produto("Fantasia Super Man", 179.99, 10);
		Produto produto4 = new Produto("Fantasia Homem Aranha", 225.50, 10);
		Produto produto5 = new Produto("Fantasia Wolverine", 209.99, 10);
		Produto produto6 = new Produto("Fantasia Pikachu", 190.00, 10);
		Produto produto7 = new Produto("Fantasia Caveira", 70.99, 10);
		Produto produto8 = new Produto("Fantasia Branca de Neve", 150.00, 10);
		Produto produto9 = new Produto("Fantasia Policial", 75.89, 10);
		Produto produto10 = new Produto("Fantasia Bombeiro", 85.00, 10);
		
		produtosEstoque.add(produto1);
		produtosEstoque.add(produto2);
		produtosEstoque.add(produto3);
		produtosEstoque.add(produto4);
		produtosEstoque.add(produto5);
		produtosEstoque.add(produto6);
		produtosEstoque.add(produto7);
		produtosEstoque.add(produto8);
		produtosEstoque.add(produto9);
		produtosEstoque.add(produto10);

		
		Cliente cliente = new Cliente();
		

		char contador = 'O';
		char proximoCliente = 'S';
		byte funcao= 0;
		
		
		byte parcelaCartao =0;
		double valorComDesconto = 0.0;
		

		Scanner leia = new Scanner(System.in);
		
		// LOGIN

		while (proximoCliente == 'S') {


			System.out.println("═══════════════════════ BEM VIDES À ABRACADABRA FANTASIAS ══════════════════════\n");
			System.out.print("Por favor, digite seu nome: ");
			cliente.setNome(leia.next());

			// VERIFICAR A RESPOSTA DE SEXO
			while (cliente.getSexo() != 'F' && cliente.getSexo() != 'M' && cliente.getSexo() != 'O') 
			{
				System.out.println("Gênero: [F] - Feminino\n\t[M] - Masculino\n\t[O] - Outros");
				System.out.print("Por favor, digite seu gênero: ");
				char sexo = leia.next().toUpperCase().charAt(0);
				cliente.setSexo(sexo);
				if (cliente.getSexo() != 'F' && cliente.getSexo() != 'M' && cliente.getSexo() != 'O') {
					System.out.println("Resposta inválida!");
				}
				System.out.println();
			}

			while (contador != 'S' && contador != 'N') 
			{
				System.out.print(
						"Bem vindes " + cliente.getNome() + ", deseja ver nosso catalogo de fantasias [S/N]: \n");
				contador = leia.next().toUpperCase().charAt(0);
			}

			Carrinho carrinho = new Carrinho(produtosEstoque, 0);
			//CARRINHO
			while (contador == 'S') {
							System.out.println(
									"══════════════════════════ PRODUTOS LOJAS ABRACADABRA ═════════════════════════\n");
							System.out.print("CÓD ═══════════ QTDE ════════════ PRODUTO ═══════════════════════════════ PREÇO\n");
							
							
							for (Produto produto: produtosEstoque) 
							{
								System.out.println(
										produtosEstoque.indexOf(produto) + "        ║     \t " + produto.getQtd() + "\t║     " + produto.getNome() + "          \t\t║  " + produto.getPreco());
							}
							
							
							System.out.println("═══════════════════════════════════════════════════════════════════════════════");
							System.out.println();
							
	
							System.out.print(
									"Escolha uma das opções:\n\n[1]- Inserir produtos ao carrinho \n[2]- Remover algum produto \n[3]- Alterar a quantidade do produto \n[4]- Visualizar carrinho \n[5]- Efetuar o Pagamento \n\nDigite a opção escolhida: ");
							funcao = leia.nextByte();
							
							
							byte codigoProdutoComprar;
							byte quantidadeProdutoCarrinho;
							
							
							switch (funcao) 
							{
							case 1: 
							{
								// INSERIR O PRODUTO
								System.out.printf("Prezades %s, digite o código do produto que deseja inserir no seu carrinho:", cliente.getNome());
								codigoProdutoComprar = leia.nextByte();
								
								System.out.printf("O produto que você selecionou é a %s, por favor informe a quantidade: ",
								carrinho.buscarProdutoCatalogo(codigoProdutoComprar).getNome());
								quantidadeProdutoCarrinho = leia.nextByte();
								
								
								boolean inserir = false;
								int controll = 0;
								
								while(!inserir ^ controll>3) 
								{
									controll ++;
									 inserir = carrinho.inserirProduto(codigoProdutoComprar, quantidadeProdutoCarrinho);
									 if(!inserir) 
									 {
										System.out.print("Quantidade de produtos inválida, por favor digite um número de quantidade válido: ");
										quantidadeProdutoCarrinho = leia.nextByte();
									 }
								}
								
								//CONDIÇÃO DE CONTINUA A VER PRODUTOS OU ENCERRA E EFETUA PAGAMENTO 
								contador = menu(leia);
								break;
							}
							
						case 2: 
						{
							// REMOVER O PRODUTO
							if (carrinho.getTotalItens() > 0) 
							{
								carrinho.visualizarCarrinho();
								System.out.printf("Prezades %s, digite o código do produto que deseja excluir do seu carrinho:", cliente.getNome());
								codigoProdutoComprar = leia.nextByte();
								
								//CASO DIGITE VALOR INVALIDO
								boolean removeu = false;
								int controll = 0;
								while (!removeu ^ controll>3 ) 
								{
									removeu = carrinho.removerProduto(codigoProdutoComprar);
									if(!removeu ) 
									{
									System.out.print("Código de produto inválido você tem  por favor digite um código válido: ");
									codigoProdutoComprar = leia.nextByte();
									}

								}
								
								contador = menu(leia);
			
							} else 
							{
								System.out.println("Não há itens ainda no seu carrinho para serem removidos!\n");
							}
							break;
						}
						case 3: 
						{ //ALTERAR PRODUTO
							if (carrinho.getTotalItens() > 0) 
							{
								System.out.printf("\nPrezades %s, digite o código do produto que deseja alterar do seu carrinho:", cliente.getNome());
								codigoProdutoComprar = leia.nextByte();
								System.out.printf("\nO produto que você selecionou é %s, por favor informe a nova quantidade: ",
								carrinho.buscarProdutoCarrinho(codigoProdutoComprar).getNome());
								quantidadeProdutoCarrinho = leia.nextByte();
							
								boolean alterou = false;
								int controll = 0;
								while (!alterou ^ controll >3) 
								{
									alterou = carrinho.alterarProduto(codigoProdutoComprar, quantidadeProdutoCarrinho);
									if(!alterou)
									{
									System.out.print("\nCódigo de produto inválido , por favor digite um código válido: ");
									codigoProdutoComprar = leia.nextByte();
									System.out.printf("\nO produto que você selecionou é %s, por favor informe a nova quantidade: ",
									carrinho.buscarProdutoCarrinho(codigoProdutoComprar).getNome());
									}
								}
								

								
							}

							else 
							{
								System.out.println("\nSeu carrinho não contém este produto!\n");// O PRODUTO QUE O USUÁRIO QUER ALTERAR NÃO EXISTE NO CARRINHO ELE PRECISA INSERIR PARA PODER ALTERAR
								
							}
							//DESEJA CONTINUAR
							contador = menu(leia);
							break;
						}
						
						
						case 4: 
						{
							//VISUALIZAÇÃO DO CARRINHO
							carrinho.visualizarCarrinho();
							//CONDIÃ‡ÃƒO DE CONTINUAR A VER PRODUTOS OU ENCERRA E EFETUA PAGAMENTO
							
							contador = menu(leia);
							break;
						}
						
						
						case 5: 
						{
							//FINALIZAR A COMPRA
							if(carrinho.getSubtotal() == 0) 
							{
								System.out.println("Seu carrinho está vazio! Insira algum produto para finalizar sua compra");
								
								contador = menu(leia);
								
								break;

							}
							
				
							contador = 'N';
							
							System.out.println("Obrigado por escolher nossa loja! Você será direcionado para página de pagamento!");
			
							break;
						}
						default:
							System.out.println("Opção inválida!");
							System.out.println();
							
							contador = menu(leia);
							

			
					}//fecha switch 
							
							// PULA LINHA
							pulaLinha();
							
							
						
			}// fecha while
			
			
			
			//PAGAMENTO
			
			Pagamento pgt = new Pagamento(cliente, carrinho);
			
			if(carrinho.getSubtotal() > 0) 
			{
				System.out.println(
						"══════════════════════════ PAGAMENTO ═════════════════════════\n");
				System.out.println("O valor total da sua compra ficou em: " + carrinho.getSubtotal() + " reais.");
				System.out.println();
				
				
				while(pgt.getOpcPgto() != 1 && pgt.getOpcPgto() !=2 ) 
				{
				System.out.println("Como gostaria de efetuar o pagamento? ");
				System.out.print(
						"[1] À vista com 10% de desconto \n[2] No cartão de crédito em até 3x sem juros \nOpção Escolhida: ");
				pgt.setOpcPgto(leia.nextByte());
				System.out.println();
				}
				
				pulaLinha();
				
				if(pgt.getOpcPgto() ==1) 
				{
					pgt.pagamentoAVista();
				}else if(pgt.getOpcPgto() ==2)
				{
					
					while(pgt.getParcela() != 1 && pgt.getParcela() !=2 && pgt.getParcela() !=3) 
					{
					System.out.println("\n");
					System.out.println("Gostaria de parcelar em quantas vezes?");
					System.out.print("[1] 1x sem juros \n[2] 2x sem juros \n[3] 3x sem juros \nOpção Escolhida: ");
					pgt.setParcela(leia.nextByte());
					System.out.println();
					}
					
					valorComDesconto = pgt.pagamentoParcelado(pgt.getParcela());
					
					
					
				}
			}
			
			
			pulaLinha();
				
			
			//NOTA FISCAL
			
			NotaFiscal nf = new NotaFiscal(pgt, cliente, carrinho);
			
			nf.ImprimirNota(leia);
			
			
			System.out.println("\nObrigado por acessar nosso sistema, volte sempre que precisar!\n");
			
			System.out.print("Deseja logar novamente? S- sim N- não\n");
			contador = leia.next().toUpperCase().charAt(0);
			proximoCliente = contador;
				

			pulaLinha();
			
			
		}//TERMINA O WHILE PRÓX-CLIENTE
		
		
		
	}//TERMINA O MAIN
	
	
	
	
	
	
	
	private static void pulaLinha() 
	{
		for (int i = 0 ; i < 60 ; i++) 
		{
			System.out.println();
		}
		
	}




	public static char menu(Scanner leia) 
	{
		char opc;
		System.out.print("\nEscolha uma das opções:\n[S] para continuar a ver produtos e menu\n[N] para finalizar o programa\n\nDigite a opção escolhida: ");
		opc = leia.next().toUpperCase().charAt(0);
		System.out.println();
		
		while(opc != 'S' && opc != 'N') 
		{
		System.out.println("Resposta inválida!");
		System.out.print("Escolha uma das opções:\n[S] para continuar a ver produtos e menu\n[N] para finalizar o programa\n\nDigite a opção escolhida: ");
		opc = leia.next().toUpperCase().charAt(0);
		System.out.println();
		
			
		}
		
		return opc;
		
	}
	
	
	
	
	
	
}//TERMINA A CLASSE
