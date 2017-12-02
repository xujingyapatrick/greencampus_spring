package com.spring.greencampus.ems.mainapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.greencampus.ems.mainapp.entity.Person;

@Repository
public class PersonDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<Person> findAll(){
		return jdbcTemplate.query("SELECT * FROM PERSON", new BeanPropertyRowMapper(Person.class));
	}
	

}
