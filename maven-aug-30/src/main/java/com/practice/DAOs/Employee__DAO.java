package com.practice.DAOs;

import java.util.List;

import com.practice.model.Employee;

public interface Employee__DAO 
{
void save_Employee(Employee e);
void update_Employee(Employee e);
void delete_Employee(Integer id);
Employee get_Employee(Integer id);
List<Employee> get_Employees();
List<Object[]> get_Employees_Name_Address();
}
