package br.com.Agenda.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.Agenda.repository.PsicologaRepository;

@Entity
@Table(name="tb_paciente")
public class Paciente 
{
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	
	private String email;
	
	
	private String cpf;
	
	
	private String telefone;
	
	@OneToMany
	@JsonIgnoreProperties("paciente")
	private List<Consulta> consultas;
	
	@ManyToOne
	@JsonIgnoreProperties("paciente")
	private Psicologa psicologa;
	
	
	
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cPF) {
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

	public Psicologa getPsicologa() {
		return psicologa;
	}

	public void setPsicologa(Psicologa psicologa) {
		this.psicologa = psicologa;
	}
	

	
	
}
