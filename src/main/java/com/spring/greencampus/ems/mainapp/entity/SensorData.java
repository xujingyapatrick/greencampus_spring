package com.spring.greencampus.ems.mainapp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="sensor_data")
public class SensorData {
	@Id
	@GeneratedValue
	private long id;
	private int sensorId;
	private double voltage;
	private double current;
	private double temperature;
	private double humidity;
	private Date timestamp;
	
	
	public SensorData() {
	}

	public SensorData(long id, int sensorId, double voltage, double current, double temperature, double humidity, Date timestamp) {
		super();
		this.id = id;
		this.sensorId=sensorId;
		this.voltage = voltage;
		this.current = current;
		this.temperature = temperature;
		this.humidity = humidity;
		this.timestamp = timestamp;
	}
	
	public SensorData(int sensorId, double voltage, double current, double temperature, double humidity, Date timestamp) {
		super();
		this.sensorId = sensorId;
		this.voltage = voltage;
		this.current = current;
		this.temperature = temperature;
		this.humidity = humidity;
		this.timestamp = timestamp;
	}
	public double getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	


	public int getSensorId() {
		return sensorId;
	}

	public void setSensorId(int sensorId) {
		this.sensorId = sensorId;
	}

	public double getVoltage() {
		return voltage;
	}
	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}
	public double getCurrent() {
		return current;
	}
	public void setCurrent(double current) {
		this.current = current;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
