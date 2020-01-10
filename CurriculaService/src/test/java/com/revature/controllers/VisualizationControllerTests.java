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
import com.revature.models.Visualization;
import com.revature.services.VisualizationService;

@WebMvcTest(controllers = VisualizationController.class)
public class VisualizationControllerTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@MockBean
	private VisualizationService vs;

	@Test
	public void testGetAllVisualization() throws Exception{
		
		Category mockCategory = new Category(1, "Programing Language");
		List<Skill> mockSkillList = new ArrayList<>();
		mockSkillList.add(new Skill(1,"Java",mockCategory));
		List<Curriculum> mockCurriculumList = new ArrayList<>();
		mockCurriculumList.add(new Curriculum(1, "JavaReact", mockSkillList));
		List<Visualization> mockVisualizationList = new ArrayList<>();
		mockVisualizationList.add(new Visualization(1, "CapGemini", mockCurriculumList));
		
		when(vs.getAllVisualization()).thenReturn(mockVisualizationList);
		
		mockMvc.perform(get("/visualizations")
		        .contentType("application/json"))
		        .andExpect(status().isOk());
	}
	
	@Test
	public void testFindVisualizationByVisualizationName() throws Exception{
		
		Category mockCategory = new Category(1, "Programing Language");
		List<Skill> mockSkillList = new ArrayList<>();
		mockSkillList.add(new Skill(1,"Java",mockCategory));
		List<Curriculum> mockCurriculumList = new ArrayList<>();
		mockCurriculumList.add(new Curriculum(1, "JavaReact", mockSkillList));
		Visualization mockVisualization = new Visualization(1, "CapGemini", mockCurriculumList);
		
		when(vs.findVisualizationByVisualizationName(Mockito.anyString())).thenReturn(mockVisualization);
		
		mockMvc.perform(get("/visualizations/CapGemini")
		        .contentType("application/json"))
		        .andExpect(status().isOk());
	}
	
	@Test
	public void testCreateVisualization() throws Exception{
		Category mockCategory = new Category(1, "Programing Language");
		List<Skill> mockSkillList = new ArrayList<>();
		mockSkillList.add(new Skill(1,"Java",mockCategory));
		List<Curriculum> mockCurriculumList = new ArrayList<>();
		mockCurriculumList.add(new Curriculum(1, "JavaReact", mockSkillList));
		Visualization mockVisualization = new Visualization(1, "CapGemini", mockCurriculumList);
		
		when(vs.createVisualization(Mockito.any(Visualization.class))).thenReturn(mockVisualization);
		
		mockMvc.perform(post("/curricula")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(mockVisualization)))
				.andExpect(status().isOk());
	}
	
}
