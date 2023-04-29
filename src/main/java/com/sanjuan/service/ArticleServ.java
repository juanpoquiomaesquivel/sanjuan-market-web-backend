package com.sanjuan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjuan.model.Article;
import com.sanjuan.repository.ArticleRepo;

@Service
public class ArticleServ {

	@Autowired
	private ArticleRepo repo;

	public List<Article> getAllArticles() {
		return repo.findAll();
	}

	public Article getArticleByCode(String code) {
		return repo.getReferenceById(code);
	}

	public List<Article> getArticlesByName(String name) {
		return repo.getArticlesByName(name);
	}

	public List<Article> getArticlesByCategory(String category) {
		return repo.getArticlesByCategory(category);
	}

	public List<Article> getArticlesByProduct(String product) {
		return repo.getArticlesByProduct(product);
	}
}
