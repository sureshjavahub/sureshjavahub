package com.practice.DAO;

import static com.practice.DAO.Constants.INSERT;
 
import static com.practice.DAO.Constants.SELECT_ALL;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.web.servlet.ModelAndView;

import com.practice.Beans.Student;

public class Student__DAO__Impl extends JdbcDaoSupport implements Student__DAO
{
	
	private RowMapper<Student> rowMapper;
	private JdbcTemplate jdbcTemplate =getJdbcTemplate();

	public void setRowMapper(RowMapper<Student> rowMapper) {
		this.rowMapper = rowMapper;
	}

	@Override
	public List<Student> get_All_Student() {
		List<Student> students = jdbcTemplate.query(SELECT_ALL, rowMapper);
		return students;
	}

	@Override
	public Integer save_Student(Student st) 
	{
		Integer k = jdbcTemplate.update(INSERT, st.getId(), st.getName(),st.getFee());
		return k;
	}

}
