package listaJava5Heranca;

public class Pessoa 
{
	private String nome, telefone, endere�o;  
	private char sexo;
	
	public Pessoa(String nome, char sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, String endere�o, String telefone, char sexo) {
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endere�o=" + endere�o + ", telefone=" + telefone + "]";
	}
	
}
