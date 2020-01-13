package com.revature.models;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VisualizationTests {

	@Test
	public void testToString() {
		Visualization visualization = new Visualization(1, "VisualizationName", new ArrayList<Curriculum>());
		
		assertEquals("Visualization [visualizationId=" + visualization.getVisualizationId() + ", visualizationName=" + visualization.getVisualizationName() + ", curricula=" + visualization.getCurricula() + "]"
					, visualization.toString());
	}
	
	@Test
	public void testHashCode() {
		Visualization visualization1 = new Visualization(1, "VisualizationName", new ArrayList<Curriculum>());
		Visualization visualization2 = new Visualization(1, "VisualizationName", new ArrayList<Curriculum>());

		assertEquals(visualization1.hashCode(), visualization2.hashCode());
	}
	
	@Test
	public void testEquals() {
		Visualization visualization1 = new Visualization(1, "VisualizationName", new ArrayList<Curriculum>());
		Visualization visualization2 = new Visualization(1, "VisualizationName", new ArrayList<Curriculum>());

		assertTrue(visualization1.equals(visualization2));
	}
}
