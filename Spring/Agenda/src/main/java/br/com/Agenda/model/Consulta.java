package br.com.Agenda.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="tb_consulta")
public class Consulta 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	@NotNull
	@Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date data;
	
	@Column
	@NotNull
	private int mes;
	
	
	@ManyToOne
	@JsonIgnoreProperties("consultas")
	private Paciente paciente;
	
	
	@ManyToOne
	@JsonIgnoreProperties("consultas")
	private Psicologa psicologa;
	
	
	@Column
	private Double preco;
	
	@Column
	private EnumConsulta status;
	
	//GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Psicologa getPsicologa() {
		return psicologa;
	}

	public void setPsicologa(Psicologa psicologa) {
		this.psicologa = psicologa;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public EnumConsulta getStatus() {
		return status;
	}

	public void setStatus(EnumConsulta status) {
		this.status = status;
	}
	
	
	
	
	
	
}
