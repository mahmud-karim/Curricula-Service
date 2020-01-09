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
	public Visualization findVisualizationById(int id) {
		// TODO Auto-generated method stub
		return vd.getOne(id);
	}

	@Override
	public List<Visualization> getAllVisualization() {
		// TODO Auto-generated method stub
		return vd.findAll();
	}

}
