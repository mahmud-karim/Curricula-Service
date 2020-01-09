package com.revature.services;

import javax.validation.Valid;

import models.Category;


public interface CategoryService {

	Category saveNewCategory(@Valid Category newCategory);

}
