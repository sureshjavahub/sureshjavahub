package com.practice.DAO;

public class Constants 
{
public final static String SELECT_ALL="select * from student";
public final static String INSERT="insert into student values (?,?,?)";
public final static String DELETE="delete from student where id=?";
public final static String SELECT="select * from student where id=?";
public final static String UPDATE="update student set name=?,fee=? where id=?";
}
