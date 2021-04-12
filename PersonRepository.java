package com.springjpa.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springjpa.model.Person;
 
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	@Modifying
	@Query("update Person p set p.age = :age where p.id = :id")
	int updatePersonAge(@Param("age") int age,@Param("id") long id);
}
