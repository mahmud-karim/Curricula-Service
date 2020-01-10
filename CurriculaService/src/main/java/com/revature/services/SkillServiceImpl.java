package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Category;
import com.revature.models.Skill;
import com.revature.repository.SkillDao;

@Service
public class SkillServiceImpl implements SkillService{
	
	private SkillDao sd;
	
	@Autowired
	public SkillServiceImpl(SkillDao sd) {
		this.sd = sd;
	}

	@Override
	public List<Skill> getAllSkills() {
		// TODO Auto-generated method stub
		return sd.findAll();
	}

	@Override
	public Skill saveNewSkill(Skill newSkill) {
		// TODO Auto-generated method stub
		return sd.save(newSkill);
	}

	@Override
	public List<Skill> getSkillsByCategory(Category categoryId) {
		// TODO Auto-generated method stub
		return sd.findSkillByCategory(categoryId);
	}
}
