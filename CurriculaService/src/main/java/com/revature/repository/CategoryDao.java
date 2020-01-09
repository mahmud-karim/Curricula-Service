package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Category;

public interface CategoryDao extends JpaRepository<Category, Integer>{

	
}
