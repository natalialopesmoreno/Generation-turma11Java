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

import br.com.Agenda.model.Consulta;
import br.com.Agenda.repository.ConsultaRepository;

@RestController
@RequestMapping("/consulta")
@CrossOrigin("*")
public class ConsultaController 
{

	
	// INJETANDO O REPOSITORY
		@Autowired
		private ConsultaRepository repository;

		@GetMapping
		public ResponseEntity<List<Consulta>> findAllConsulta() {
			return ResponseEntity.ok(repository.findAll());
		}


		@GetMapping("/{id}")
		public ResponseEntity<Consulta> findById(@PathVariable Long id) {
			return repository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
					.orElse(ResponseEntity.notFound().build());
		}


		// POST- CREATE

		@PostMapping
		public ResponseEntity<Consulta> post(@RequestBody Consulta consulta) {

			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(consulta));
		}

		// PUT-UPDATE
		@PutMapping("/{id}")
		public ResponseEntity<Consulta> atualizar(@PathVariable Long id, @RequestBody Consulta consulta) {
			consulta.setId(id);

			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(consulta));
		}

		// DELETE
		@DeleteMapping("/{id}")
		public void remover(@PathVariable Long id) {
			repository.deleteById(id);
		}

	
	
	
}
