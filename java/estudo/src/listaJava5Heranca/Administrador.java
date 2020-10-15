package listaJava5Heranca;

public class Administrador extends Pessoa
{
		/*
		 * os atributos pr�prios 
		 * como ajudaDeCusto (ajudas referentes a viagens, estadias).
		 */
	
		private double ajudaDeCusto;
		
		public Administrador() 
		{
			
		}
		

		public Administrador(String nome, String endere�o, String telefone, char sexo, double ajudaDeCusto) 
		{
			super(nome, endere�o, telefone, sexo);
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
			return "Administrador [ajudaDeCusto=" + ajudaDeCusto + ", getNome()=" + getNome() + ", getEndere�o()="
					+ getEndere�o() + ", getTelefone()=" + getTelefone() + "]";
		}
		
		
		
		
	
}
