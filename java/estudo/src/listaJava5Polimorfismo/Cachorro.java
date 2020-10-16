package listaJava5Polimorfismo;

public class Cachorro extends Animal {

	private String cor;

	
	
	public Cachorro() 
	{
		
	}
	
	
	public Cachorro(String nome, int idade, String cor) 
	{
		super(nome, idade);
		this.cor = cor;
	}
	
	
	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	@Override
	public void emitirSom() 
	{
		System.out.println("Au, au, au ");
		
	}


	@Override
	public String toString() {
		return "Cachorro \nCor=" + cor + ", \nNome=" + getNome() + ", \nIdade=" + getIdade() ;
	}
	
	

}
