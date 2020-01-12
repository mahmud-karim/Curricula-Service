package com.revature.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Category;
import com.revature.repositories.CategoryDao;


@Service
public class CategoryServiceImpl implements CategoryService{
	private CategoryDao cd;
	
	@Autowired
	public CategoryServiceImpl(CategoryDao cd) {
		this.cd = cd;
	}

	@Override
	public Category saveNewCategory(@Valid Category newCategory) {
		return cd.save(newCategory);
	}

	@Override
	public List<Category> getAllCategories() {
		return cd.findAll();
	}
	

}
