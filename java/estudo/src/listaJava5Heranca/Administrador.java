package listaJava5Heranca;

public class Administrador extends Pessoa
{
		/*
		 * os atributos próprios 
		 * como ajudaDeCusto (ajudas referentes a viagens, estadias).
		 */
	
		private double ajudaDeCusto;
		
		public Administrador() 
		{
			
		}
		

		public Administrador(String nome, String endereço, String telefone, char sexo, double ajudaDeCusto) 
		{
			super(nome, endereço, telefone, sexo);
			this.ajudaDeCusto = ajudaDeCusto;
		}


		public double getAjudaDeCusto() {
			return ajudaDeCusto;
		}


		public void setAjudaDeCusto(double ajudaDeCusto) {
			this.ajudaDeCusto = ajudaDeCusto;
		}


		@Override
		public String toString() {
			return "Administrador [ajudaDeCusto=" + ajudaDeCusto + ", getNome()=" + getNome() + ", getEndereço()="
					+ getEndereço() + ", getTelefone()=" + getTelefone() + "]";
		}
		
		
		
		
	
}
