package com.practice.DAOs;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.practice.model.Beans.Employee;


public class Employee__DAO__Impl extends HibernateDaoSupport implements Employee__DAO {

	@Override
@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void save_Employee(Employee emp) {
		getHibernateTemplate().save(emp);
		

	}

	@Override
	public List<Employee> get_Employees() {
		
		
		return getHibernateTemplate().loadAll(Employee.class);
	}

	@Override
	public Employee get_Employee(Integer id) {
		
		
		return getHibernateTemplate().get(Employee.class, id);
	}

	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void delete_Employee(Integer id) 
	{
		
		Employee emp = this.get_Employee(id);
		getHibernateTemplate().delete(emp);
		

	}

	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void edit_Employee(Employee e) {
		getHibernateTemplate().update(e);

	}

}
