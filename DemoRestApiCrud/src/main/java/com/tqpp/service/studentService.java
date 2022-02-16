package com.tqpp.service;

import java.util.List;

import com.tqpp.Model.Student;

public interface studentService
{
	
    boolean insertStudent(Student s);
	
	boolean deleteStudent (Student s);
	
	boolean updateStudent(Student s);
	
    List<Student>getAllStudents();
    
    Student getStudentById(int id);

}
 