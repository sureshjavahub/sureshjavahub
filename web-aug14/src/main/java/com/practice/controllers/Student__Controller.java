package com.practice.controllers;

import java.util.List;

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
public String get_All_Students(Model m)
{
	List<Student> students = dao.get_All_Student();
	m.addAttribute("students", students);
	return "Show__Students";
}

@RequestMapping("/enter_Student")
public String enter_Student()
{
	
	return "Enter__Student";
}


 @RequestMapping("/save_Student")
public String save_Student(HttpServletRequest req)
{
	Student student = new Student(req.getParameter("name"),Float.valueOf(req.getParameter("fee")));
	Integer k=dao.save_Student(student);
	ModelAndView mv = new ModelAndView("Student__Added","k", k);
	return "redirect:get_All_Students";
	
}
 
 
 @RequestMapping("/Delete_Student")
 public String delete_Student(HttpServletRequest req)
 {
	 Integer id = Integer.valueOf(req.getParameter("id"));
	 dao.delete_Student(id);
	 return "redirect:/get_All_Students";
 }
 
 @RequestMapping("/Edit_Student")
 
 public ModelAndView edit_Student(HttpServletRequest req,Model m)
 {
	 Integer id = Integer.valueOf(req.getParameter("id"));
	 Student student = dao.get_Student(id).get(0);
	 ModelAndView mv = new ModelAndView("Edit__Student","student", student);
	 return mv;
 }
 
 @RequestMapping("/Update_Student")
 public String update_Student(HttpServletRequest req)
 {
	 Integer id = Integer.valueOf(req.getParameter("id"));
	 String name = req.getParameter("name");
	 Float fee = Float.valueOf(req.getParameter("fee"));
	 Student student = new Student(id, name, fee);
	 dao.update_Student(student);
	 return "redirect:/get_All_Students";
 }

}
