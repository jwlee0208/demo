package com.example.demo.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CityService;

@RestController
public class ApiController {
	
	@Autowired
	private CityService cityService;
	
	@GetMapping(path = "/helloWorld")
	public String helloWorld() {
		return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	}
	
	@GetMapping(path = "/now")
	public String getNow() throws Exception {
		return cityService.getNow();
	}
}
