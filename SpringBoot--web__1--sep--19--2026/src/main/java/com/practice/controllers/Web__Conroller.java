package com.practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Web__Conroller {

	@RequestMapping("/")
	public String hello()
	{
		return "index";
		
	}
	
}
