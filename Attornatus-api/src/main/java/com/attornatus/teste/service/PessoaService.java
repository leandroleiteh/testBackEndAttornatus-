package com.attornatus.teste.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attornatus.teste.model.PessoaModel;
import com.attornatus.teste.repository.PessoaRepository;

import jakarta.transaction.Transactional;

@Service
public class PessoaService {

	@Autowired
	PessoaRepository pessoaRepository;

	@Transactional
	public PessoaModel save(PessoaModel pessoaModel) {
		return pessoaRepository.save(pessoaModel);
	}

	public boolean existsBynome(String nome) {
		return pessoaRepository.existsBynome(nome);
	}

	public List<PessoaModel> findAll() {
		return pessoaRepository.findAll();
	}

	public Optional<PessoaModel> findById(Id id) {
		return pessoaRepository.findById(id);
	}

	

	

	
}