package com.practice.DAO;

import java.util.List;

import com.practice.Beans.Student;

public interface Student__DAO 
{
List<Student> get_All_Student();
Integer save_Student(Student st);
}
