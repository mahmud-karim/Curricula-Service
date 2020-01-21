package com.revature.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Curriculum;
import com.revature.models.Curriculum_DTO;
import com.revature.services.CurriculumService;

@RestController
@RequestMapping("curricula")
public class CurriculumController {
	private CurriculumService cs;
	
	@Autowired
	public CurriculumController(CurriculumService cs) {
		this.cs = cs;
	}
	
	@PostMapping
	public Curriculum create(@Valid @RequestBody Curriculum_DTO newCurriculum) {
		Curriculum submitCurriculum = new Curriculum(newCurriculum.getCurriculumId(), newCurriculum.getCurriculumName(), newCurriculum.getSkills());
		return cs.createCurriculum(submitCurriculum);
	}
	
	@GetMapping
	public List<Curriculum> getAll() {
		return cs.getAllCurriculum();
	}
}