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

import br.com.Agenda.model.Psicologa;
import br.com.Agenda.repository.PsicologaRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/psicologa")
public class PsicologaController 
{

	// INJETANDO O REPOSITORY
			@Autowired
			private PsicologaRepository repository;

			@GetMapping
			public ResponseEntity<List<Psicologa>> findAllPsicologa() {
				return ResponseEntity.ok(repository.findAll());
			}


			@GetMapping("/{id}")
			public ResponseEntity<Psicologa> findById(@PathVariable Long id) {
				return repository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
						.orElse(ResponseEntity.notFound().build());
			}


			// POST- CREATE

			@PostMapping
			public ResponseEntity<Psicologa> post(@RequestBody Psicologa psicologa) {

				return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(psicologa));
			}

			// PUT-UPDATE
			@PutMapping("/{id}")
			public ResponseEntity<Psicologa> atualizar(@PathVariable Long id, @RequestBody Psicologa psicologa) {
				psicologa.setId(id);

				return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(psicologa));
			}

			// DELETE
			@DeleteMapping("/{id}")
			public void remover(@PathVariable Long id) {
				repository.deleteById(id);
			}

	
	
	
}
