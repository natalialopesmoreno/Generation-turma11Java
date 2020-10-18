package projeto.Ecommerce.Classes;

public class Produto 
{
	
	private String nome;
	private double preco;
	private int qtd;
	private int codigo = 0;
	
	
	//CONSTRUTOR
	
	public Produto() 
	{
		
	}
	
	public Produto(String nome, double preco, int qtd) 
	{
		
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
		
	}
	
	public Produto(String nome, double preco, int qtd, int codigo) 
	{
		
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
		this.codigo = codigo;
		
	}
	
	//GETTER AND SETTER
	


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int index) {
		this.codigo = index;
	}

	@Override
	public String toString() 
	{
		return "\nNome do produto " + nome + " \nPreco:" + preco + " \nQuantidade:" + qtd + "\nCódigo: " + codigo;
	}

	


	



	
	
	

	
	
}
