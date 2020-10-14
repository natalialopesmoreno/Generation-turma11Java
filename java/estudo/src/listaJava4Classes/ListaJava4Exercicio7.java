package listaJava4Classes;

public class ListaJava4Exercicio7 {

	public static void main(String[] args) {
		/* Crie uma classe paciente e apresente os atributos e métodos referentes esta classe, 
		 * em seguida crie um objeto paciente, defina as instancias deste objeto e apresente as informações deste objeto no console.
		 */
		
		Paciente paciente = new Paciente("Fulano", 'M', 67);
		
		paciente.marcar(15, 10, 15, "Cardiologista");
		System.out.println(paciente.toString());

	}

}
