package com.revature.services;


import java.util.List;

import com.revature.models.Visualization;



public interface VisualizationService {

	public Visualization findVisualizationById(int id);

	public List<Visualization> getAllVisualization();

	

}
