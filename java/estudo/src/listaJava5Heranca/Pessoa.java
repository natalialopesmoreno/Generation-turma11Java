package listaJava5Heranca;

public class Pessoa 
{
	private String nome, telefone, enderešo;  
	private char sexo;
	
	public Pessoa(String nome, char sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, String enderešo, String telefone, char sexo) {
		this.nome = nome;
		this.enderešo = enderešo;
		this.telefone = telefone;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", enderešo=" + enderešo + ", telefone=" + telefone + "]";
	}
	
}
