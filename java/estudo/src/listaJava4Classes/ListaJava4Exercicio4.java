package listaJava4Classes;

public class ListaJava4Exercicio4 {

	public static void main(String[] args) {
		// Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, 
		//em seguida crie um objeto funcion�rio, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
		
		
			Funcionario func = new Funcionario("Fernando", 'M', 55, "Gerente de Projetos");
			System.out.println(func.toString());
			System.out.println("\n");
			func.trabalhar(8);
	}

}
