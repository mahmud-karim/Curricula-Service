package com.revature.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Skill;
import com.revature.services.SkillService;

@RestController
@RequestMapping("skill")
public class SkillController {
	private SkillService ss;
	
	@Autowired
	public SkillController(SkillService ss) {
		this.ss = ss;
	}
	
	@GetMapping("/")
	public List<Skill> getAllSkills(){
		return ss.getAllSkills();
	}
	
	@GetMapping("/byCurriculum")
	public List<Skill> getSkillsByCurriculum(@RequestParam int curriculumId){
		return ss.getSkillsByCurriculum(curriculumId);
	}
	
	@PostMapping("/")
	public Skill saveNewSkill(@Valid @RequestBody Skill newSkill) {
		return ss.saveNewSkill(newSkill);
	}
	
	@GetMapping("/byCategory")
	public List<Skill> getSkillsByCategory(@RequestParam int categoryId){
		return ss.getSkillsByCategor(categoryId);
	}
	
	
}
