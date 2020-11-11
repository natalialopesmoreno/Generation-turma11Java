package br.com.Agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Agenda.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>  {

}
