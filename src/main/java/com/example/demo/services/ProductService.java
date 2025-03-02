package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.entities.User;
import com.example.demo.repositories.ProductRespository;

@Service
public class ProductService {

	@Autowired
	private ProductRespository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById (Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
