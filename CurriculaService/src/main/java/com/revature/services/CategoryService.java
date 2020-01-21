package com.revature.services;

import java.util.List;

import javax.validation.Valid;

import com.revature.models.Category;

public interface CategoryService {

	Category saveNewCategory(@Valid Category newCategory);

	List<Category> getAllCategories();

}