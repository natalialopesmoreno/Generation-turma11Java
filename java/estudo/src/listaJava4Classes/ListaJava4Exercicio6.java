package listaJava4Classes;

public class ListaJava4Exercicio6 {

	public static void main(String[] args) {
		/*Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe, 
		 * em seguida crie um objeto conta bancaria, defina as instancias deste objeto e apresente as informações deste objeto no console.
		 * Verificar como arrendondar duas casas
		 */

		ContaBancaria cb = new ContaBancaria("Natalia", "1555-5", "19999-9");
		
		System.out.println(cb.toString());
		
		cb.extrato();
		cb.depositar(1200.39);
		cb.sacar(246.89);
		cb.extrato();
		
		
	}

}
