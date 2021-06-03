package com.example.demo.services;

import java.util.List;

public interface GenericService<T>{
	public List<T> findAll();
	public T findByID(Long Id);
	public T save(T entity);
	public T update(T entity);
	public void delete(T entity);
}
