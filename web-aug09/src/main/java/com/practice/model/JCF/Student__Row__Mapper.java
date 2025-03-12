package com.practice.model.JCF;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.practice.beans.Student;

public class Student__Row__Mapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
    
		return new Student(rs.getInt(1),rs.getString(2),rs.getFloat(3));
	}

}
