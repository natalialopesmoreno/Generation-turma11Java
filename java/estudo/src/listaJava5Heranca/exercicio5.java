package listaJava5Heranca;

public class exercicio5 {

	public static void main(String[] args) {
		/*
		 *  Implemente a classe Operario como subclasse da classe Pessoa. 
		 *  Um determinado oper�rio tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como valorProducao 
		 *  (que corresponde ao valor monet�rio dos artigos efetivamente produzidos pelo oper�rio) 
		 *  e comissao (que corresponde � porcentagem do valorProducao que ser� adicionado ao vencimento base do oper�rio). 
		 */
		
		Operario op = new Operario("Maria", "R.Cafun�", "8888-8888",'O', 50.00 , 25.50);
		System.out.println(op.getComissao());
		System.out.println("O valor final do produtop ser� de:" + op.getValorFinal());
		System.out.println(op.toString());
		
	}

}
