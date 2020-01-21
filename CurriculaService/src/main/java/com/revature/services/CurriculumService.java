package com.revature.services;

import java.util.List;

import javax.validation.Valid;

import com.revature.models.Curriculum;

public interface CurriculumService {

	Curriculum createCurriculum(@Valid Curriculum newCurriculum);

	List<Curriculum> getAllCurriculum();
	
}