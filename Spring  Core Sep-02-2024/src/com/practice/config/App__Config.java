package com.practice.config;

import java.time.LocalTime;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.Beans.Seasons;

@Configuration
@ComponentScan(basePackages="com.practice")
public class App__Config

{
	
	@Bean(name="lTime")
	public LocalTime seasons()
	{
		return LocalTime.now();
	}
	

}
