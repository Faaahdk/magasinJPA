package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Client;
import com.example.demo.services.GenericService;


@RestController
@RequestMapping("clients")
public class ClientController {

	@Autowired
	private GenericService<Client> service;
	
	@GetMapping()
	public Iterable<Client> findAll() {
		return this.service.findAll();
	}
	
	@GetMapping("{id}")
	public Client findById(@PathVariable Long id) {
		return this.service.findByID(id);
	}
	
	@PostMapping()
	public void save(@RequestBody Client client) {
		this.service.save(client);
	}
	
	@DeleteMapping()
	public void delete(@RequestBody Client client) {
		this.service.delete(client);
	}
}
