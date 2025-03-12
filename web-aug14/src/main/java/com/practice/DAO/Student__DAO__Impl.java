package com.practice.DAO;

import static com.practice.DAO.Constants.DELETE;
import static com.practice.DAO.Constants.INSERT;
import static com.practice.DAO.Constants.SELECT;
import static com.practice.DAO.Constants.SELECT_ALL;
import static com.practice.DAO.Constants.UPDATE;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.practice.Beans.Student;

public class Student__DAO__Impl extends JdbcDaoSupport implements Student__DAO
{
	
	private RowMapper<Student> rowMapper;
	//private JdbcTemplate jdbcTemplate;

	public void setRowMapper(RowMapper<Student> rowMapper) {
		this.rowMapper = rowMapper;
	}

	@Override
	public List<Student> get_All_Student()
	{
		
		List<Student> students = getJdbcTemplate().query(SELECT_ALL, rowMapper);
		return students;
	}

	@Override
	public Integer save_Student(Student st) 
	{
		Integer k = getJdbcTemplate().update(INSERT, st.getId(), st.getName(),st.getFee());
		return k;
	}

	@Override
	public void delete_Student(Integer id)
	{
		getJdbcTemplate().update(DELETE, id);
		
		
	}

	@Override
	public List<Student> get_Student(Integer id)
	{
		List<Student> student = getJdbcTemplate().query(SELECT,rowMapper,id);
		return student;
	}

	@Override
	public void update_Student(Student s) 
	{
	getJdbcTemplate().update(UPDATE, s.getName(),s.getFee(),s.getId());	
		
	}

}
