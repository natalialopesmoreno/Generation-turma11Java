package br.com.Agenda.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_psicologa")
public class Psicologa 
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@NotNull
	private String email;
	
	
	private String cpf;
	
	
	private String crp;
	
	@NotNull
	private String telefone;
	
	
	@OneToMany(mappedBy = "psicologa", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("psicologa")
	private List<Consulta> consultas;
	
	@OneToMany(mappedBy = "psicologa", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("psicologa")
	private List<Paciente> pacientes;

	
	
	
	//GETTERS AND SETTERS
	
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cPF) {
		cpf = cPF;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	public String getCRP() {
		return crp;
	}

	public void setCRP(String cRP) {
		crp = cRP;
	}
	
}
