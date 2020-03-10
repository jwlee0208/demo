package com.example.demo.mapper;

import org.springframework.stereotype.Repository;

@Repository
public interface CityMapper {
	public String getNow() throws Exception;
}
