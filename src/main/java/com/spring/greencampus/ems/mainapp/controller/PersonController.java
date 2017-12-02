package com.spring.greencampus.ems.mainapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.greencampus.ems.mainapp.dao.PersonDao;
import com.spring.greencampus.ems.mainapp.entity.Person;

@RestController
public class PersonController {
	@Autowired
	private PersonDao pd;
	
	@RequestMapping("/persons")
	public List<Person> showPeople(){
		return pd.findAll();
	}
	

}
