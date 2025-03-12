package com.practice.model.DAOs;

import static com.practice.model.DAOs.Constants.*;


 
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.practice.model.Beans.Employee;

public class Employee__DAO__Impl extends JdbcDaoSupport implements Employee__DAO {
	private RowMapper rowMapper;

	public void setRowMapper(RowMapper rowMapper) {
		this.rowMapper = rowMapper;
	}

	@Override
	public void save_Employee(Employee emp) {
		getJdbcTemplate().update(INSERT, emp.getName(), emp.getAddress(), emp.getSal());

	}

	@Override
	public List<Employee> get_Employees() {
		
		return getJdbcTemplate().query(GET_ALL, rowMapper);
	}

	@Override
	public List<Employee> get_Employee(Integer id) {
		
		return getJdbcTemplate().query(GET_ONE, new Object[]{id},rowMapper);
	}

	@Override
	public void delete_Employee(Integer id) {
		getJdbcTemplate().update(DELETE, id);
		
	}

	@Override
	public void edit_Employee(Employee e) {
		getJdbcTemplate().update(UPDATE, e.getName(),e.getAddress(),e.getSal(),e.getId());
	}

}
