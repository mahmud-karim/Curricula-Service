package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Visualization;
import com.revature.services.VisualizationService;

@RestController
@RequestMapping("visualizations")
public class VisualizationController {
	
	private VisualizationService vs;
	
	@Autowired
	public VisualizationController(VisualizationService ps) {
		this.vs=ps;
	}
	
	@GetMapping
	public List<Visualization> getAllVisualization(){
		return vs.getAllVisualization();
	}
	
	@GetMapping("{id}")
	public Visualization findVisualizationById(@PathVariable int id) {
		return vs.findVisualizationById(id);
	}

}
