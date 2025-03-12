package com.practice.model.Beans;

import org.hibernate.validator.constraints.NotEmpty;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee 

{
private Integer id;
@NotEmpty
@Size(min=2,max=50)
private String name;
@NotEmpty
@Size(min=10,max=50)
private String address;
@Positive
@Max(value = 20000 )
private Double sal;

}
