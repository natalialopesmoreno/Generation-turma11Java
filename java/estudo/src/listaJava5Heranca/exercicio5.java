package listaJava5Heranca;

public class exercicio5 {

	public static void main(String[] args) {
		/*
		 *  Implemente a classe Operario como subclasse da classe Pessoa. 
		 *  Um determinado operário tem como atributos da classe Pessoa e também os atributos próprios como valorProducao 
		 *  (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) 
		 *  e comissao (que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário). 
		 */
		
		Operario op = new Operario("Maria", "R.Cafuné", "8888-8888",'O', 50.00 , 25.50);
		System.out.println(op.getComissao());
		System.out.println("O valor final do produtop será de:" + op.getValorFinal());
		System.out.println(op.toString());
		
	}

}
