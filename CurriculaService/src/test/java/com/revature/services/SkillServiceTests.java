package com.revature.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.revature.models.Category;
import com.revature.models.Skill;
import com.revature.repositories.SkillDao;

@ExtendWith(MockitoExtension.class)
public class SkillServiceTests {

	@Mock
	private SkillDao sd;
	
	@InjectMocks
	private SkillServiceImpl skillService;
	
	@Test
	public void testGetAllSkills() {
		List<Skill> mockAllSkills = new ArrayList<Skill>();
		mockAllSkills.add(new Skill(1, "Skill1", new Category(1, "Category1")));
		mockAllSkills.add(new Skill(2, "Skill2", new Category(1, "Category1")));
		
		when(sd.findAll()).thenReturn(mockAllSkills);
		
		assertEquals(2, sd.findAll().size());
		assertEquals("Skill1", sd.findAll().get(0).getSkillName());
	}
	
	@Test
	public void testSaveNewSkill() {
		Skill mockSkill = new Skill(1, "Skill1", new Category(1, "Category1"));
		
		when(sd.save(Mockito.any(Skill.class))).thenReturn(mockSkill);
		
		assertEquals(mockSkill, sd.save(mockSkill));
	}
}
