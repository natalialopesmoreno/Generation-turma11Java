package listaJava5Heranca;

public class exercicio4 {

	public static void main(String[] args) {
		/*
		 * Implemente a classe Administrador como subclasse da classe pessoa. 
		 * Um determinado administrador tem como atributos da classe Pessoa e também os atributos próprios 
		 * como ajudaDeCusto (ajudas referentes a viagens, estadias).
		 */
		
		
		Administrador adm = new Administrador("Fabio", "R.Sem fim", "0000-0000", 'M', 100000);
		
		System.out.println(adm.toString());
		adm.setAjudaDeCusto(500000);
		System.out.println("Minha ajuda de custo agora é: "+ adm.getAjudaDeCusto() );
		

	}

}
