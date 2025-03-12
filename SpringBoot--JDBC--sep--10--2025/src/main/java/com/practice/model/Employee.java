package com.practice.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee 
{
private Integer id;
public Employee(String name, String address, Double sal) {
	super();
	this.name = name;
	this.address = address;
	this.sal = sal;
}
private String name;
private String address;
private Double sal;
}
