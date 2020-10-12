package projeto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProjetoCompleto 
{
		public static void main(String[] args) 
		{

			LocalDate hoje = LocalDate.now();
			DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			String nome;
			char sexo;
			String produtos[] = { "Fantasia Alerquina" ,"Fantasia Pantera Negra", "Fantasia Super Man",
					"Fantasia Homem Aranha", "Fantasia Wolverine", "Fantasia Pikachu", "Fantasia Caveira",
					"Fantasia Branca de Neve", "Fantasia Policial", "Fantasia Bombeiro" };
			int precos[] = { 200 ,120, 180, 220, 210, 190, 70, 150, 75, 85 };
			int quantidade[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

			String produtosCarrinho[] = new String[produtos.length];
			int quantidadeCarrinho[] = new int[produtos.length];
			int valorCarrinho[] = new int[produtos.length];
			int codigoCarrinho[] = new int[produtos.length];
			int subtotal = 0;
			int codigoProdutoComprar = 0;
			int totalItensCarrinho = 0;
			int quantidadeProdutoCarrinho = 0;
			char contador = 'S';
			int funcao = 0;
			int diferencaAlteracao = 0;
			int opcPgto = 0;// opÃƒÂ§ÃƒÂ£o de pagamento
			int desconto = 0; // Desconto do pagamento a vista
			int valorComDesconto = 0; // valor final caso pagamento a vista
			int parcelaCartao = 0; // opÃƒÂ§ÃƒÂ£o de parcelamento caso escolha pagar no cartÃƒÂ£o
			int qntParcela = 0; // em quantas vezes no cartao a cliente quer fazer
			int valorParcelado = 0; // o subtotal vai ser dividido pela qntParcela e vai dar isso aqui
			char perguntaInicial;
			int contadorTentativas = 3;

			Scanner leia = new Scanner(System.in);
			
			System.out.println("═══════════════════════ BEM VIDES À ABRACADABRA FANTASIAS ══════════════════════\n");
			System.out.print("Por favor, digite seu nome: ");
			System.out.print("Por favor, digite seu nome: ");
			nome = leia.next();
			System.out.println("Gênero: [F] - Feminino\n\t[M] - Masculino\n\t[O] - Outros");
			System.out.print("Por favor, digite seu gênero: ");
			sexo = leia.next().toUpperCase().charAt(0);
			System.out.println();
			
			System.out.print("Bem vindes " + nome + ", deseja ver nosso catalogo de fantasias [S/N]: \n");
			contador = leia.next().toUpperCase().charAt(0);
			//perguntaInicial = leia.next().toUpperCase().charAt(0);
			
					//NÃƒO PRECISA DESSE IF POIS JÃ� TEM O WHILE VALIDANDO A CONDIÃ‡ÃƒO DE ENTRADA
					//if (perguntaInicial == 'S') {
						while (contador == 'S') {
							System.out.println(
									"══════════════════════════ PRODUTOS LOJAS ABRACADABRA ═════════════════════════\n");
							System.out.print("CÓD ═══════════ QTDE ════════════ PRODUTO ═══════════════════════════════ PREÇO\n");
							
							
							for (int x = 0; x < produtos.length; x++) {
								System.out.println(
										x + "        ║     \t " + quantidade[x] + "\t║     " + produtos[x] + "          \t\t║  " + precos[x]);
							}
							
							
							System.out.println("═══════════════════════════════════════════════════════════════════════════════");
							System.out.println();
							System.out.print(
									"Escolha uma das opções:\n\n[1]- Inserir produtos ao carrinho \n[2]- Remover algum produto \n[3]- Alterar a quantidade do produto \n[4]- Visualizar carrinho \n[5]- Efetuar o Pagamento \n\nDigite a opção escolhida: ");
							funcao = leia.nextInt();
							
							switch (funcao) {
							case 1: {
								// Inserir produto
								System.out.printf("Prezades %s, digite o código do produto que deseja inserir no seu carrinho:", nome);								codigoProdutoComprar = leia.nextInt();
								
								System.out.printf("O produto que você selecionou é a %s, por favor informe a quantidade: ",
										produtos[codigoProdutoComprar]);
								quantidadeProdutoCarrinho = leia.nextInt();
								
			
								if (quantidadeProdutoCarrinho <= quantidade[codigoProdutoComprar] & quantidadeProdutoCarrinho > 0) {
									quantidade[codigoProdutoComprar] -= quantidadeProdutoCarrinho;
									produtosCarrinho[codigoProdutoComprar] = produtos[codigoProdutoComprar];
									quantidadeCarrinho[codigoProdutoComprar] = quantidadeProdutoCarrinho;
									valorCarrinho[codigoProdutoComprar] = precos[codigoProdutoComprar];
									codigoCarrinho[codigoProdutoComprar] = codigoProdutoComprar;
									subtotal += precos[codigoProdutoComprar] * quantidadeProdutoCarrinho; // aqui
									totalItensCarrinho++;
								} else {
									System.out.printf("\nEsta quantidade não está disponível! Só há %d itens deste produto \n",
											quantidade[codigoProdutoComprar]);
									
									//CASO NÃƒO TENHA A QUANTIDADE ESCOLHIDA ELE VOLTA A PEDIR A QUANTIDADE POR CERTO NÃšMERO DE TENTATIVAS
									while (quantidadeProdutoCarrinho > quantidade[codigoProdutoComprar] | quantidadeProdutoCarrinho < 0) {
										System.out.print("Quantidade de produtos inválida, você tem " + contadorTentativas + " tentativas, por favor digite um número de quantidade válido: ");
										quantidadeProdutoCarrinho = leia.nextInt();
										contadorTentativas--;
										if (contadorTentativas == 0) {
											System.out.println("\nSuas tentativas acabaram, logue-se novamente!");
											System.exit(0);
										} 
									}
								}
								
								//CONDIÃ‡ÃƒO DE CONTINUA A VER PRODUTOS OU ENCERRA E EFETUA PAGAMENTO 
								System.out.println();
								System.out.print("Escolha uma das opções:\n[S] para continuar a ver produtos e menu\n[N] para efetuar o pagamento\n\nDigite a opção escolhida: ");
								contador = leia.next().toUpperCase().charAt(0);
								System.out.println();
								
								/*if (contador == 'N') {
									break;
								}NÃO PRECISA DESSE IF , PORQUE A CONDIÇÃO DO WHILE PARA RODAR DE NOVO É O CONTADOR SER IGUAL A s
								*/
								
								
								break;
							}
							/*NAO ESTAVA TENDO FUNÃ‡ÃƒO NO CODIGO
							 * while (contador != 'S' && contador != 'N') {
								System.out.println("\nDVocÃª deseja continuar S-sim ou N-nao");
								contador = leia.next().toUpperCase().charAt(0);
							}
							break;
						}*/
						case 2: {
							// Remover produto
							if (totalItensCarrinho > 0) {
								System.out.printf("Prezades %s, digite o código do produto que deseja excluir do seu carrinho:", nome);
								codigoProdutoComprar = leia.nextInt();
								
								//CASO DIGITE VALOR INVALIDO
								while (codigoProdutoComprar < 0 || codigoProdutoComprar > 9) {
									System.out.print("Código de produto inválido você tem " + contadorTentativas + " tentativas, por favor digite um código válido: ");
									codigoProdutoComprar = leia.nextInt();
									contadorTentativas--;
									if (contadorTentativas == 0) {
										System.out.println("\nSuas tentativas acabaram, logue-se novamente!");
										contadorTentativas = 3;
										System.exit(0);
									} 
								}
								

								
								produtosCarrinho[codigoProdutoComprar] = " ";
								quantidade[codigoProdutoComprar] += quantidadeCarrinho[codigoProdutoComprar];
								subtotal -= (precos[codigoProdutoComprar] * quantidadeCarrinho[codigoProdutoComprar]);
								quantidadeCarrinho[codigoProdutoComprar] = 0; //AQUI É PARA ZERAR A QUANTIDADE DO PRODUTO, O USUÁRIO DECIDIU EXCLUIR TODAS AS UNIDADES DAQUELE PRODUTO
								
								//CONDIÃ‡ÃƒO DE CONTINUAR A VER PRODUTOS OU ENCERRA E EFETUA PAGAMENTO
								System.out.println();
								System.out.print("Escolha uma das opções:\n[S] para continuar a ver produtos e menu\n[N] para efetuar o pagamento\n\nDigite a opção escolhida: ");
								contador = leia.next().toUpperCase().charAt(0);
								System.out.println();
							
			
							} else {
								System.out.println("Não há itens ainda no seu carrinho para serem removidos!\n");
							}
							break;
						}
						case 3: { //ALTERAR PRODUTO
							System.out.printf("\nPrezades %s, digite o código do produto que deseja alterar do seu carrinho:", nome);
							codigoProdutoComprar = leia.nextInt();
							
							//CASO DIGITE VALOR INVALIDO
							while (codigoProdutoComprar < 0 || codigoProdutoComprar > 9) {
								System.out.print("Código de produto inválido você tem " + contadorTentativas + " tentativas, por favor digite um código válido: ");
								codigoProdutoComprar = leia.nextInt();
								contadorTentativas--;
								if (contadorTentativas == 0) {
									System.out.println("\nSuas tentativas acabaram, logue-se novamente!");
									contadorTentativas = 3;
									System.exit(0);
								} 
							}
							
							if (quantidadeCarrinho[codigoProdutoComprar] > 0) {
								System.out.printf("O produto que você selecionou é %s, por favor informe a nova quantidade: ",
										produtos[codigoProdutoComprar]);
								quantidadeProdutoCarrinho = leia.nextInt();
								
								//CASO DIGITE VALOR INVALIDO
								while (quantidadeProdutoCarrinho < 0 || quantidadeProdutoCarrinho > 9) {
									System.out.print("Quantidade de produto inválida você tem " + contadorTentativas + " tentativas, por favor digite uma quantidade válida: ");
									quantidadeProdutoCarrinho = leia.nextInt();
									contadorTentativas--;
									if (contadorTentativas == 0) {
										System.out.println("\nSuas tentativas acabaram, logue-se novamente!");
										contadorTentativas = 3;
										System.exit(0);
									} 
								}
								//SE VAI ALTERAR PARA MENOS
								if (quantidadeProdutoCarrinho < quantidadeCarrinho[codigoProdutoComprar]) {
									diferencaAlteracao = quantidadeCarrinho[codigoProdutoComprar] - quantidadeProdutoCarrinho;
									//subtotal subtrai o que o usuário retirou do que já existia 
									subtotal = subtotal - (diferencaAlteracao * precos[codigoProdutoComprar]);
									quantidadeCarrinho[codigoProdutoComprar] = quantidadeProdutoCarrinho;
									quantidade[codigoProdutoComprar] += diferencaAlteracao;
								//SE VAI ALTERAR PARA MAIS	
								} else if (quantidadeProdutoCarrinho > quantidadeCarrinho[codigoProdutoComprar]) {
									if (quantidadeProdutoCarrinho <= quantidade[codigoProdutoComprar]) {
										diferencaAlteracao = quantidadeProdutoCarrinho - quantidadeCarrinho[codigoProdutoComprar];
										//subtotal soma  o que já existia com o que o usuário colocou a mais
										subtotal = subtotal + (diferencaAlteracao * precos[codigoProdutoComprar]);
										quantidadeCarrinho[codigoProdutoComprar] = quantidadeProdutoCarrinho;
										quantidade[codigoProdutoComprar] -= diferencaAlteracao;
										quantidadeCarrinho[codigoProdutoComprar] = quantidadeProdutoCarrinho;
									} else {
										System.out.println("Essa quantidade não está disponível no estoque\n");
									}
								}
			
							} else {
								System.out.println("\nSeu carrinho não contém este produto!\n");// O PRODUTO QUE O USUÁRIO QUER ALTERAR NÃO EXISTE NO CARRINHO ELE PRECISA INSERIR PARA PODER ALTERAR
								System.out.print("Escolha uma das opções:\n[S] para continuar a ver produtos e menu\n[N] para finalizar o programa\n\nDigite a opção escolhida: ");
								contador = leia.next().toUpperCase().charAt(0);
								System.out.println();
								
							}
							break;
						}
						case 4: {
							System.out.println(
									"══════════════════════════ PRODUTOS LOJAS ABRACADABRA ═════════════════════════\n");
							System.out.print("CÓD ═══════════ QTDE ════════════ PRODUTO ═══════════════════════════════ PREÇO\n");
			
							
							
							for (int x = 0; x < produtosCarrinho.length; x++) {
								if (quantidadeCarrinho[x] > 0) {
									System.out.println(
											x + "        ║     \t " + quantidadeCarrinho[x] + "\t║     " + produtosCarrinho[x] + "          \t\t║  " + valorCarrinho[x]);
								}
							}
							
							
							System.out.println("═══════════════════════════════════════════════════════════════════════════════");
							System.out.println();
							
							//CONDIÃ‡ÃƒO DE CONTINUAR A VER PRODUTOS OU ENCERRA E EFETUA PAGAMENTO
							System.out.println();
							System.out.print("Escolha uma das opções:\n[S] para continuar a ver produtos e menu\n[N] para efetuar o pagamento\n\nDigite a opção escolhida: ");
							contador = leia.next().toUpperCase().charAt(0);
							System.out.println();
							System.out.println();

			
							break;
						}
						case 5: {
			
							contador = 'N';
							
								System.out.println("Obrigado por acessar nosso sistema, volte sempre que precisar!");
								//System.exit(0); NAO ENTENDI ESSA PARTE
							
			
							break;
						}
						default:
							System.out.println("Opção inválida!");
							System.out.println();
							System.out.print("Escolha uma das opções:\n[S] para continuar a ver produtos e menu\n[N] para finalizar o programa\n\nDigite a opção escolhida: ");
							contador = leia.next().toUpperCase().charAt(0);
							System.out.println();
							if (contador == 'N') {
								System.out.println("Obrigado por acessar nosso sistema, volte sempre que precisar!");
								System.exit(0);//NAO ENTENDI ESSE
							}
			
					} // fecha while
						
					}
		// pagamento da compra efetuada
						
		if(subtotal > 0) 
			{
				System.out.println(
						"══════════════════════════ PRODUTOS MEU CARRINHO ═════════════════════════\n");
				System.out.println("O valor total da sua compra ficou em: " + subtotal + " reais.");
				System.out.println();
				System.out.println("Como gostaria de efetuar o pagamento? ");
				System.out.print(
						"[1] À vista com 10% de desconto \n[2] No cartão de crédito em até 3x sem juros \nOpção Escolhida: ");
				opcPgto = leia.nextInt();
				System.out.println();
				if (opcPgto == 1) {
					desconto = (subtotal * 10) / 100;
					valorComDesconto = subtotal - desconto;
					System.out.println("Valor total a ser pago: " + valorComDesconto);
				} else if (opcPgto == 2) {
					System.out.println("Gostaria de parcelar em quantas vezes?");
					System.out.print("[1] 1x sem juros \n[2] 2x sem juros \n[3] 3x sem juros \nOpção Escolhida: ");
					parcelaCartao = leia.nextInt();
					System.out.println();
					if (parcelaCartao == 1) {
						System.out.println("Valor total a ser pago: " + subtotal);
					} else if (parcelaCartao == 2) {
						qntParcela = 2;
						valorParcelado = subtotal / qntParcela;
						LocalDate parcela1 = hoje.plusDays(30);
						LocalDate parcela2 = hoje.plusDays(60);
						System.out.println("1ª Parcela de " + valorParcelado + " para " + formatador.format(parcela1));
						System.out.println("2ª Parcela de " + valorParcelado + " para " + formatador.format(parcela2));
					} else if (parcelaCartao == 3) {
						qntParcela = 3;
						valorParcelado = subtotal / qntParcela;
						LocalDate parcela1 = hoje.plusDays(30);
						LocalDate parcela2 = hoje.plusDays(60);
						LocalDate parcela3 = hoje.plusDays(90);
						System.out.println("1ª Parcela de " + valorParcelado + " para " + formatador.format(parcela1));
						System.out.println("2ª Parcela de " + valorParcelado + " para " + formatador.format(parcela2));
						System.out.println("3ª Parcela de " + valorParcelado + " para " + formatador.format(parcela3));
					}
				}
		
				System.out.println(
						"══════════════════════════ NOTA FISCAL ═════════════════════════");
				System.out.println(
						"Identificação do emitente: Lojas Abracadabra - Rua. Conego\n Eugenio Leite, 623. 3º andar. Pinheiros - São Paulo - SP  ");
				System.out.println(
						"consulta de autenticidade no portal nacional da NF-e.\n www.nfe.fazenda.gov.br/portal ou no site da Sefaz Autorizada ");
				System.out.println("NF-e: 000.000.394 ");
				System.out.println("Nome/Razão social: " + nome);
				System.out.println("Sexo: " + sexo);
		
				System.out.println("\n CÁLCULO DO IMPOSTO");
		
				System.out.println(
						"Base de cálculo do ICMS: " + subtotal + " valor do ICMS: " + subtotal * 0.09 + " \nValor do frete: 0");
				System.out.println("\n DESCRIÇÃO DOS PRODUTOS: ");		
				System.out.println(
						"══════════════════════════ PRODUTOS LOJAS ABRACADABRA ═════════════════════════\n");
				System.out.print("CÓD ═══════════ QTDE ════════════ PRODUTO ═══════════════════════════════ PREÇO\n");
		
				
				
				for (int x = 0; x < produtosCarrinho.length; x++) {			
					if(quantidadeCarrinho[x] != 0 & produtosCarrinho[x] != null & valorCarrinho[x] != 0 ) {
						System.out.println(
								x + "        ║     \t " + quantidadeCarrinho[x] + "\t║     " + produtosCarrinho[x] + "          \t\t║  " + valorCarrinho[x]);
				}
					}
					
					
					
				
				
				System.out.println("TOTAL: R$ " + subtotal + "\n");
				System.out.print("FORMA DE PAGAMENTO\n");
				if (opcPgto == 1) {
					System.out.printf("Valor total a ser pago: R$" + valorComDesconto + " em 1x sem juros.");
				} else if (opcPgto == 2) {
					if (parcelaCartao == 1) {
						System.out.printf("\nValor total R$" + subtotal + ", parcelado em 1x sem juros.\n");
					} else if (parcelaCartao == 2) {
						System.out.printf("\nValor total R$" + subtotal + ", parcelado em 2x sem juros.\n");
						LocalDate parcela1 = hoje.plusDays(30);
						LocalDate parcela2 = hoje.plusDays(60);
						System.out.println("1ª Parcela de " + valorParcelado + " para " + formatador.format(parcela1));
						System.out.println("2ª Parcela de " + valorParcelado + " para " + formatador.format(parcela2));
					} else if (parcelaCartao == 3) {
						System.out.println("\n Valor total parcelado R$" + subtotal + " em 3x sem juros.");
						LocalDate parcela1 = hoje.plusDays(30);
						LocalDate parcela2 = hoje.plusDays(60);
						LocalDate parcela3 = hoje.plusDays(90);
						System.out.println("1ª Parcela de " + valorParcelado + " para " + formatador.format(parcela1));
						System.out.println("2ª Parcela de " + valorParcelado + " para " + formatador.format(parcela2));
						System.out.println("3ª Parcela de " + valorParcelado + " para " + formatador.format(parcela3));
					}
				}

				System.out.println("Obrigado por acessar nosso sistema, volte sempre que precisar!");
			}
		leia.close();
	}
}