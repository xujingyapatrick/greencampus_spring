package com.spring.greencampus.ems.mainapp.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.spring.greencampus.ems.mainapp.entity.SensorData;

public interface SensorDataRepository extends Repository<SensorData, Long>{
//	 List<Person> findByEmailAddressAndLastname(EmailAddress emailAddress, String lastname);
//
//	  // Enables the distinct flag for the query
//	  List<Person> findDistinctPeopleByLastnameOrFirstname(String lastname, String firstname);
//	  List<Person> findPeopleDistinctByLastnameOrFirstname(String lastname, String firstname);
//
//	  // Enabling ignoring case for an individual property
//	  List<Person> findByLastnameIgnoreCase(String lastname);
//	  // Enabling ignoring case for all suitable properties
//	  List<Person> findByLastnameAndFirstnameAllIgnoreCase(String lastname, String firstname);
//
//	  // Enabling static ORDER BY for a query
//	  List<Person> findByLastnameOrderByFirstnameAsc(String lastname);
//	  List<Person> findByLastnameOrderByFirstnameDesc(String lastname);
	List<SensorData> findById(long id);
	List<SensorData> findByTimestamp(Date timestamp);
	List<SensorData> findByTimestampBetween(Date start, Date end);
	Page<SensorData> findByTimestampBetween(Date start, Date end, Pageable pageable);
	
}
