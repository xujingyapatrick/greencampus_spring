package com.spring.greencampus.ems.mainapp.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.greencampus.ems.mainapp.entity.SensorData;

@Repository
@Transactional
public class CustomSensorInterfaceImpl implements CustomSensorInterface{
	@PersistenceContext
	private EntityManager entityManager;
	public List<SensorData> returnAllentities(){
		return entityManager.createQuery("select p from SensorData p").getResultList();
	}
	public SensorData updateEntity(SensorData sensorData){
		return entityManager.merge(sensorData);
	} 
	
}
