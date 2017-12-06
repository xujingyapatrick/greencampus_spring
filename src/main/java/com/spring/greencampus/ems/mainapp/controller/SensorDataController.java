package com.spring.greencampus.ems.mainapp.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.greencampus.ems.mainapp.dao.CustomSensorRepository;
import com.spring.greencampus.ems.mainapp.entity.SensorData;

@RestController
public class SensorDataController {
	@Autowired
	private CustomSensorRepository customRepo;

	@RequestMapping("/sensordata")
	public List<SensorData> getAllSensorData() {
		return customRepo.returnAllentities();
	}

	@RequestMapping("/sensordata/{date}")
	public List<SensorData> getSensorDataByTimestamp(@PathVariable("date") String date) {
		String patternString = "yyy-MM-dd";
		SimpleDateFormat smDateFormat = new SimpleDateFormat(patternString);
		Date sd = new Date();

		try {
			sd = smDateFormat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(sd);
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		Date ed = calendar.getTime();

		return customRepo.findByTimestampBetween(sd, ed);

	}

	@RequestMapping("/sensordata/{start}/{end}")
	public List<SensorData> getSensorDataBetween(@PathVariable("start") String start, @PathVariable("end") String end) {
		String patternString = "yyy-MM-dd";
		SimpleDateFormat smDateFormat = new SimpleDateFormat(patternString);
		Date sDate = new Date();
		Date eDate = new Date();

		try {
			sDate = smDateFormat.parse(start);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			eDate = smDateFormat.parse(end);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customRepo.findByTimestampBetween(sDate, eDate);
	}

	@RequestMapping(value = "/sensordata", method = RequestMethod.POST)
	public List<SensorData> insertNewData(@RequestBody List<SensorData> sensordata) {

		sensordata.stream().forEach(c -> customRepo.updateEntity(c));
		return sensordata;
	}

}
