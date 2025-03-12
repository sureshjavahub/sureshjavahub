package com.practice.model.DAO;

import static com.practice.model.DAO.Queries.*;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.practice.beans.Student;

public class Student__DAO__Impl extends JdbcDaoSupport implements Student__DAO {

	private RowMapper<Student> rowMapper;
	//private JdbcTemplate jdbcTemplate=this.getJdbcTemplate();
	

	public void setRowMapper(RowMapper<Student> rowMapper) {
		this.rowMapper = rowMapper;
	}


	@Override
	public List<Student> get_All_Students() 
	{
		List<Student> students = getJdbcTemplate().query(SELECT, rowMapper);
		return students;
	}

}
