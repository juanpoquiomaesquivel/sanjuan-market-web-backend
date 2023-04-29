package com.sanjuan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sanjuan.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, String> {

	@Query(value = "SELECT c FROM Category c WHERE c.name LIKE '%' + :name + '%'")
	public List<Category> getCategoriesByName(@Param("name") String name);
}
