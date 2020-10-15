package listaJava5Heranca;

public class Operario extends Pessoa
{
	/*
	 * os atributos próprios como valorProducao 
		 *  (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) 
		 *  e comissao (que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário).
	 */
	
	private double valorProducao;
	private double comissao;
	private double valorFinal ;
	
	public Operario() 
	{
		
	}
	
	
	public Operario(String nome, String endereço, String telefone, char sexo, double valorProducao, double comissao) 
	{
		super(nome, endereço, telefone, sexo);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}


	public double getValorProducao() 
	{
		return valorProducao;
	}


	public void setValorProducao(double valorProducao) 
	{
		this.valorProducao = valorProducao;
	}


	public double getComissao() 
	{
		return comissao;
	}


	public void setComissao(double comissao) 
	{
		this.comissao = comissao;
	}
	
	public double getValorFinal() 
	{
		return valorFinal= this.valorProducao + this.comissao;
	}
	


	@Override
	public String toString() 
	{
		return "Operario [valorProducao=" + valorProducao + ", comissao=" + comissao + ", getNome()=" + getNome()
				+ ", getEndereço()=" + getEndereço() + ", getTelefone()=" + getTelefone() + "]";
	}


	
	
	
	
	
	
	
	
}
