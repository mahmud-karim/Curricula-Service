package com.revature.services;


import java.util.List;

import com.revature.models.Visualization;



public interface VisualizationService {

	public Visualization findVisualizationByVisualizationName(String name);

	public List<Visualization> getAllVisualization();

	public Visualization createVisualization(Visualization v);

	

}
