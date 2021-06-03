package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Produit;
import com.example.demo.repositories.ProduitRepository;
import com.example.demo.services.GenericService;

public class ProduitServiceImpl implements GenericService<Produit>{
	
	@Autowired
	private ProduitRepository repository;
	
	@Override
	public List<Produit> findAll() {
		return this.repository.findAll();
	}

	@Override
	public Produit findByID(Long id) {
		return this.repository.findById(id).get();
	}

	@Override
	public Produit save(Produit produit) {
		return this.repository.save(produit);
	}

	@Override
	public Produit update(Produit produit) {
		return this.repository.save(produit);
	}

	@Override
	public void delete(Produit produit) {
		this.repository.delete(produit);
	}
}
