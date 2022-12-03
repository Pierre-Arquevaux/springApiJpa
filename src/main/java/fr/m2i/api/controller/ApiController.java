package fr.m2i.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.m2i.api.model.TodoJpa;
import fr.m2i.api.service.TodoService;

@RestController
@RequestMapping(path = "/api")
public class ApiController {

	@Autowired
	TodoService todoService;

	/*
	 * Exemple avec JPA
	 */

	@GetMapping(path = "/read", // path / url
			produces = { "application/json" } // négociation de contenu / par défaut JSON
	)
	public List<TodoJpa> getTodosJpa() {

		return todoService.getAll();

	}

	@PostMapping(path = "/post", // path / url
			consumes = { "application/json" } // négociation de contenu / par défaut JSON
	)
	@ResponseStatus(code = HttpStatus.CREATED)
	public void getTodosJpa(@RequestBody TodoJpa todo) {

		todoService.saveTodo(todo);

	}

	@DeleteMapping(path = "/delete/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void deleteTodosJpa(@PathVariable ("id") Long id) {

		todoService.deleteTodo(id);
		System.out.println("todolist effacé");

	}
}
