package com.practice.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentController

{
@RequestMapping("/showStudent")
public ModelAndView showStudent()
{
	ModelAndView mv = new ModelAndView("student");
	String name="suresh";
	Date date = new Date();
	mv.addObject("name", name);
	mv.addObject("date", date);
	return mv;
}
@RequestMapping("/showEmployee")
public ModelAndView showEmployee()
{
	return new ModelAndView("employee");
}
}
