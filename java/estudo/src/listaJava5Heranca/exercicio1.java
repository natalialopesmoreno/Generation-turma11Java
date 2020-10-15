package listaJava5Heranca;

public class exercicio1 {

	public static void main(String[] args) {
		/*Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos 
		 * seletores (getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas opções de construtores 
		 * conforme sua percepção. Atributos: String nome; String endereço; String telefone; 
		 */
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa("Fulano", 'F');
		Pessoa p3 = new Pessoa("Fabio", "R.Sem fim", "0000-0000", 'M');
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

		
		
		
	}

}
