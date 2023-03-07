package com.attornatus.teste.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.attornatus.teste.model.Pessoa;
import com.attornatus.teste.repository.PessoaRepository;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;

	@GetMapping
	public List<Pessoa> listar() {
		return pessoaRepository.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Pessoa criar(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
//	@PutMapping("/pessoas/{id}")
//	public Pessoa editar(@PathVariable Long id, @RequestBody Pessoa pessoa) {
//		Pessoa pessoaAtual = pessoaRepository.findById(id).get();
//		BeanUtils.copyProperties(pessoa, pessoaAtual, "id");
//		return pessoaRepository.save(pessoaAtual);
//	}
	
}
