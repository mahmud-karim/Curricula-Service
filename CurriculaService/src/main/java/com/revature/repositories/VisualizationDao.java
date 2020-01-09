package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Visualization;





public interface VisualizationDao  extends JpaRepository<Visualization, Integer> {
	public Visualization findVisualizationById(int id);


}
