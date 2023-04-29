package com.sanjuan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjuan.model.Product;
import com.sanjuan.repository.ProductRepo;

@Service
public class ProductServ {

	@Autowired
	private ProductRepo repo;

	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	public Product getProductByCode(String code) {
		return repo.getReferenceById(code);
	}

	public List<Product> getProductsByName(String name) {
		return repo.getProductsByName(name);
	}

	public List<Product> getProductsByCategory(String category) {
		return repo.getProductsByCategory(category);
	}
}
