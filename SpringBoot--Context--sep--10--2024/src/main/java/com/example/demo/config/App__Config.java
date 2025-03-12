package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entities.Employee;

@Configuration
public class App__Config 
{
	@Bean()
	public Employee emp()
	{
		return new Employee();
	}

}
