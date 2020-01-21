package com.revature.services;

import java.util.List;

import javax.validation.Valid;

import com.revature.models.Skill;

public interface SkillService {
	public List<Skill> getAllSkills();
	public Skill saveNewSkill(@Valid Skill newSkill);
}
