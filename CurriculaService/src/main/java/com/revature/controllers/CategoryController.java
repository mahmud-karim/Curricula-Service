package com.revature.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Category;
import com.revature.services.CategoryService;

@RestController
@RequestMapping("category")
public class CategoryController {
	
	private CategoryService cs;
	
	@Autowired
	public CategoryController(CategoryService cs) {
		this.cs = cs;
	}
	
	@PostMapping
	public Category saveNewCategory( @RequestBody Category newCategory) {
		return cs.saveNewCategory(newCategory);
	}
	
}
