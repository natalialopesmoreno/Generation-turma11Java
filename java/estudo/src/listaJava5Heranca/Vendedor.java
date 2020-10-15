package listaJava5Heranca;

public class Vendedor extends Pessoa 
{
	/*também os atributos próprios como valorVendas 
	 *  (correspondente ao valor monetário dos artigos vendidos) 
	 *  e o atributo comissao (porcentagem do valorVendas que será adicionado ao vencimento base do Vendedor).
	 */
	
	private double valorVendas;
	private static final double  COMISSAO = 0.10;
	private double salario;
	private double vencimentoBase;
	
	
	
	
	public Vendedor() {
		
	}


	public Vendedor(String nome, String endereço, String telefone, char sexo, double valorVendas) 
	{
		super(nome,endereço,telefone, sexo);
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
				+ getNome() + ", \nEndereço:" + getEndereço() + ", \nTelefone" + getTelefone() + " \nvalorVendas=" + valorVendas + ", \nvencimentoBase=" + vencimentoBase;
	}
	
	
	
	
	
	
}
