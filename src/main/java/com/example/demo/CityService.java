package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.CityMapper;

@Service
public class CityService {
	
	@Autowired
	private CityMapper cityMapper;
	
	public String getNow() throws Exception {
		return cityMapper.getNow();
	}
}
