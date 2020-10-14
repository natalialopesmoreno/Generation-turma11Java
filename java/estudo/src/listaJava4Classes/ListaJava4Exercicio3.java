package listaJava4Classes;

public class ListaJava4Exercicio3 {

	public static void main(String[] args) {
		//  Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto produto eletrônico, 
		//defina as instancias deste objeto e apresente as informações deste objeto no console.

		ProdutoEletronico pE = new ProdutoEletronico("celular", 2500.00, "Samsung");
		
		System.out.println(pE.toString());
		
		pE.ligar();
		pE.desligar();
		pE.carregar();
		
		
	}

}
