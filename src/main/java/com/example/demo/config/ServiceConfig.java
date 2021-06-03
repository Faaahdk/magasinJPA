package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.models.Categorie;
import com.example.demo.models.Client;
import com.example.demo.models.Commande;
import com.example.demo.models.Produit;
import com.example.demo.services.GenericService;
import com.example.demo.services.impl.CategorieServiceImpl;
import com.example.demo.services.impl.ClientServiceImpl;
import com.example.demo.services.impl.CommandeServiceImpl;
import com.example.demo.services.impl.ProduitServiceImpl;

@Configuration
public class ServiceConfig {
	
	@Bean
	public GenericService<Categorie> categorieServiceFactory() {
		return new CategorieServiceImpl();
	}
	
	@Bean
	public GenericService<Client> clientServiceFactory() {
		return new ClientServiceImpl();
	}
	
	@Bean
	public CommandeServiceImpl commandeServiceFactory() {
		return new CommandeServiceImpl();
	}
	
	@Bean
	public GenericService<Produit> produitServiceFactory() {
		return new ProduitServiceImpl();
	}
}
