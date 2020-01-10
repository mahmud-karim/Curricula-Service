package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Visualization;

public interface VisualizationDao  extends JpaRepository<Visualization, Integer> {

	Visualization findVisualizationByVisualizationName(String name);

	
	
}
