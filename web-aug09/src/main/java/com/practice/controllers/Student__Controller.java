package com.practice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.beans.Student;
import com.practice.model.DAO.Student__DAO;

@Controller
public class Student__Controller {
	@Autowired
	Student__DAO dao;

@RequestMapping("/get_All_Students")
public String get_All__Students(Model m)
{
	List<Student> students = dao.get_All_Students();
	m.addAttribute("students", students);
	return "Show__Students";
	
}
}
