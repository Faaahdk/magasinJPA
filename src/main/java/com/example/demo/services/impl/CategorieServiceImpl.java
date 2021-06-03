package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Categorie;
import com.example.demo.repositories.CategorieRepository;
import com.example.demo.services.GenericService;

public class CategorieServiceImpl implements GenericService<Categorie> {
	
	@Autowired
	private CategorieRepository repository;
	
	@Override
	public List<Categorie> findAll() {
		return this.repository.findAll();
	}

	@Override
	public Categorie findByID(Long id) {
		return this.repository.findById(id).get();
	}

	@Override
	public Categorie save(Categorie categorie) {
		return this.repository.save(categorie);
	}

	@Override
	public Categorie update(Categorie categorie) {
		return this.repository.save(categorie);
	}

	@Override
	public void delete(Categorie categorie) {
		this.repository.delete(categorie);
	}

}
