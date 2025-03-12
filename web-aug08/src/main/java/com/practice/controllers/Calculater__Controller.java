package com.practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Calculater__Controller {
	@RequestMapping("/Show_Calculater")
	public String show_Calculater() {
		new ModelAndView("Show__Calculater");
		return "Show__Calculater";
	}

	@RequestMapping("/Calculater")
	public String calculate(Model m, HttpServletRequest req) {
		Double value_1 = Double.valueOf(req.getParameter("value_1"));
		Double value_2 = Double.valueOf(req.getParameter("value_2"));
		Double result = 0D;
		switch (req.getParameter("option")) {
		case "+": {
					result = value_1 + value_2;
					break;
				  }
		
		case "-":{
					result=value_1-value_2;
					break;
				 }
		
		case "*" :{
					result=value_1*value_2;
					break;
				  }
		
		case "/" :{
					result=value_1/value_2;
					break;
				  }
		}
		m.addAttribute("result", result);
		return "Result";

	}
}
