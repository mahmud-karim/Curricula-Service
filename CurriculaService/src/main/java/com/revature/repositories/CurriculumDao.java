package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Curriculum;

public interface CurriculumDao extends JpaRepository<Curriculum, Integer> {
	
}
