package projeto.Ecommerce.Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pagamento 
{

	private Cliente cliente;
	private Carrinho carrinho;
	private static final LocalDate HOJE = LocalDate.now();
	private DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private byte opcPgto;
	private byte parcela;
	
	



	//Construtor
	public Pagamento() 
	{

	}
	
	public Pagamento(Cliente cliente, Carrinho carrinho) 
	{
		this.cliente = cliente;
		this.carrinho = carrinho;
	
	}
	
	//GETTER AND SETTER
	
	public Cliente getCliente() 
	{
		return cliente;
	}

	public void setCliente(Cliente cliente) 
	{
		this.cliente = cliente;
	}
	
	public byte getOpcPgto() 
	{
		return opcPgto;
	}

	public void setOpcPgto(byte opcPgto) 
	{
		this.opcPgto = opcPgto;
	}
	
	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) 
	{
		this.carrinho = carrinho;
	}
	
	public byte getParcela() {
		return parcela;
	}

	public void setParcela(byte parcela) {
		this.parcela = parcela;
	}
	
	
	//MÉTODOS
	


	public double pagamentoAVista() 
	{
		System.out.println("\n");
		double valorComDesconto = ((this.carrinho.getSubtotal()) * 0.9);
		System.out.println("Valor final a ser pago com 10% de desconto: " + valorComDesconto);
		return valorComDesconto;
	}
	
	
	public double pagamentoParcelado(byte parcela) 
	{
		double valorParcelado = 0;
		if (parcela == 1) 
		{
			System.out.println("Valor total a ser pago: " + this.carrinho.getSubtotal());
			 valorParcelado = this.carrinho.getSubtotal();
			
			
		} else if (parcela == 2) 
		{
			
			valorParcelado = this.carrinho.getSubtotal() / parcela;
			LocalDate parcela1 = this.HOJE.plusDays(30);
			LocalDate parcela2 = this.HOJE.plusDays(60);
			System.out.println("1ª Parcela de " + valorParcelado + " para " + this.formatador.format(parcela1));
			System.out.println("2ª Parcela de " + valorParcelado + " para " + this.formatador.format(parcela2));
			
		
		} else if (parcela == 3) 
		{
			
			valorParcelado = this.carrinho.getSubtotal() / parcela;
			LocalDate parcela1 = this.HOJE.plusDays(30);
			LocalDate parcela2 = this.HOJE.plusDays(60);
			LocalDate parcela3 = this.HOJE.plusDays(90);
			System.out.println("1ª Parcela de " + valorParcelado + " para " + this.formatador.format(parcela1));
			System.out.println("2ª Parcela de " + valorParcelado + " para " + this.formatador.format(parcela2));
			System.out.println("3ª Parcela de " + valorParcelado + " para " + this.formatador.format(parcela3));
			
		}
		
		return valorParcelado;
	}

	

	
	
}
	
			
			
	
