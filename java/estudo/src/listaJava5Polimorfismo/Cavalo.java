package listaJava5Polimorfismo;

public class Cavalo extends Animal 
{
	
	

	
	
	public String getNome() 
	{
		return "O nome do cavalo é: " + super.getNome();
	}
	
	@Override
	public void emitirSom() 
	{
		System.out.println("Relinchando!!");
		
	}

}
