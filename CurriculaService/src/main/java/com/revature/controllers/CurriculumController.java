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

import com.revature.models.Curriculum;
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
	public Curriculum create(@Valid @RequestBody Curriculum newCurriculum) {
		return cs.createCurriculum(newCurriculum);
	}
	
	@GetMapping
	public List<Curriculum> getAll() {
		return cs.getAllCurriculum();
	}
	
	@GetMapping("/name"
			+ "")
	public Curriculum getByName(@RequestParam String curriculumName) {
		return cs.getByCurriculumName(curriculumName);
	}
}
