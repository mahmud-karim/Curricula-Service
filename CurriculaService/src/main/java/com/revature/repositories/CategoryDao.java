package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Category;

public interface CategoryDao extends JpaRepository<Category, Integer>{
	
}