package com.practice.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Display__Names__Controller
{
	
	@RequestMapping("/returnAs")
	public ModelAndView returnAs()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Display_Names");
		return mv;
	}
	@RequestMapping("/return_ModelAndView")
public ModelAndView showNames_1()
{
	List<String> names=Arrays.asList("S","U","R","E","S","H");
	ModelAndView mv = new ModelAndView("shownames_1","names",names);
	return mv;
	
}
	@RequestMapping("/return_String")
	public String showNames_2(Model m)
	{
		List<String> names=List.of("s","u","r","e","s","h");
		m.addAttribute("names", names);
		return "shownames_1";
	}
}
