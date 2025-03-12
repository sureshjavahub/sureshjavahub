package com.practice.Beans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("seasons")
public class Seasons 

{
	@Autowired
	private LocalTime lt;
	
	
	public void get_Season(Integer month)
	{
	if(month>=2&&month<=5)
		System.out.println("it is Summer season");
	
	else if(month>=6&&month<=9)
		System.out.println("it is Rainy season");
	
	else 
		System.out.println("it is Winter season");
	
	}


	
	

}
