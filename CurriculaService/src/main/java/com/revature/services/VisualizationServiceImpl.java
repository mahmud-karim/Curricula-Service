package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.configuration.Config;
import com.revature.exceptions.TooManyCategoriesException;
import com.revature.models.Category;
import com.revature.models.Curriculum;
import com.revature.models.Skill;
import com.revature.models.Visualization;
import com.revature.repositories.VisualizationDao;

@Service
public class VisualizationServiceImpl implements VisualizationService{
	private VisualizationDao vd;
	private Config config;
	@Autowired
	public VisualizationServiceImpl(VisualizationDao vd, Config config) {
		this.vd=vd;
		this.config=config;
	}
	

	@Override
	public Visualization findVisualizationByVisualizationName(String name) {
		return vd.findVisualizationByVisualizationName(name);

	}

	@Override
	public List<Visualization> getAllVisualization() {
		return vd.findAll();
	}

	@Override
	public Visualization createVisualization(Visualization v) {
		List<Category> categories = new ArrayList<>();
		for (Curriculum curriculum: v.getCurricula()) {
			for(Skill skill: curriculum.getSkills()) {
				if(!categories.contains(skill.getCategory())) {
					categories.add(skill.getCategory());
				}
			}
		}
		if(config.getCategories() < categories.size()) {
			throw new TooManyCategoriesException();
		} else {
			return vd.save(v);
		}
	}

}

