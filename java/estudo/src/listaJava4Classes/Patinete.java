package listaJava4Classes;

public class Patinete 
{

	final int RODAS = 2;
	String marca;
	double preco;
	String cor;
	
	
	public Patinete(String marca, double preco, String cor) {
		
		this.marca = marca;
		this.preco = preco;
		this.cor = cor;
	}
	
	


	public Patinete() {
	}




	@Override
	public String toString() {
		return "Patinete [RODAS=" + RODAS + ", marca=" + marca + ", preco=" + preco + ", cor=" + cor + "]";
	}
	
	public void brincar() 
	{
		System.out.println("Brincando no meu patinnete...");
	}
	
	
	
	
	
	
	
}
