package listaJava4Classes;

public class ProdutoEletronico 
{
		String nome;
		double preco;
		String marca;
		boolean ligado;
		boolean carregado;
		
		
		
		
		public ProdutoEletronico() {
		}

		public ProdutoEletronico(String nome, double preco, String marca) 
		{
			this.nome = nome;
			this.preco = preco;
			this.marca = marca;
		}
		
		public void ligar() 
		{
			this.ligado = true;
			System.out.println("Seu produto está ligado");
		}
		
		public void desligar() 
		{
			this.ligado = false;
			System.out.println("Seu produto está desligado");
		}
		
		public void carregar() 
		{
			this.carregado = false;
			System.out.println("Seu produto está carregado");
		}

		@Override
		public String toString() {
			return "ProdutoEletronico [nome=" + nome + ", preco=" + preco + ", marca=" + marca + ", ligado=" + ligado
					+ ", carregado=" + carregado + "]";
		}
		
		
		
}
