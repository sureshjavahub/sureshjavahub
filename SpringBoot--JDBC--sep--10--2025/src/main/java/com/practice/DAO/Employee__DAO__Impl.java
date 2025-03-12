package com.practice.DAO;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.practice.model.Employee;


@Component
public class Employee__DAO__Impl implements Employee__DAO {

	static private String INSERT = "insert into employee (name, address,sal) values (?,?,?)";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void save_Employee(Employee emp) {
		jdbcTemplate.update(INSERT, emp.getName(), emp.getAddress(), emp.getSal());

	}

}
