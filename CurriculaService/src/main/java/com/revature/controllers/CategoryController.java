package com.revature.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.services.CategoryService;

import models.Category;

@RestController
@RequestMapping("/category")
public class CategoryController {
	private CategoryService cs;
	
	@Autowired
	public CategoryController(CategoryService cs) {
		this.cs = cs;
	}
	
	@PostMapping("/")
	public Category saveNewCategory(@Valid @RequestBody Category newCategory) {
		return cs.saveNewCategory(newCategory);
	}
	
}
