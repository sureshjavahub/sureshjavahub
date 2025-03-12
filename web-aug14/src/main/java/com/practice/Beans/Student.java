package com.practice.Beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student 
{

public Student(String name, Float fee) {
		super();
		this.name = name;
		this.fee = fee;
	}
private Integer id;
private String name;
private Float fee;

}
