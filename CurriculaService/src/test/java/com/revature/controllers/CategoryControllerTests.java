package com.revature.controllers;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Category;
import com.revature.services.CategoryService;

@WebMvcTest(controllers = CategoryController.class)
public class CategoryControllerTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@MockBean
	private CategoryService cs;

	@Test
	public void testSaveNewCategory() throws Exception{
		
		Category mockCategory = new Category(1, "Programing Language");
		when(cs.saveNewCategory(Mockito.any(Category.class))).thenReturn(mockCategory);
		
		mockMvc.perform(post("/categories")
		        .contentType(MediaType.APPLICATION_JSON)
		        .content(objectMapper.writeValueAsString(mockCategory)))
		        .andExpect(status().isOk());
	}
	
	@Test
	public void testGetAllCategories() throws Exception {
		
		List<Category> mockAllCategories = new ArrayList<>();
		mockAllCategories.add(new Category(1, "Programing Language"));
		when(cs.getAllCategories()).thenReturn(mockAllCategories);
		
		mockMvc.perform(get("/categories")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}
}
