package com.practice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.practice.DAO.Employee__DAO;
import com.practice.model.Employee;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootTest
class SpringBootJdbcSep102025ApplicationTests {
@Autowired
	Employee__DAO dao;
	@Test
	void test_Save_Employee() 
	{
		Employee emp = new Employee("sdf", "hyd", 38859d);
		dao.save_Employee(emp);
		log.info("hello");
		System.out.println("employee sucessfully saved");
		
	}

}
