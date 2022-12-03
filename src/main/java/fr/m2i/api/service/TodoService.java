package fr.m2i.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.m2i.api.model.TodoJpa;
import fr.m2i.api.repository.TodoJpaRepository;

@Service
public class TodoService {

	@Autowired
	TodoJpaRepository tjr;

	public List<TodoJpa> getAll() {

		return tjr.findAll();
	}

	public void saveTodo(TodoJpa todo) {

		tjr.save(todo);
	}

	public void deleteTodo(Long id) {
		
		tjr.deleteById(id);
		
	}



}