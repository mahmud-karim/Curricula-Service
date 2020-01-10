package com.revature.controllers;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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
		when(cs.saveNewCategory(new Category(1, "Programing Language"))).thenReturn(mockCategory);
		
		mockMvc.perform(post("/category")
		        .contentType(MediaType.APPLICATION_JSON)
		        .content(objectMapper.writeValueAsString(mockCategory)))
		        .andExpect(status().isOk());
	}
}
