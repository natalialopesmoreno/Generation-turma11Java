package listaJava5Heranca;

public class exercicio6 {

	public static void main(String[] args) {
		/*
		 *  Implemente a classe Vendedor como subclasse da classe Pessoa. 
		 *  Um determinado vendedor tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como valorVendas 
		 *  (correspondente ao valor monet�rio dos artigos vendidos) 
		 *  e o atributo comissao (porcentagem do valorVendas que ser� adicionado ao vencimento base do Vendedor). 
		 */

		Vendedor vend = new Vendedor("Fabio", "R.Sem fim", "0000-0000", 'M', 3500.00);
		vend.setSalario(3000.00);
		
		Pessoa vend2 = new Vendedor();
		
		
		
		
		
		System.out.println(vend.getVencimentoBase());
		
		System.out.println(vend.toString());
		
	}

}
