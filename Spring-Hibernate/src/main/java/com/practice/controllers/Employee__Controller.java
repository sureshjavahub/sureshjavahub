package com.practice.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.DAOs.Employee__DAO;
import com.practice.model.Beans.Employee;



@Controller


public class Employee__Controller 
{
	@Autowired
	private Employee__DAO dao;
@RequestMapping("/Enter_Employee")
public String enter_Employee(Model m)
{
	
	m.addAttribute(new Employee());
	return "Enter__Employee";
}


@RequestMapping("/SaveEmployee")
public String save_Employee(@Validated Employee employee, BindingResult error) 
{
	if(error.hasErrors())
		return "Enter__Employee";
	dao.save_Employee(employee);

	return "redirect:/Get_Employees";
}

@RequestMapping("/Enter_id")
public String enter_id()
{
	return "Enter__id";
}

@RequestMapping("/Get_Employees")
public String get_Employees(Model m)
{
	List<Employee> employees = dao.get_Employees();
	m.addAttribute("employees", employees);
	return "Show__Employees";
}


@RequestMapping("/Delete_Employee")
public String delete_Employee(@ModelAttribute Employee emp)
{
	dao.delete_Employee(emp.getId());
	return "redirect:/Get_Employees";
	
}

@RequestMapping("/EditEmployee")
public String edit_Employee(HttpServletRequest req,Model m)
{
	Employee employee = dao.get_Employee(Integer.valueOf(req.getParameter("id")));
	m.addAttribute(employee);
	return "Edit__Employee";
}

@RequestMapping("/Update_Employee")
public String update_Employee(@ModelAttribute Employee emp)
{
	/*Employee emp = dao.get_Employee(Integer.valueOf(req.getParameter("id")));
	System.out.println(emp);
	emp.setName(req.getParameter("name"));
	emp.setAddress(req.getParameter("address"));
	emp.setSal(Double.valueOf(req.getParameter("sal")));*/
	dao.edit_Employee(emp);
	return "redirect:/Get_Employees";
}

}
