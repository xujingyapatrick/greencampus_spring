package com.spring.greencampus.ems.mainapp.dao;

import java.util.List;

import com.spring.greencampus.ems.mainapp.entity.SensorData;

public interface CustomSensorInterface {
	public List<SensorData> returnAllentities();
	public SensorData updateEntity(SensorData sensorData);

}
