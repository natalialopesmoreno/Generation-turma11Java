package listaJava5Polimorfismo;

public class Produto 
{
		private String nome;
		private int codigo;
		private double preco;
		private String cor;
		private int qtd;
		
		
		
		
		//CONSTRUTORES
		public Produto() 
		{
			super();
		}


		public Produto(String nome, int codigo, double preco, String cor, int qtd) 
		{
			this.nome = nome;
			this.codigo = codigo;
			this.preco = preco;
			this.cor = cor;
			this.qtd = qtd;
		}

		
		//GETTERS AND SETTERS
		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getCodigo() {
			return codigo;
		}


		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}


		public double getPreco() {
			return preco;
		}


		public void setPreco(double preco) {
			this.preco = preco;
		}


		public String getCor() {
			return cor;
		}


		public void setCor(String cor) {
			this.cor = cor;
		}


		public int getQtd() {
			return qtd;
		}


		public void setQtd(int qtd) {
			this.qtd = qtd;
		}


		@Override
		public String toString() {
			return "Produto " + nome + ", \nCodigo=" + codigo + ", \nPreco=" + preco + ", \nCor=" + cor + ", \nQuantidade=" + qtd
					;
		}
		
		
		
		
		
}
