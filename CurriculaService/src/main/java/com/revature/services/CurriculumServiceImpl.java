package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.configuration.Config;
import com.revature.exceptions.TooManyCategoriesException;
import com.revature.models.Category;
import com.revature.models.Curriculum;
import com.revature.models.Skill;
import com.revature.repositories.CurriculumDao;

@Service
public class CurriculumServiceImpl implements CurriculumService {
	private CurriculumDao cd;
	private Config config;
	@Autowired
	public CurriculumServiceImpl(CurriculumDao cd, Config config) {
		this.cd = cd;
		this.config=config;
	}	
	
	@Override
	public Curriculum createCurriculum(@Valid Curriculum newCurriculum) {
		List<Category> categories = new ArrayList<>();
		for(Skill skill: newCurriculum.getSkills()) {
			if(!categories.contains(skill.getCategory())) {
				categories.add(skill.getCategory());
			}
		}
		if(config.getCategories() < categories.size()) {
			throw new TooManyCategoriesException();
		} else {
			return cd.save(newCurriculum);
		}
	}

	@Override
	public List<Curriculum> getAllCurriculum() {
		return cd.findAll();
	}

}