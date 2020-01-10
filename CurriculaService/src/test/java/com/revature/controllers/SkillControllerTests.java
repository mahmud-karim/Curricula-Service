package com.revature.controllers;

import static org.mockito.Mockito.when;
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
import com.revature.models.Skill;
import com.revature.services.SkillService;

@WebMvcTest(controllers = SkillController.class)
public class SkillControllerTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@MockBean
	private SkillService ss;

	@Test
	public void testSaveNewCategory() throws Exception{
		
		Category mockCategory = new Category(1, "Programing Language");
		List<Skill> mockSkillList = new ArrayList<>();
		mockSkillList.add(new Skill(1,"Java",mockCategory));
		
		when(ss.getAllSkills()).thenReturn(mockSkillList);
		
		mockMvc.perform(post("/skills")
		        .contentType("application/json"))
		        .andExpect(status().isOk());
	}
	
	@Test
	public void testSaveNewSkill() throws Exception{
		
		Category mockCategory = new Category(1, "Programing Language");
		Skill mockSkill = new Skill(1,"Java",mockCategory);
		
		when(ss.saveNewSkill(Mockito.any(Skill.class))).thenReturn(mockSkill);
		
		mockMvc.perform(post("/skills")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(mockSkill)))
				.andExpect(status().isOk());
	}
}
