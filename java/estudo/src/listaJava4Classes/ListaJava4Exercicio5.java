package listaJava4Classes;

public class ListaJava4Exercicio5 
{

	public static void main(String[] args) {
		/*Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto patinete, 
		 * defina as instancias deste objeto e apresente as informações deste objeto no console.
		 */

		Patinete pat = new Patinete("Caloi", 200.00, "Rosa");
		
		
		System.out.println(pat.toString());
		pat.brincar();
		
		
	}

}
