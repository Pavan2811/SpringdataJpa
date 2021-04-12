package com.springjpa.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpa.dao.SkillRepository;
import com.springjpa.model.Employee;
import com.springjpa.model.Skill;
@Service
public class SkillServiceImpl implements SkillService{
	  @Autowired
	    private SkillRepository skillRepo;
	  @Transactional 
	  public Skill get(int id) { 
	  return skillRepo.findById(id).get();
}
	  @Transactional 
		public void save(Skill skill) { 
			skillRepo.save(skill);
		}
}