package com.attornatus.teste.repository;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.attornatus.teste.model.Pessoa;

import jakarta.persistence.Id;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Id> {

	
		
	}
		

	
	
	
