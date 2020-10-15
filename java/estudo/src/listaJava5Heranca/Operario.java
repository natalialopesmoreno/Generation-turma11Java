package listaJava5Heranca;

public class Operario extends Pessoa
{
	/*
	 * os atributos pr�prios como valorProducao 
		 *  (que corresponde ao valor monet�rio dos artigos efetivamente produzidos pelo oper�rio) 
		 *  e comissao (que corresponde � porcentagem do valorProducao que ser� adicionado ao vencimento base do oper�rio).
	 */
	
	private double valorProducao;
	private double comissao;
	private double valorFinal ;
	
	public Operario() 
	{
		
	}
	
	
	public Operario(String nome, String endere�o, String telefone, char sexo, double valorProducao, double comissao) 
	{
		super(nome, endere�o, telefone, sexo);
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
				+ ", getEndere�o()=" + getEndere�o() + ", getTelefone()=" + getTelefone() + "]";
	}


	
	
	
	
	
	
	
	
}
