package listaJava4Classes;

public class ListaJava4Exercicio4 {

	public static void main(String[] args) {
		// Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, 
		//em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente as informações deste objeto no console.
		
		
			Funcionario func = new Funcionario("Fernando", 'M', 55, "Gerente de Projetos");
			System.out.println(func.toString());
			System.out.println("\n");
			func.trabalhar(8);
	}

}
