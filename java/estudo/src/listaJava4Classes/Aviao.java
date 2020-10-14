package listaJava4Classes;

public class Aviao 
{
		String cor;
		String modelo;
		int velocidade;
		String origem;
		String destino;
		boolean noAr = false;
		boolean pousado =true;
		
		
		
		public Aviao() 
		{
		}

		public Aviao(String cor, String modelo, int velocidade, String origem, String destino) 
		{
			this.cor = cor;
			this.modelo = modelo;
			this.velocidade = velocidade;
			this.origem = origem;
			this.destino = destino;
		}
		
		public void pousar() 
		{
			this.pousado =true;
			System.out.println("O avi�o pousou!");
		}
		
		public void acelerar(int velocidade) 
		{
			this.pousado =false;
			this.noAr=true;
			this.velocidade += velocidade;
			System.out.printf("O avi�o decolou e est� a %d milhas/hora", this.velocidade);
		}
		
		public void desacelerar(int velocidade) 
		{
			this.velocidade -= velocidade;
			System.out.printf("O avi�o est� desacelerando, est� a %d milhas/hora", this.velocidade);
			if(velocidade <= 0) 
			{
				System.out.println("O avi�o pousou!");
				this.pousado =true;
				this.noAr=false;
			}
		}
		
		public void estaVoando() 
		{
			System.out.println("O avi�o est� voando?"+ this.noAr);
		}
		
		public void estaPousado() 
		{
			System.out.println("O avi�o est� pousado?"+ this.pousado);
		}
		
		public void destinar(String destino) 
		{
			this.destino = destino;
			System.out.println("O destino do avi�o �: "+ this.destino);
			
		}
		
		@Override
		public String toString() {
			return "Aviao [cor=" + cor + ", modelo=" + modelo + ", velocidade=" + velocidade + ", origem=" + origem
					+ ", destino=" + destino + ", noAr=" + noAr + ", pousado=" + pousado + "]";
		}

		public void rotear() 
		{
			System.out.println("O avi�o tem origem em: "+this.origem+" e tem destino em: "+ this.destino);
		}
		
		
		
		
		
}
