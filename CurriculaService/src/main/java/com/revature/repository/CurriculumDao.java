package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Curriculum;

public interface CurriculumDao extends JpaRepository<Curriculum, Integer> {

	Curriculum findCurriculumByCurriculumName(String curriculumName);
	
}
