package com.practice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee

{
	private Integer id;
	private String name;
	private String address;
	private Double sal;
	

}
