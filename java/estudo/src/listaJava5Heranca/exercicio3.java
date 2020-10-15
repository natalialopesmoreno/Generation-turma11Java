package listaJava5Heranca;

public class exercicio3 {

	public static void main(String[] args) {
		/* Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe 
		 * Empregado tem, para além dos atributos que caracterizam a classe Pessoa, 
		 * os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos). 
		 * Implemente a classe Empregado com métodos seletores e modificadores e um método calcularSalario. 
		 * Escreva um programa de teste adequado para a classe Empregado.
		 */
			
		
		Empregado emp = new Empregado("Maria", "R.Cafuné", "8888-8888",'O', 89, 1500.00 );
		
		System.out.println("O salário com desconto de impostos é de: "+ emp.calcularSalario(emp));
		
		
		emp.setNome("Mary");
		
		System.out.println(emp.toString());
	}

}
