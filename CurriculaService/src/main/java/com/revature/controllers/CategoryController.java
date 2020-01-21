package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Category;
import com.revature.models.Category_DTO;
import com.revature.services.CategoryService;

@RestController
@RequestMapping("categories")
public class CategoryController {
	
	private CategoryService cs;
	
	@Autowired
	public CategoryController(CategoryService cs) {
		this.cs = cs;
	}
	
	@PostMapping
	public Category saveNewCategory( @RequestBody Category_DTO newCategory) {
		Category submitCategory = new Category(newCategory.getCategoryId(), newCategory.getCategoryName());
		return cs.saveNewCategory(submitCategory);
	}
	
	@GetMapping
	public List<Category> getAllCategories(){
		return cs.getAllCategories();
	}	
}