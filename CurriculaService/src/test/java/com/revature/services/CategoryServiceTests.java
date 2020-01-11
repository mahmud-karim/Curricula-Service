package com.revature.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.revature.models.Category;
import com.revature.repositories.CategoryDao;

@ExtendWith(MockitoExtension.class)
public class CategoryServiceTests {
	@Mock
	private CategoryDao cd;
	
	@InjectMocks
	private CategoryServiceImpl categoryService;
		
	@Test
	public void testSaveNewCategory() {
		Category expected = new Category(1, "Programing Language");
		
		when(cd.save(Mockito.any(Category.class))).thenReturn(expected);
		
		assertEquals(expected, cd.save(expected));
	}
}
