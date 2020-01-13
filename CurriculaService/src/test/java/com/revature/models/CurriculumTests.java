package com.revature.models;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CurriculumTests {

	@Test
	public void testToString() {
		Curriculum curriculum = new Curriculum(1, "CurriculumName", new ArrayList<>());
		
		assertEquals("Curriculum [curriculumId=" + curriculum.getCurriculumId() + ", curriculumName=" + curriculum.getCurriculumName() + ", skills=" + curriculum.getSkills() + "]"
					, curriculum.toString());
	}
	
	@Test
	public void testHashCode() {
		Curriculum curriculum1 = new Curriculum(1, "CurriculumName", new ArrayList<>());
		Curriculum curriculum2 = new Curriculum(1, "CurriculumName", new ArrayList<>());

		assertEquals(curriculum1.hashCode(), curriculum2.hashCode());
	}
	
	@Test
	public void testEquals() {
		Curriculum curriculum1 = new Curriculum(1, "CurriculumName", new ArrayList<>());
		Curriculum curriculum2 = new Curriculum(1, "CurriculumName", new ArrayList<>());
		
		assertTrue(curriculum1.equals(curriculum2));
	}
}
