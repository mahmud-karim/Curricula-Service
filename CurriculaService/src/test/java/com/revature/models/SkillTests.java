package com.revature.models;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SkillTests {

	@Test
	public void testToString() {
		Skill skill = new Skill(1, "SKillName", new Category());
		
		assertEquals("Skill [skillId=" + skill.getSkillId() + ", skillName=" + skill.getSkillName() + ", category=" + skill.getCategory() + "]", skill.toString());
	}
	
	@Test
	public void testHashCode() {
		Skill skill1 = new Skill(1, "SKillName", new Category());
		Skill skill2 = new Skill(1, "SKillName", new Category());

		assertEquals(skill1.hashCode(), skill2.hashCode());
	}
	
	@Test
	public void testEquals() {
		Skill skill1 = new Skill(1, "SKillName", new Category());
		Skill skill2 = new Skill(1, "SKillName", new Category());
		
		assertTrue(skill1.equals(skill2));
	}
}
