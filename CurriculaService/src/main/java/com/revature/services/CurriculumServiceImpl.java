package com.revature.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Curriculum;
import com.revature.repository.CurriculumDao;

@Service
public class CurriculumServiceImpl implements CurriculumService {
	private CurriculumDao cd;
	
	@Autowired
	public CurriculumServiceImpl(CurriculumDao cd) {
		this.cd = cd;
	}

	@Override
	public Curriculum createCurriculum(@Valid Curriculum newCurriculum) {
		// TODO Auto-generated method stub
		return cd.save(newCurriculum);
	}

	@Override
	public List<Curriculum> getAllCurriculum() {
		// TODO Auto-generated method stub
		return cd.findAll();
	}

	@Override
	public Curriculum getByCurriculumName(String curriculumName) {
		// TODO Auto-generated method stub
		return cd.findCurriculumByCurriculumName(curriculumName);
	}

}
