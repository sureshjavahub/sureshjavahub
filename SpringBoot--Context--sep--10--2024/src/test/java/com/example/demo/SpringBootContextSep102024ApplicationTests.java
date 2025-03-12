package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Employee;

@SpringBootTest
class SpringBootContextSep102024ApplicationTests 
{
	@Autowired
	private Employee emp;

	@Test
	void employeeBean() 
	{
		Assertions.assertNotNull(emp);
	}

}
