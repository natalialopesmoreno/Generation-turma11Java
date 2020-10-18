package projeto.Ecommerce.Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente 
{
	

	private String nome;
	private char sexo;
	private String CPF;
	private Pagamento pgt;
	
	
	//CONSTRUTOR
	

	public Cliente() 
	{
		
	}
	
	
	
	public Cliente(String nome, char sexo, String cpf) 
	{
		this.nome = nome;
		this.sexo = sexo;
		this.CPF = cpf;
	}



	//GETTER AND SETTER
	
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) 
	{
		CPF = cPF;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public char getSexo() 
	{
		return sexo;
	}

	public void setSexo(char sexo) 
	{
		this.sexo = sexo;
	}
	
	public Pagamento getPgt() 
	{
		return pgt;
	}

	public void setPgt(Pagamento pgt) 
	{
		this.pgt = pgt;
	}

	
	
	
	
	
	
}
