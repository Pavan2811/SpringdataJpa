package com.springjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springjpa.model.Skill;
@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>{

}
