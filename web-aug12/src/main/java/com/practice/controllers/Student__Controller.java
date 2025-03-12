package com.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.practice.Beans.Student;
import com.practice.DAO.Student__DAO;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Student__Controller
{
	@Autowired
	private Student__DAO dao;
	
@RequestMapping("/get_All_Students")
public String get_All_Students()
{
	
	return "Show__Students";
}

@RequestMapping("/enter_Student")
public String enter_Student(Model m)
{
	m.addAttribute("Enter__Student");
	return "Enter__Student";
}


 @RequestMapping("/save_Student")
public ModelAndView save_Student(HttpServletRequest req)
{
	Student student = new Student(Integer.valueOf(req.getParameter("id")), req.getParameter("name"),Float.valueOf(req.getParameter("fee")));
	Integer k=dao.save_Student(student);
	ModelAndView mv = new ModelAndView("Student__Added","k", k);
	return mv;
}

}
