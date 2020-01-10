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
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Category;
import com.revature.models.Curriculum;
import com.revature.models.Skill;
import com.revature.services.CurriculumService;

@WebMvcTest(controllers = CurriculumController.class)
public class CurriculumControllerTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@MockBean
	private CurriculumService cs;

	@Test
	public void testGetAll() throws Exception{
		
		Category mockCategory = new Category(1, "Programing Language");
		List<Skill> mockSkillList = new ArrayList<>();
		mockSkillList.add(new Skill(1,"Java",mockCategory));
		List<Curriculum> mockCurriculumList = new ArrayList<>();
		mockCurriculumList.add(new Curriculum(1, "JavaReact", mockSkillList));
		
		when(cs.getAllCurriculum()).thenReturn(mockCurriculumList);
		
		mockMvc.perform(get("/curricula")
		        .contentType("application/json"))
		        .andExpect(status().isOk());
	}
	
	@Test
	public void testCreate() throws Exception{
		Category mockCategory = new Category(1, "Programing Language");
		List<Skill> mockSkillList = new ArrayList<>();
		mockSkillList.add(new Skill(1,"Java",mockCategory));
		Curriculum mockCurriculum = new Curriculum(1, "JavaReact", mockSkillList);
		
		when(cs.createCurriculum(Mockito.any(Curriculum.class))).thenReturn(mockCurriculum);
		
		mockMvc.perform(post("/curricula")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(mockCurriculum)))
				.andExpect(status().isOk());
	}
}
