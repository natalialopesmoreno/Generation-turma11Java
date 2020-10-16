package listaJava5Heranca;

public class Pessoa 
{
	private String nome, telefone, endereço;  
	private char sexo;
	
	public Pessoa(String nome, char sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, String endereço, String telefone, char sexo) {
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereço=" + endereço + ", telefone=" + telefone + "]";
	}
	
}
