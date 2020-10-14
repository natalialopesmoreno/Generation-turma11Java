package listaJava4Classes;

public class ContaBancaria 
{
	String nomeCliente;
	String agencia;
	String conta;
	private double saldo;
	
	
	public ContaBancaria(String nomeCliente, String agencia, String conta) {
		super();
		this.nomeCliente = nomeCliente;
		this.agencia = agencia;
		this.conta = conta;
		
	}
	
	
	public void depositar(double valor) 
	{
		this.saldo+= valor;
		System.out.println("O saldo após o depósito é de: R$" +Math.round( this.saldo)+" reais");
	}
	
	public void sacar(double valor) 
	{
		this.saldo -= valor;
		System.out.println("O saldo após o saque é de: R$" +Math.round( this.saldo)+" reais");
	}
	
	public double extrato() 
	{
		System.out.println("O seu saldo é de: R$" +Math.round( this.saldo)+" reais");
		return this.saldo;
	}


	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", agencia=" + agencia + ", conta=" + conta + ", saldo="
				+ saldo + "]";
	}
	
	
	
	
}
