package com.practice.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.Beans.Seasons;

public class Main 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
	
AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("App__Config.class");
Seasons s = ctx.getBean("seasons", Seasons.class);
s.get_Season(5);


	}
}
