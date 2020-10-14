package listaJava4Classes;

public class Funcionario 
{
		String nome;
		char sexo;
		int idade;
		String cargo;
		int horasTrabalhadas;
		
		public Funcionario(String nome, char sexo, int idade, String cargo) {
			
			this.nome = nome;
			this.sexo = sexo;
			this.idade = idade;
			this.cargo = cargo;
		}

		public Funcionario() {
			
		}

		@Override
		public String toString() {
			return "Funcionario [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", cargo=" + cargo
					+ ", horasTrabalhadas=" + horasTrabalhadas + "]";
		}
		
		public void trabalhar(int horas) 
		{
			this.horasTrabalhadas += horas;
			System.out.println("Por hoje já trabalhei: " +this.horasTrabalhadas+" horas");
		}
		
		
		
	
}
