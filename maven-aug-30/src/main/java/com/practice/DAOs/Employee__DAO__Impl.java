package com.practice.DAOs;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.practice.model.Employee;

public class Employee__DAO__Impl implements Employee__DAO {
	private static Session sess=null;

	@Override
	public void save_Employee(Employee e)
	{
		Transaction tx = sess.beginTransaction();
		sess.persist(e);
		tx.commit();

	}

	@Override
	public void update_Employee(Employee e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete_Employee(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee get_Employee(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	static
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		sess = sessionFactory.openSession();
		
	}

	@Override
	public List<Employee> get_Employees() {
		Query query = sess.createQuery("from Employee");
		List<Employee> employees = query.getResultList();
		
		
		return employees;
	}

	@Override
	public List<Object[]> get_Employees_Name_Address() {
		Query<Object[]> query = sess.createQuery("select name,address from Employee");
		List<Object[]> details = query.getResultList();
		
		return details;
	}

}
