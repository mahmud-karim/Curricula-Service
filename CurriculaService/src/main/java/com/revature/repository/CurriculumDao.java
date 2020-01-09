package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.revature.models.Curriculum;

public interface CurriculumDao extends JpaRepository<Curriculum, Integer> {

	Curriculum findCurriculumByCurriculumName(String curriculumName);
	
}
