package br.com.Agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.Agenda.model.Paciente;
import br.com.Agenda.repository.PacienteRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/paciente")
public class PacienteController 
{

	// INJETANDO O REPOSITORY
				@Autowired
				private PacienteRepository repository;

				@GetMapping
				public ResponseEntity<List<Paciente>> buscarTodos() {
					return ResponseEntity.ok(repository.findAll());
				}


				@GetMapping("/{id}")
				public ResponseEntity<Paciente> findById(@PathVariable Long id) {
					return repository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
							.orElse(ResponseEntity.notFound().build());
				}


				// POST- CREATE

				@PostMapping
				public ResponseEntity<Paciente> post(@RequestBody Paciente paciente) {

					return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(paciente));
				}

				// PUT-UPDATE
				@PutMapping("/{id}")
				public ResponseEntity<Paciente> atualizar(@PathVariable Long id, @RequestBody Paciente paciente) {
					paciente.setId(id);

					return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(paciente));
				}

				// DELETE
				@DeleteMapping("/{id}")
				public void remover(@PathVariable Long id) {
					repository.deleteById(id);
				}

	
}
