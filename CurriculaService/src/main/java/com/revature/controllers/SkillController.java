package com.revature.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Skill;
import com.revature.services.SkillService;

@RestController
@RequestMapping("skills")
public class SkillController {
	private SkillService ss;
	
	@Autowired
	public SkillController(SkillService ss) {
		this.ss = ss;
	}
	
	@GetMapping
	public List<Skill> getAllSkills(){
		return ss.getAllSkills();
	}
	
	@PostMapping
	public Skill saveNewSkill(@Valid @RequestBody Skill newSkill) {
		return ss.saveNewSkill(newSkill);
	}
}
