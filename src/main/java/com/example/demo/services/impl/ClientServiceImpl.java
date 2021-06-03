package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Client;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.services.GenericService;


public class ClientServiceImpl implements GenericService<Client> {
	
	@Autowired
	private ClientRepository repository;
	
	@Override
	public List<Client> findAll() {
		return this.repository.findAll();
	}

	@Override
	public Client findByID(Long id) {
		return this.repository.findById(id).get();
	}

	@Override
	public Client save(Client client) {
		return this.repository.save(client);
	}

	@Override
	public Client update(Client client) {
		return this.repository.save(client);
	}

	@Override
	public void delete(Client client) {
		this.repository.delete(client);
	}

}
