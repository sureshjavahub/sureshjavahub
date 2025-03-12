package com.practice.JCFs;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.practice.Beans.Student;

public class Student__RowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		
		return new Student(rs.getInt(1), rs.getString(2), rs.getFloat(3));
	}

}
