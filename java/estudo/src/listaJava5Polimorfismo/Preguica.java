package listaJava5Polimorfismo;

public class Preguica extends Animal 
{

	private String nome;
	private int idade;
	private boolean cimaArvore = false;
	
	
	
	
	
	
	

	
	public Preguica() 
	{
		
	}

	public Preguica(String nome, int idade) 
	{
		super();
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public String getNome() 
	{
		return "O nome da preguiça  é: " + super.getNome();
	}
	


	public boolean isCimaArvore() {
		return cimaArvore;
	}

	protected void setCimaArvore(boolean cimaArvore) {
		this.cimaArvore = cimaArvore;
	}


	@Override
	public void emitirSom() {
		System.out.println("Hmmmmmmm");
	}
	
	public void subirArvore() 
	{
		System.out.println("subindo na Árvore");
		setCimaArvore(true);
	}

	
	
	
}
