package com.example.demo.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Commande;
import com.example.demo.repositories.CommandeRepository;
import com.example.demo.services.GenericService;

public class CommandeServiceImpl implements GenericService<Commande> {
	
	@Autowired
	private CommandeRepository repository;
	
	@Override
	public List<Commande> findAll() {
		return this.repository.findAll();
	}

	@Override
	public Commande findByID(Long id) {
		return this.repository.findById(id).get();
	}

	@Override
	public Commande save(Commande commande) {
		return this.repository.save(commande);
	}

	@Override
	public Commande update(Commande commande) {
		return this.repository.save(commande);
	}

	@Override
	public void delete(Commande commande) {
		this.repository.delete(commande);
	}

	public Iterable<Commande> findByClientId(Long id) {
		return this.repository.findByClientId(id);
	}
}
