package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Visualization;
import com.revature.repositories.VisualizationDao;
@Service
public class VisualizationServiceImpl implements VisualizationService{
	private VisualizationDao vd;
	
	@Autowired
	public VisualizationServiceImpl(VisualizationDao vd) {
		this.vd=vd;
		
	}

	@Override
	public Visualization findVisualizationByVisualizationName(String name) {
		// TODO Auto-generated method stub
		return vd.findVisualizationByVisualizationName(name);
	}

	@Override
	public List<Visualization> getAllVisualization() {
		// TODO Auto-generated method stub
		return vd.findAll();
	}

	@Override
	public Visualization createVisualization(Visualization v) {
		// TODO Auto-generated method stub
		return vd.save(v);
	}

}
