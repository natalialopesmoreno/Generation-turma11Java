package listaJava4Classes;

public class Paciente 
{
	String nome;
	char sexo;
	int idade;
	int horario;
	int dia;
	int mes;
	String EspecialidadeConsulta;
	
	
	
	public Paciente() 
	{
		
	}


	public Paciente(String nome, char sexo, int idade) 
	{
		
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}





	public void marcar(int dia, int mes, int horario, String Espc) 
	{
		this.horario = horario;
		this.dia = dia;
		this.mes = mes;
		this.EspecialidadeConsulta = Espc;
	}


	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + "] \nSua consulta será no dia "+ dia +"/"+ mes +"/2020  \nhorario: " + horario + 
				 "horas, \na especialidade da consulta é: " + EspecialidadeConsulta + "";
	}
	
	
	
}
