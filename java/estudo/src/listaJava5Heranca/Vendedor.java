package listaJava5Heranca;

public class Vendedor extends Pessoa 
{
	/*tamb�m os atributos pr�prios como valorVendas 
	 *  (correspondente ao valor monet�rio dos artigos vendidos) 
	 *  e o atributo comissao (porcentagem do valorVendas que ser� adicionado ao vencimento base do Vendedor).
	 */
	
	private double valorVendas;
	private static final double  COMISSAO = 0.10;
	private double salario;
	private double vencimentoBase;
	
	
	
	
	public Vendedor() {
		
	}


	public Vendedor(String nome, String endere�o, String telefone, char sexo, double valorVendas) 
	{
		super(nome,endere�o,telefone, sexo);
		this.valorVendas = valorVendas;
		
	}


	public double getValorVendas() {
		return valorVendas;
	}


	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double getVencimentoBase() {
		return vencimentoBase = salario + (COMISSAO*valorVendas) ;
	}


	public static double getComissao() {
		return COMISSAO;
	}
	
	


	@Override
	public String toString() {
		return "Vendedor, \nNome:"
				+ getNome() + ", \nEndere�o:" + getEndere�o() + ", \nTelefone" + getTelefone() + " \nvalorVendas=" + valorVendas + ", \nvencimentoBase=" + vencimentoBase;
	}
	
	
	
	
	
	
}
