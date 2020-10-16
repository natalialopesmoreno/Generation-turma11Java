package listaJava5Polimorfismo;

public abstract class Animal 
{
	private String nome;
	private int idade;
	
	
	public Animal() 
	{
		
	}
	
	
	public Animal(String nome, int idade) 
	{
		
		this.nome = nome;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", idade=" + idade + "]";
	}
	
	//public abstract void emitirSom();
	
	public void emitirSom() 
	{
		System.out.println("Emitindo sons");
	}
	
	
	
	
	
}