package fr.m2i.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import fr.m2i.api.model.TodoJpa;

@Repository
public interface TodoJpaRepository extends JpaRepository<TodoJpa, Long>  {
	
	//Automatise les find, findAll, read, query, count et get et recherche après le By
	
	
}
