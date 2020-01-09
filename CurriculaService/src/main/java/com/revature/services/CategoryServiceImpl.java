package com.revature.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Category;
import com.revature.repository.CategoryDao;


@Service
public class CategoryServiceImpl implements CategoryService{
	private CategoryDao cd;
	
	@Autowired
	public CategoryServiceImpl(CategoryDao cd) {
		this.cd = cd;
	}

	@Override
	public Category saveNewCategory(@Valid Category newCategory) {
		// TODO Auto-generated method stub
		return cd.save(newCategory);
	}
	

}
