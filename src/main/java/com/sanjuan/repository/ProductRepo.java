package com.sanjuan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sanjuan.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, String> {
	
	@Query(value = "SELECT p FROM Product p WHERE p.name LIKE '%' + :name + '%'")
	public List<Product> getProductsByName(@Param("name") String name);
	
	@Query(value = "SELECT p FROM Product p WHERE p.category = :category")
	public List<Product> getProductsByCategory(@Param("category") String category);
}
