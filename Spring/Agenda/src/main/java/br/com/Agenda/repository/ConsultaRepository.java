package br.com.Agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Agenda.model.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

}
