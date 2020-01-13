package com.revature.models;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CategoryTests {

	@Test
	public void testToString(){
		Category category = new Category(1, "CategoryName");
		
		assertEquals("Category [categoryId=" + category.getCategoryId() + ", categoryName=" + category.getCategoryName() + "]", category.toString());
	}
	
	@Test
	public void testHashCode() {
		Category category1 = new Category(1, "CategoryName");
		Category category2 = new Category(1, "CategoryName");
		
		assertEquals(category1.hashCode(),category2.hashCode());
	}
	
	@Test
	public void testEquals() {
		Category category1 = new Category(1, "CategoryName");
		Category category2 = new Category(1, "CategoryName");
		
		assertTrue(category1.equals(category2));
	}
}
