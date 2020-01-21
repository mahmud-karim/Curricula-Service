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

import com.revature.configuration.Config;
import com.revature.models.Category;
import com.revature.models.Curriculum;
import com.revature.models.Skill;
import com.revature.models.Visualization;
import com.revature.repositories.VisualizationDao;

@ExtendWith(MockitoExtension.class)
public class VisualizationServiceImplTests {

	@Mock
	private VisualizationDao vd;
	
	@Mock
	private Config config;
	
	@InjectMocks
	private VisualizationServiceImpl visualizationService;
	
	@Test
	public void testGetAllVisualization() {
		List<Visualization> mockAllVisualizations = new ArrayList<>();
		mockAllVisualizations.add(new Visualization(1, "Visualization1", new ArrayList<Curriculum>()));
		mockAllVisualizations.add(new Visualization(2, "Visualization2", new ArrayList<Curriculum>()));
		
		when(vd.findAll()).thenReturn(mockAllVisualizations);
		
		assertEquals(2, vd.findAll().size());
		assertEquals("Visualization1", visualizationService.getAllVisualization().get(0).getVisualizationName());
	}
	
	@Test
	public void testFindVisualizationByVisualizationName() {
		Visualization mockVisualization = new Visualization(1, "Visualization1", new ArrayList<Curriculum>());
		
		when(vd.findVisualizationByVisualizationName(Mockito.anyString())).thenReturn(mockVisualization);
		
		assertEquals(mockVisualization, visualizationService.findVisualizationByVisualizationName("Visualization1"));
	}
	
	@Test
	public void testCreateVisualization() {
		List<Skill> skills = new ArrayList<>();
		skills.add(new Skill(1, "skill1", new Category(1, "cat1")));
		List<Curriculum> curricula = new ArrayList<>();
		curricula.add(new Curriculum(1, "curr1", skills));
		Visualization mockVisualization = new Visualization(1, "Visualization1", curricula);

		System.out.println(config);
		
		when(config.getCategories()).thenReturn(12);
		when(vd.save(Mockito.any(Visualization.class))).thenReturn(mockVisualization);
		
		assertEquals(mockVisualization, visualizationService.createVisualization(mockVisualization));
	}
}
