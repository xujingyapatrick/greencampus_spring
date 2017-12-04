package com.spring.greencampus.ems.mainapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	@RequestMapping("/map")
	public Map<String, String> showMap(){
		Map<String, String> map = new HashMap<>();
		map.put("id", "72673");
		map.put("key", "thisisatest");
		
		return map;
	}
	

}
