package com.practice.model.DAOs;

public class Constants
{
public static final String INSERT= "insert into employee (name, address, sal) values (?,?,?)";
public static final String GET_ALL="select * from Employee";
public static final String GET_ONE="select * from employee where id=?";
public static final String UPDATE="update employee set name=?,address=?,sal=? where id=?";
public static final String DELETE="delete from employee where id=?";


}
