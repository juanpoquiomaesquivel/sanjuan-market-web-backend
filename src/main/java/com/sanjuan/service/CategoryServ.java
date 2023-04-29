package com.sanjuan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjuan.model.Category;
import com.sanjuan.repository.CategoryRepo;

@Service
public class CategoryServ {

	@Autowired
	private CategoryRepo repo;

	public List<Category> getAllCategories() {
		return repo.findAll();
	}

	public Category getCategoryByCode(String code) {
		return repo.getReferenceById(code);
	}

	public List<Category> getCategoriesByName(String name) {
		return repo.getCategoriesByName(name);
	}
}
