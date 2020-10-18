package projeto.Ecommerce.Classes;

import java.time.LocalDate;
import java.util.Scanner;

public class NotaFiscal {

	// ARRUMAR NOTA FISCAL
	Pagamento pagamento;
	Cliente cliente;
	Carrinho carrinho;

	public NotaFiscal(Pagamento pagamento, Cliente cliente, Carrinho carrinho) 
	{
		this.pagamento = pagamento;
		this.cliente = cliente;
		this.carrinho = carrinho;
	}

	public void ImprimirNota(Scanner leia) {
		
		if(carrinho.getSubtotal() > 0)
		{

		System.out.println("══════════════════════════ NOTA FISCAL ═════════════════════════");
		System.out.println();
		System.out.println();
		System.out.println(
				"\nIdentificação do emitente: Lojas Abracadabra - Rua. Conego\nEugenio Leite, 623. 3º andar. Pinheiros - São Paulo - SP  ");
		System.out.println(
				"consulta de autenticidade no portal nacional da NF-e.\n www.nfe.fazenda.gov.br/portal ou no site da Sefaz Autorizada ");
		System.out.println("\nNF-e: 000.000.394 ");
		System.out.println("Nome/Razão social: " + cliente.getNome());
		System.out.println("Sexo: " + cliente.getSexo());

		System.out.println("\nCÁLCULO DO IMPOSTO");

		System.out.println("Base de cálculo do ICMS: " + carrinho.getSubtotal() + " valor do ICMS: "
				+ carrinho.getSubtotal() * 0.09 + " \nValor do frete: 0");
		System.out.println("\nDESCRIÇÃO DOS PRODUTOS: ");
		System.out.println();
		carrinho.visualizarCarrinho();

		System.out.println("TOTAL: R$ " + carrinho.getSubtotal() + "\n");
		System.out.print("FORMA DE PAGAMENTO\n");
		
		if (pagamento.getOpcPgto() == 1) {
			
			pagamento.pagamentoAVista();

		} else if (pagamento.getOpcPgto() == 2) {

			while (pagamento.getParcela() != 1 && pagamento.getParcela() != 2
					&& this.pagamento.getParcela() != 3) 
			{
				System.out.println("\n");
				System.out.println("Gostaria de parcelar em quantas vezes?");
				System.out.print("[1] 1x sem juros \n[2] 2x sem juros \n[3] 3x sem juros \nOpção Escolhida: ");
				this.pagamento.setParcela(leia.nextByte());
				System.out.println();
			}
			
			pagamento.pagamentoParcelado(pagamento.getParcela());

		}
	}else 
	{
		System.out.println("Não produtos no seu carrinho!");
	}
	}

}
