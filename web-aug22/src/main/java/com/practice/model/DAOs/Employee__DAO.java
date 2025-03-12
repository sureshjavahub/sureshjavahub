package com.practice.model.DAOs;

import java.util.List;

import com.practice.model.Beans.Employee;

public interface Employee__DAO
{
	public void save_Employee(Employee emp);
	public List<Employee> get_Employees();
	public List<Employee> get_Employee(Integer id);
	public void delete_Employee(Integer id);
	public void edit_Employee(Employee e);
	 
}
